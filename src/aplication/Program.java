package aplication;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            SellerDao sellerDao = DaoFactory.createSellerDao();
            System.out.println("=== TEST 1: seller findById ====\n");
            Seller seller = sellerDao.findById(7);
            System.out.println(seller);

            System.out.println();

            System.out.println("=== TEST 2: seller findByDepartment ====\n");
            Department department = new Department(2, null);
            List<Seller>list = sellerDao.findByDepartment(department);
            
            for (Seller objSeller : list) {
                System.out.println(objSeller);
                System.out.println();
            }

            System.out.println("=== TEST 3: seller findAll ====\n");
            list = sellerDao.findAll();
            for (Seller obj : list) {
                System.out.println(obj);
                System.out.println("");
            }

            System.out.println("=== TEST 4: seller insert ====\n");
            list = sellerDao.findAll();
            Seller newSeller = new Seller(null, "Milene", "Milene@gmail.com", new Date(), 15000.0, department);
            sellerDao.insert(newSeller);
            System.out.println("Inserted! New id = " + newSeller.getId());

            System.out.println("=== TEST 5: seller update ====\n");
            seller = sellerDao.findById(1);
            seller.setName("Matitos");
            sellerDao.update(seller);
            System.out.println("Update Completed");


            System.out.println("=== TEST 6: seller delete ====\n");
            System.out.println("Enter id for delete test: ");
            int id = sc.nextInt();
            sellerDao.deleteById(id);
            System.out.println("Delete completed");
            sc.close();

        }
}

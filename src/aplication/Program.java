package aplication;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
    public static void main(String[] args) {

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
        }
}

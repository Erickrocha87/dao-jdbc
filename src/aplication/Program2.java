package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Department> listDep = new ArrayList<>();
        System.out.println("=== TEST 1: Department insert ====\n");
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao(); //criando o DAO de department

        System.out.println("Enter department name: ");
        String name = sc.nextLine();
        Department dep = new Department(null, name);

        departmentDao.insert(dep);
        System.out.println("Inserted! New id = " + dep.getId());


        System.out.println("\n=== TEST 2: Department update ====\n");
        dep.setName("testupdate");
        departmentDao.update(dep);
        System.out.println("Update completed");

        
        System.out.println("\n=== TEST 3: Department delete ====\n");
        System.out.print("Enter id: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete success!");

        System.out.println("\n=== TEST 4: Department findById ====\n");
        System.out.println("Enter id: ");
        int id2 = sc.nextInt();
        Department depart = departmentDao.findById(id2);
        System.out.println(depart);
        
        System.out.println("\n=== TEST 5: Department findAll ====\n");
        listDep = departmentDao.findAll();
        for (Department department : listDep) {
            System.out.println(department);
        }
        
    }   
}
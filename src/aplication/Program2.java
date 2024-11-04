package aplication;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== TEST 1: Department insert ====\n");
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao(); //criando o DAO de department

        System.out.println("Enter department name: ");
        String name = sc.nextLine();
        Department dep = new Department(null, name);
        
        departmentDao.insert(dep);
        System.out.println("Inserted! New id = " + dep.getId());
    }   
}
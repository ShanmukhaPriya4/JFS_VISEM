package com.example.main;

import org.hibernate.Session;

import com.example.entity.Department;
import com.example.entity.Employee;
import com.example.util.HibernateUtil;

import java.util.List;      
import java.util.ArrayList; 

public class MainApp {

    public static void main(String[] args) {

        Session session = HibernateUtil.getFactory().openSession();

        Department dept = new Department();
        dept.setName("CSE");

        Employee e1 = new Employee();
        e1.setName("Anudeep KV");

        Employee e2 = new Employee();
        e2.setName("Anil Ravipudi");

        // set department
        e1.setDepartment(dept);
        e2.setDepartment(dept);

        // create employee list
        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);

        dept.setEmployees(empList);

        session.beginTransaction();
        session.persist(dept);
        session.getTransaction().commit();

        session.close();
    }
}

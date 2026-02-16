package com.skillnext1;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SessionFactory factory = HibernateUtil.getSessionFactory();

        while (true) {
            System.out.println("\n===== STUDENT MENU =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    Session session = factory.openSession();
                    Transaction tx = session.beginTransaction();

                    Student s = new Student();

                    System.out.print("Enter Name: ");
                    sc.nextLine();
                    s.setName(sc.nextLine());

                    System.out.print("Enter Age: ");
                    s.setAge(sc.nextInt());

                    System.out.print("Enter Course: ");
                    sc.nextLine();
                    s.setCourse(sc.nextLine());

                    session.save(s);
                    tx.commit();
                    session.close();

                    System.out.println(" Student Added Successfully!");
                    break;

                case 2:
                    Session s2 = factory.openSession();
                    List<Student> list =
                            s2.createQuery("from Student", Student.class).list();

                    System.out.println("\nID  NAME  AGE  COURSE");
                    for (Student st : list) {
                        System.out.println(
                                st.getId() + "  " +
                                st.getName() + "  " +
                                st.getAge() + "  " +
                                st.getCourse()
                        );
                    }
                    s2.close();
                    break;

                case 3:
                    factory.close();
                    sc.close();
                    System.out.println(" Application Closed");
                    System.exit(0);

                default:
                    System.out.println(" Invalid Choice");
            }
        }
    }
}

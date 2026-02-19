package com.skillnext1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmployeeDAO {

    private static final String URL =
            "jdbc:mysql://localhost:3306/skillnext1_db";
    private static final String USER = "root";
    private static final String PASSWORD = "PRISCILLA2006"; // change if needed

    // ✅ THIS METHOD MUST EXIST
    public boolean save(Employee emp) {

        boolean status = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

            String sql =
                "INSERT INTO employee(name, email, salary) VALUES (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, emp.getName());
            ps.setString(2, emp.getEmail());
            ps.setDouble(3, emp.getSalary());

            int rows = ps.executeUpdate();

            status = rows > 0;

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace(); // 🔥 do NOT remove
        }

        return status;
    }
}

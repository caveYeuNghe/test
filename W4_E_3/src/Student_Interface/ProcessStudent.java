/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student_Interface;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.text.html.HTML;
import javax.swing.tree.RowMapper;

/**
 *
 * @author Tom
 */
public class ProcessStudent implements IStudent {

    @Override
    public void delete(String ClassID, double Mark) {
        Connection connection = (Connection) getConnection();
        if (connection != null) {
            System.out.println("Connection sucess");
            String sql = "delete from student where ClassID = ? and mark = ?";
            try {
                PreparedStatement ps = connection.prepareStatement(sql);
                ps.setString(1, ClassID);
                ps.setDouble(2, Mark);
                ps.executeUpdate();
                System.out.println("Sucess");
                connection.close();
            } catch (Exception e) {

            }
        } else {
            System.out.println("Connection fail");
        }
    }

    @Override
    public Connection getConnection() {
        Connection cn = null;
        String url = "jdbc:mysql://localhost:3306/DBStudent3";
        String user = "root";
        String password = "meo12345";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cn;
    }

    @Override
    public ArrayList<Student> getList() {
        Connection connection = getConnection();
        String sql = "select * from student";
        ArrayList<Student> students = new ArrayList<Student>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Student s = new Student();
                s.setId(rs.getString("ID"));
                s.setName(rs.getString("Name"));
                s.setGender(rs.getBoolean("Gender"));
                s.setClassID(rs.getString("ClassID"));
                s.setMark(rs.getDouble("Mark"));
                students.add(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

    @Override
    public Student getStudent_byID(String id) {
        Student s = new Student();
        try {
            Connection connection = getConnection();
            String sql = "select * from student  where id like ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                s.setId(rs.getString("ID"));
                s.setName(rs.getString("Name"));
                s.setGender(rs.getBoolean("Gender"));
                s.setClassID(rs.getString("ClassID"));
                s.setMark(rs.getDouble("Mark"));
                return s;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return s;
    }

    @Override
    public void update(String ID, String name, String classID, boolean Gender, double mark) {
        Connection connection = getConnection();
        String sql = "update student set name = ?, classID = ?, gender = ?, mark = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, classID);
            ps.setBoolean(3, Gender);
            ps.setDouble(4, mark);
            ps.executeUpdate();
            connection.close();
            System.out.println("Update Sucess");
        } catch (Exception e) {
            System.out.println("Update Fail");
        }
    }

}

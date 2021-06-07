/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student_Interface;

import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Tom
 */
public interface IStudent {

    void delete(String ClassID, double Mark);

    public Connection getConnection();

    public ArrayList<Student> getList();

    public Student getStudent_byID(String id);

    void update(String ID, String name, String classID, boolean Gender, double mark);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;
import java.sql.SQLException;

/**
 *
 * @author Tom
 */
public interface IFiction {
    void addFiction(Fiction f) throws SQLException;
    void getMax();
    void printMax();
}

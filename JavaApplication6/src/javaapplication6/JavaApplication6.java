/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tom
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MyFiction mf = new MyFiction(n);
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("ID: ");
            String id = sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Publisher: ");
            String p = sc.nextLine();
            System.out.println("Year");
            int y = sc.nextInt();
            sc.nextLine();
            System.out.println("Price");
            int price = sc.nextInt();
            sc.nextLine();
            Book book = new Fiction(id, name, p, y, price);
            mf.addFiction((Fiction) book);
        }
        mf.printMax();
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tom
 */
public class MyFiction implements IFiction {

    ArrayList<Fiction> fs = new ArrayList<>();

    @Override
    public void addFiction(Fiction f) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            for (int i = 0; i < fs.size(); i++) {
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
                double price = sc.nextDouble();
                Book book = new Fiction(y, price, id, name, p);
                fs.add((Fiction) book);
            }
        }
    }

    @Override
    public void getMax() {
        ArrayList<Fiction> fs = new ArrayList<>();
        Fiction max = fs.get(0);
        for (int i = 0; i < fs.size(); i++) {
            if (max.getPrice() < fs.get(i).getPrice()) {
                max = fs.get(i);
            }
        }

    }

    @Override
    public void printMax() {
        getMax();
        for (Fiction f : fs) {
            System.out.println(f.toString());
        }
    }

}

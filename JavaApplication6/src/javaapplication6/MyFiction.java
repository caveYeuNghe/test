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
public class MyFiction implements IFiction {

    ArrayList<Fiction> flist = new ArrayList<>();

    @Override
    public void addFiction(Fiction f) {
        flist.add(f);
    }
    Fiction max = flist.get(0);

    @Override
    public void getMax() {

        for (int i = 0; i < flist.size(); i++) {
            if (max.getPrice() < flist.get(i).getPrice()) {
                max = flist.get(i);
            }
        }

    }

    @Override
    public void printMax() {
        Fiction max = flist.get(0);
        for (int i = 0; i < flist.size(); i++) {
            if (max.getPrice() < flist.get(i).getPrice()) {
                max = flist.get(i);
            }
        }
        System.out.println(max.toString());
    }

}

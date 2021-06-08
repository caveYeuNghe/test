/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Predicate;

/**
 *
 * @author Tom
 */
public class MyFiction implements IFiction {

//    ArrayList<Fiction> flist = new ArrayList<>(); ko chơi kiểu này anh ơi
    private ArrayList<Fiction> flist;

    public MyFiction(int n) {
        this.flist = new ArrayList<>(n);
    }

    @Override
    public void addFiction(Fiction f) {
        flist.add(f);
    }

//    Fiction max = flist.get(0);   con cặc gì đây

    @Override
    public int getMax() {   // đè bài bảo lấy giá tiền cao nhất

//        for (int i = 0; i < flist.size(); i++) {
//            if (max.getPrice() < flist.get(i).getPrice()) {
//                max = flist.get(i);
//            }
//        }
        int max = flist.stream().max(Comparator.comparingInt(Fiction::getPrice)).get().getPrice();

        return max;
    }

    @Override
    public void printMax() {    // đề bài bảo in ra những quyển sách có giá cao
//        Fiction max = flist.get(0);
//        for (int i = 0; i < flist.size(); i++) {
//            if (max.getPrice() < flist.get(i).getPrice()) {
//                max = flist.get(i);
//            }
//        }
//        System.out.println(max.toString());
        // testing
        //he

        int max = getMax();
        flist.stream().filter(fiction -> {
            if (fiction.getPrice() == max)
                return true;
            return false;
        }).forEach(System.out::println);
    }

}

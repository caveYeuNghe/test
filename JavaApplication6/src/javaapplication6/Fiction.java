/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author Tom
 */
public class Fiction extends Book {

    int year;
    double price;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Fiction(int year, double price, String ID, String Name, String Publisher) {
        super(ID, Name, Publisher);
        this.year = year;
        this.price = price;
    }

    public Fiction(String ID, String Name, String Publisher) {
        super(ID, Name, Publisher);
    }

    public double Total() {
        double total = 0;
        if (year > 2000 && year < 2010) {
            total = price * 0.8;
        } else {
            total = price;
        }
        return total;
    }

    @Override
    public String toString() {
        String result = "";
        result = ID + "\t" + Name + "\t" + Publisher + "\t" + price + "\t" + year + Total();
        return result;
    }

}

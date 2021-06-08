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

    private int year;   // mẹ mày cho mấy cái thuộc tính private hộ cái
    private int price;  // double cái lồn

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Fiction(String ID, String Name, String Publisher, int year, int price) {
        super(ID, Name, Publisher);
        this.year = year;
        this.price = price;
    }

    // con cặc gì đây
//    public Fiction(String ID, String Name, String Publisher) {
//        super(ID, Name, Publisher);
//    }

    public Fiction() {  //đề bài yêu cầu implicit constructor nữa thằng ngu
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
        result = super.getID() + "\t" + super.getName() + "\t" + super.getPublisher() + "\t" + price + "\t" + year + Total();
        return result;
    }

}

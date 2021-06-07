/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1;

/**
 *
 * @author Tom
 */
public class Book {
     String ID, Name, Publisher, Genre;
    Double price;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Book(String ID, String Name, String Publisher, String Genre, Double price) {
        this.ID = ID;
        this.Name = Name;
        this.Publisher = Publisher;
        this.Genre = Genre;
        this.price = price;
    }

    public Book() {
    }

    public double discount() {
        double discount = 0;
        if (Publisher.equals("Kim Dong")) {
            discount = price * 0.3;
        }
        return discount;
    }

    public String toString() {
        String result = "";
        result = ID + "\t" + Name + "\t" + Publisher + "\t" + Genre + "\t" + price + "\t" + discount();
        return result;
    }
}

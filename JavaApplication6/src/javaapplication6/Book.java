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
public class Book {
    private String ID, Name, Publisher;

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

    public Book(String ID, String Name, String Publisher) {
        this.ID = ID;
        this.Name = Name;
        this.Publisher = Publisher;
    }

    public Book() {    //đề bài yêu cầu implicit constructor nữa thằng ngu, thầy m ngu tiếng anh vl
    }
}

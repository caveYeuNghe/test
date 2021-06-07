/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student_Interface;

/**
 *
 * @author Tom
 */
public class Student {
    String id, name, classID, rank;
    boolean gender;
    double mark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getRank() {
        String rank = "";   
        if(mark > 9)
            rank = "Xuat xac";
        if(mark <=9 && mark > 8)
            rank = "Gioi";
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Student() {
    }

    public Student(String id, String name, String classID, boolean gender, double mark, String rank) {
        this.id = id;
        this.name = name;
        this.classID = classID;
        this.gender = gender;
        this.mark = mark;
        this.rank = rank;
    }
}

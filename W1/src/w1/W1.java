/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Tom
 */
public class W1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("ID");
            String id = sc.nextLine();
            System.out.println("name");
            String name = sc.nextLine();
            System.out.println("Publisher");
            String publisher = sc.nextLine();
            System.out.println("Genre");
            String genre = sc.nextLine();
            System.out.println("Price");
            double price = sc.nextDouble();
            sc.nextLine();
            Book book = new Book(id, name, publisher, genre, price);
            books.add(book);
        }
        for (int i = 0; i < 1; i++) {
            System.out.println(books.toString());
        }
//       
//        Collections.sort(books, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                Double x1 = ((Book) o1).getPrice();
//                Double x2 = ((Book) o2).getPrice();
//                return x2.compareTo(x1);
//                
//            }

//        });
//        for (Book b : books) {
//            System.out.println(b.toString());
////        }
//        Collections.sort(books, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                Double x1 = ((Book) o1).getPrice();
//                Double x2 = ((Book) o2).getPrice();
//                return x2.compareTo(x1);
//            }
//        });
//
//        books.sort((book, t1) -> (int) (book.getPrice() - t1.getPrice()));
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (books.get(i).getPrice() > books.get(j).getPrice()) {
                    Book tmp = books.get(i);
                    books.set(i, books.get(j));
                    books.set(j, tmp);
                } else if (books.get(i).getPrice() == books.get(j).getPrice()) {
                    if ((books.get(i).getName().compareTo(books.get(j).getName()) > 0)) {
                        Book tmp = books.get(i);
                        books.set(i, books.get(j));
                        books.set(j, tmp);
                    }
                }

            }

        }

        for (Book b : books) {
            System.out.println(b.toString());
        }
//        String hello = "hjahjadkhdjk13212312";
//    for(int i = 0; i < hello.length(); i++)
//    {
//       if(Character.isDigit(hello.charAt(i)))
//       {
//          
//       }
//    }
    }

}

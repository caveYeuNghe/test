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
//        for (int i = 0; i < n + 1; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (books.get(i).getPrice() > books.get(j).getPrice()) {
//                    Book temp = books.get(i);
//                    books.get(i) = books.get(j);
//                }
//
//            }
        Collections.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Double x1 = ((Book) o1).getPrice();
                Double x2 = ((Book) o2).getPrice();
                return x2.compareTo(x1);
            }
        });

        books.sort((book, t1) -> (int)(book.getPrice() - t1.getPrice()));

        for (int i = 0; i < n -1; ++i) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (books.get(i).getPrice() < books.get(min_idx).getPrice())
                    min_idx = i;
            Book tmp = books.get(i);
            books.set(i, books.get(min_idx));
            books.set(min_idx, tmp);
        }

        for (Book b : books)
        {
            System.out.println(b.toString());
        }
    }
}

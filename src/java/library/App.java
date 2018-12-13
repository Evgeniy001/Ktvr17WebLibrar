/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import entity.Book;
import entity.LibHistory;
import entity.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    private List<LibHistory>libHistories = new ArrayList<>();
    private List<Book> books = new ArrayList<>();
    private List<Reader> readers= new ArrayList<>();
    public void run(){
        String repeat = "r";
        Scanner scanner = new Scanner (System.in);
        int task;
        do{
            System.out.println("Выберите действие:");
            System.out.println("0 - выход из программы");
            System.out.println("1 - добавить книгу в библиотеку");
            System.out.println("2 - добавить нового читателя");
            System.out.println("3 - выдать книгу читателю");
            System.out.println("4 - возврат книги");
            System.out.println("5 - история работы библиотеки");
            
            task = scanner.nextInt();
            switch (task) {
                case 0:
                    repeat="q";
                    break;
                case 1:
                    BookCreator bookCreator = new BookCreator();
                    books.add(bookCreator.returnNewBook());
                    break;
                case 2:
                    ReaderCreator readerCreator = new ReaderCreator();
                    readers.add(readerCreator.returnNewReader());
                    break;
                case 3:
                    LibHistoryCreator libHistoryCreator = new LibHistoryCreator();
                    libHistories.add(libHistoryCreator.returnNewLibHistory(books, readers));
                    break;
                case 4:
                    BookReturner bookReturner = new BookReturner ();
                    ///**************************************
                default:
                    System.out.println("Выберите одно из действий");
            }
        }while("r".equals(repeat));
    }
}

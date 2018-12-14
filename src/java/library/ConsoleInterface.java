/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import entity.Book;
import entity.LibHistory;
import entity.Reader;
import interfaces.Manageable;
import java.util.List;

/**
 *
 * @author pupil
 */
public class ConsoleInterface implements Manageable{
    
    

    @Override
    public Book createBook() {
        BookCreator bookCreator = new BookCreator();
        return bookCreator.returnNewBook();
    }

    @Override
    public Reader createReader() {
        ReaderCreator readerCreator = new ReaderCreator();
        return readerCreator.returnNewReader();
    }

    @Override
    public LibHistory issueBook(List<Book> books, List<Reader> readers) {
        LibHistoryCreator libHistoryCreator = new LibHistoryCreator();
        return libHistoryCreator.returnNewLibHistory(books, readers);
    }

    @Override
    public boolean returnBook(List<LibHistory> libHistories) {
        BookReturner bookReturner = new BookReturner();
        return bookReturner.returnLibHistory(libHistories);
    }

    @Override
    public void returnHistory(List<LibHistory> libHistories) {
       HistoryReturner historyReturner = new HistoryReturner();
       historyReturner.printListWhoTookBooks(libHistories);
    }
}

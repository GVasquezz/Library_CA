
package library_ca1;

import Model.Readers;
import Model.Books;
import Utilities.BookDataInterface;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Francisco + Gonzalo
 */
public class DataBook  implements BookDataInterface{
    

    @Override
    public ArrayList<Books> loadBookDataFile() throws FileNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public ArrayList<Readers> loadReaders() throws FileNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void getBookTitle(ArrayList<Books> book, String title) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void getBookAuthor(ArrayList<Books> book, String author) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void sortBooksByTitle(ArrayList<Books> books) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void sortBooksByAuthor(ArrayList<Books> books) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void getReaderName(ArrayList<Readers> reader, String name) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void getReaderId(ArrayList<Readers> reader, int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void sortReadersByName(ArrayList<Readers> readers) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void sortReadersById(ArrayList<Readers> readers) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void borrowBook(String[] borrows) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void returnBook(String[] returns) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void listBooksBorrowed(int id) throws FileNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

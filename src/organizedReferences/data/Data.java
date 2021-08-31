package organizedReferences.data;

import organizedReferences.ReferenceMatch;

import java.util.HashMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Data {
    SortedMap<BookName, Book> books;

    public Data() {
        books = new TreeMap<>();
    }

    public void input(ReferenceMatch match) {
        BookName bookName = match.getBookName();
        books.putIfAbsent(bookName, new Book(bookName.getBookName()));
        Book currentBook = books.get(bookName);
        currentBook.input(match);
    }

    @Override
    public String toString() {
        StringBuilder refList = new StringBuilder();
        Set<BookName> bookSet = books.keySet();
        for (BookName bookName : bookSet) {
            refList.append(books.get(bookName).toString());
        }

        return refList.toString();
    }
}

package organizedReferences.data;

import organizedReferences.ReferenceMatch;

import java.util.HashMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Data {
    SortedMap<String, Book> books;

    public Data() {
        books = new TreeMap<>();
    }

    public void input(ReferenceMatch match) {
        String bookName = match.getBookName();
        books.putIfAbsent(bookName, new Book(bookName));
        Book currentBook = books.get(bookName);
        currentBook.input(match);
    }

    @Override
    public String toString() {
        StringBuilder refList = new StringBuilder();
        Set<String> bookSet = books.keySet();
        for (String bookName : bookSet) {
            refList.append(books.get(bookName).toString());
        }

        return refList.toString();
    }
}

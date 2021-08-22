package organizedReferences.data;

import organizedReferences.ReferenceMatch;

import java.util.SortedMap;

public class Data {
    SortedMap<String, Book> books;

    public Data() {
    }

    public void input(ReferenceMatch match) {
        String bookName = match.getBookName();
        books.putIfAbsent(bookName, new Book(bookName));
        Book currentBook = books.get(bookName);
        currentBook.input(match);
    }
}

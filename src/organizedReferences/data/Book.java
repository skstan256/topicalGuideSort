package organizedReferences.data;

import java.util.SortedMap;

public class Book implements Comparable<Book>{
    private SortedMap<Integer, Chapter> chapters;
    private String bookName;

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Reference)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        Book book = (Book) obj;

        return bookName.equals(book.bookName) && chapters.equals(book.chapters);
    }

    @Override
    public int compareTo(Book o) {
        return 0;
    }
}

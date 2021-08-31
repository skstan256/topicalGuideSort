package organizedReferences;

import organizedReferences.data.BookName;

public class ReferenceMatch {
    String entryTitle;
    String bookName;
    int chapter;
    String firstChapterVerses; //optional
    int secondChapter; //optional
    String verses; //always there

    public void setEntryTitle(String entryTitle) {
        this.entryTitle = entryTitle;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setChapter(int chapter) {
        this.chapter = chapter;
    }

    public void setFirstChapterVerses(String firstChapterVerses) {
        this.firstChapterVerses = firstChapterVerses;
    }

    public void setSecondChapter(int secondChapter) {
        this.secondChapter = secondChapter;
    }

    public void setVerses(String verses) {
        this.verses = verses;
    }

    public String getEntryTitle() {
        return entryTitle;
    }

    public BookName getBookName() {
        return new BookName(bookName);
    }

    public int getChapter() {
        return chapter;
    }

    public String getFirstChapterVerses() {
        return firstChapterVerses;
    }

    public int getSecondChapter() {
        return secondChapter;
    }

    public String getVerses() {
        return verses;
    }
}
/*
Current: [\( ]?(?<bookName>\d? *?[a-zA-Z.&]+)? ?(?<chapter>[\d]+):((?<firstChapterVerses>[,\d ]+)(-|\–)(?<secondChapter>[\d]+):)?(?<verses>[,\d \–-]+)[; ]?+
^(?<entry>Jesus Christ[a-zA-z ,]*)$

 */

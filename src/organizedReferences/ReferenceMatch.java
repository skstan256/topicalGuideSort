package organizedReferences;

public class ReferenceMatch {
    String bookName;
    int firstChapter;
    String firstChapterVerses; //optional
    int secondChapter; //optional
    String verses; //always there
}
/*
Current: [\( ]?(?<bookName>\d? *?[a-zA-Z.&]+)? ?(?<chapter>[\d]+):((?<firstChapterVerses>[,\d ]+)(-|\–)(?<secondChapter>[\d]+):)?(?<verses>[,\d \–-]+)[; ]?+
^(?<entry>Jesus Christ[a-zA-z ,]*)$

 */

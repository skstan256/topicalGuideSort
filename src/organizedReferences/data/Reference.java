package organizedReferences.data;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reference implements Comparable<Reference> {
    private String verses;
    private String entry;

    public Reference(String verses, String entry) {
        this.verses = verses;
        this.entry = entry;
    }

    public String getVerses() {
        return verses;
    }

    public String getEntry() {
        return entry;
    }

    public void appendEntry(String newEntry) {
        entry = entry + "; " + newEntry;
    }

    @Override
    public boolean equals(Object o) {

        if (!(o instanceof Reference)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        Reference ref = (Reference) o;

        // Compare the data members and return accordingly
        return verses.equals(ref.verses) && entry.equals(ref.entry);
    }


    @Override
    public int compareTo(Reference o) {
        if (!verses.equals(o.verses)) {
            /*
            Matcher matcher = Pattern.compile("\\d+").matcher(s);
matcher.find();
int i = Integer.valueOf(matcher.group());
             */

            Matcher matcher = Pattern.compile("\\d+").matcher(verses);
            matcher.find();
            int firstNum = Integer.parseInt(matcher.group());

            Matcher oMatcher = Pattern.compile("\\d+").matcher(o.verses);
            oMatcher.find();
            int oFirstNum = Integer.parseInt(oMatcher.group());
            return Integer.compare(firstNum, oFirstNum);
        } else {
            return entry.compareTo(o.entry);
        }
    }

    @Override
    public String toString() {
        return verses.trim() + ", " + entry + "\n";
    }
}

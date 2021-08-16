package organizedReferences.data;

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
            return verses.compareTo(o.verses);
        } else {
            return entry.compareTo(o.entry);
        }
    }

    @Override
    public String toString() {
        return verses + ", " + entry;
    }
}

package organizedReferences.data;

import java.util.HashMap;
import java.util.Map;

public class BookName implements Comparable<BookName> {

    private String bookName;

    public BookName(String bookName) {
        this.bookName = bookName;
    }

    private static Map<String, Integer> bookOrder;
    static {
        bookOrder = new HashMap<>();

        bookOrder.put("Gen.", 1);
        bookOrder.put("Ex.", 2);
        bookOrder.put("Lev.", 3);
        bookOrder.put("Num.", 4);
        bookOrder.put("Deut.", 5);
        bookOrder.put("Josh.", 6);
        bookOrder.put("Judg.", 7);
        bookOrder.put("Ruth", 8);
        bookOrder.put("1 Sam.", 9);
        bookOrder.put("2 Sam.", 10);
        bookOrder.put("1 Kgs.", 11);
        bookOrder.put("2 Kgs.",12);
        bookOrder.put("1 Chr.",13);
        bookOrder.put("2 Chr.",14);
        bookOrder.put("Ezra",15);
        bookOrder.put("Neh.",16);
        bookOrder.put("Esth.",17);
        bookOrder.put("Job",18);
        bookOrder.put("Ps.",19);
        bookOrder.put("Prov.",20);
        bookOrder.put("Eccl.",21);
        bookOrder.put("Song",22);
        bookOrder.put("Isa.",23);
        bookOrder.put("Jer.",24);
        bookOrder.put("Lam.",25);
        bookOrder.put("Ezek.",26);
        bookOrder.put("Dan.",27);
        bookOrder.put("Hosea",28);
        bookOrder.put("Joel",29);
        bookOrder.put("Amos",30);
        bookOrder.put("Obad.",31);
        bookOrder.put("Jonah",32);
        bookOrder.put("Micah",33);
        bookOrder.put("Nahum",34);
        bookOrder.put("Hab.",35);
        bookOrder.put("Zeph.",36);
        bookOrder.put("Hag.",37);
        bookOrder.put("Zech.",38);
        bookOrder.put("Mal.",39);

        bookOrder.put("Matt.",40);
        bookOrder.put("Mark",41);
        bookOrder.put("Luke",42);
        bookOrder.put("John",43);
        bookOrder.put("Acts",44);
        bookOrder.put("Rom.",45);
        bookOrder.put("1 Cor.",46);
        bookOrder.put("2 Cor.",47);
        bookOrder.put("Gal.",48);
        bookOrder.put("Eph.",49);
        bookOrder.put("Philip.",50);
        bookOrder.put("Col.",51);
        bookOrder.put("1 Thes.",52);
        bookOrder.put("2 Thes.",53);
        bookOrder.put("1 Tim.",54);
        bookOrder.put("2 Tim.",55);
        bookOrder.put("Titus",56);
        bookOrder.put("Philem.",57);
        bookOrder.put("Heb.",58);
        bookOrder.put("James",59);
        bookOrder.put("1 Pet.",60);
        bookOrder.put("2 Pet.",61);
        bookOrder.put("1 Jn.",62);
        bookOrder.put("2 Jn.",63);
        bookOrder.put("3 Jn.",64);
        bookOrder.put("Jude",65);
        bookOrder.put("Rev.",66);

        bookOrder.put("1 Ne.",67);
        bookOrder.put("2 Ne.",68);
        bookOrder.put("Jacob",69);
        bookOrder.put("Enos",70);
        bookOrder.put("Jarom",71);
        bookOrder.put("Omni",72);
        bookOrder.put("W of M",73);
        bookOrder.put("Mosiah",74);
        bookOrder.put("Alma",75);
        bookOrder.put("Hel.",76);
        bookOrder.put("3 Ne.",77);
        bookOrder.put("4 Ne.",78);
        bookOrder.put("Morm.",79);
        bookOrder.put("Ether",80);
        bookOrder.put("Moro.",81);

        bookOrder.put("D&C",82);
        bookOrder.put("OD",83);
        bookOrder.put("Moses",84);
        bookOrder.put("Abr.",85);
        bookOrder.put("JS—M",86);
        bookOrder.put("JS—H",87);
        bookOrder.put("F",88);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Reference)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        BookName book = (BookName) obj;

        return bookName.equals(book.bookName);
    }


    public String getBookName() {
        return bookName;
    }

    @Override
    public int compareTo(BookName o) {
        int nameOrder = bookOrder.getOrDefault(bookName, 0);
        int secondNameOrder = bookOrder.getOrDefault(o.bookName, 0);
        return Integer.compare(nameOrder, secondNameOrder);
    }
}

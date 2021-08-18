package organizedReferences;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

public class Organizer {

    private String currentEntry;
    private String currentBook;
    private final Pattern entryPattern = Pattern.compile("^(?<entry>Jesus Christ[a-zA-z ,]*)$",Pattern.MULTILINE);
    private ArrayList<String> entryTitles;
    private ArrayList<String> entryBodies;
    private ArrayList<Integer> startingEntryIndices;
    private final Pattern referencePattern = Pattern.compile("[\\( ]?(?<bookName>\\d? *?[a-zA-Z.&—\\–-]+)? ?(?<chapter>[\\d]+):((?<firstChapterVerses>[,\\d ]+)(-|\\–)(?<secondChapter>[\\d]+):)?(?<verses>[,\\d \\–-]+)[; ]?+");


    public static void main(String[] args) throws FileNotFoundException, FileEmptyException {
        File file = new File(args[0]);
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter("\\Z");
        String data;
        if (scanner.hasNext()) {
            data = scanner.next();
            Organizer organizer = new Organizer();
            organizer.organize(data);
            //System.out.println(data);
        }
        else {
            throw new FileEmptyException();
        }


    }

    public void organize(String data) {
        Matcher entryMatcher = entryPattern.matcher(data);
        //System.out.println(data);

        //get a collection of all entry matches
        entryTitles = new ArrayList<>();
        entryBodies = new ArrayList<>();
        startingEntryIndices = new ArrayList<>();
        while (entryMatcher.find()) {
            entryTitles.add(entryMatcher.group("entry"));
            startingEntryIndices.add(entryMatcher.start());
        }

        //make a collection of all entry chunks
        for (int i = 0, k = 1; i < startingEntryIndices.size(); ++i, ++k) {
            //if not the last entry, add from start to the start of the next starting index
            if (k < startingEntryIndices.size()) {
                entryBodies.add(data.substring(startingEntryIndices.get(i), startingEntryIndices.get(k)));
            }
            //if last, add from this one to the end of the string
            else {
                entryBodies.add(data.substring(startingEntryIndices.get(i)));
            }
        }

        System.out.println("Test");
        for (String entry: entryBodies) {
            System.out.println(entry);
            System.out.println("END ENTRY ********************************");
        }

        //go through each entry and find all reference matches
        for (String entry : entryBodies) {
            Matcher referenceMatcher = referencePattern.matcher(entry);
            while (referenceMatcher.find()) {

            }

        }


    }

    /*
[\( ]?(?<bookName>\d? *?[a-zA-Z.&—\–-]+)? ?(?<chapter>[\d]+):((?<firstChapterVerses>[,\d ]+)(-|\–)(?<secondChapter>[\d]+):)?(?<verses>[,\d \–-]+)[; ]?+

^(?<entry>Jesus Christ[a-zA-z ,]*)$

[\( ]?(?<bookName>\d? *?[a-zA-Z.&]+)? (?<chapter>[\d]+):(?<verses>[,\d \–]+)[; ]?+

     */
}

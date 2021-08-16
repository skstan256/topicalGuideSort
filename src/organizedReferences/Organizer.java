package organizedReferences;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.*;

public class Organizer {

    private String currentEntry;
    private String currentBook;

    public static void main(String[] args) throws FileNotFoundException, FileEmptyException {
        File file = new File(args[0]);
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter("\\Z");
        String data;
        if (scanner.hasNext()) {
            data = scanner.next();
            //System.out.println(data);
        }
        else {
            throw new FileEmptyException();
        }

        Organizer organizer = new Organizer();
    }

    public void organize(String data) {

    }
}

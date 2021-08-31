package organizedReferences.data;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Chapter {
    private int chapterNum;
    private Set<Reference> references;

    public Chapter(int chapterNum) {
        references = new TreeSet<>();
        this.chapterNum = chapterNum;
    }

    public void input(Reference reference) {
        references.add(reference);
    }

    @Override
    public String toString() {
         StringBuilder chapter = new StringBuilder("\t" + chapterNum + ":");
         if (references.size() > 1) {
             chapter.append("\n");
             for (Reference ref: references) {
                 chapter.append("\t\t").append(ref.toString());
             }
         }
         else {
             for (Reference ref: references) {
                 chapter.append(ref.toString());
             }
         }

         return chapter.toString();
    }
}

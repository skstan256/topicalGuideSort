package organizedReferences.data;

import java.util.HashSet;
import java.util.Set;

public class Chapter {
    private int chapterNum;
    private Set<Reference> references;

    public Chapter(int chapterNum) {
        references = new HashSet<>();
        this.chapterNum = chapterNum;
    }

    public void input(Reference reference) {
        references.add(reference);
    }

    @Override
    public String toString() {
         StringBuilder chapter = new StringBuilder("\t" + chapterNum + ":\n");
         for (Reference ref: references) {
             chapter.append("\t\t").append(ref.toString());
         }
         return chapter.toString();
    }
}

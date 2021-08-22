package organizedReferences.data;

import java.util.Set;

public class Chapter {
    private int chapterNum;
    private Set<Reference> references;

    public void input(Reference reference) {
        references.add(reference);
    }

    @Override
    public String toString() {
         StringBuilder chapter = new StringBuilder(chapterNum + ":\n");
         for (Reference ref: references) {
             chapter.append("\t\t").append(ref.toString());
         }
         return chapter.toString();
    }
}

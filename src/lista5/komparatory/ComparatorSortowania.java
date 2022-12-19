package lista5.komparatory;

import lista5.Osoba;

import java.util.Comparator;

public interface ComparatorSortowania extends Comparator<Osoba> {
    public int compare(Osoba o1, Osoba o2);
}


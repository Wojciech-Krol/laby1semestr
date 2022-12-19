package lista5.komparatory;

import lista5.Osoba;

import java.util.Comparator;

public class ComparatorNazwisko implements ComparatorSortowania {
    @Override
    public int compare(Osoba o1, Osoba o2) {
        return o1.getNazwisko().compareTo(o2.getNazwisko());
    }
}

package lista5.komparatory;

import lista5.Osoba;

import java.util.Comparator;

public class ComparatorNazwiskoImie implements ComparatorSortowania{
    @Override
        public int compare(Osoba p1, Osoba p2) {
            if(p1.getNazwisko().compareTo(p2.getNazwisko())==0){
                return p1.getImie().compareTo(p2.getImie());
            }
            else{
                return p1.getNazwisko().compareTo(p2.getNazwisko());
            }
        }
}

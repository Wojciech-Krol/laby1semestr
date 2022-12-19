package lista5.komparatory;

import lista5.Osoba;

public class ComparatorNazwiskoWiek implements ComparatorSortowania {
    @Override
    public int compare(Osoba p1, Osoba p2) {
        if(p1.getNazwisko().compareTo(p2.getNazwisko())==0){
            return p2.getWiek()-p1.getWiek();
        }
        else{
            return p1.getNazwisko().compareTo(p2.getNazwisko());
        }
    }
}

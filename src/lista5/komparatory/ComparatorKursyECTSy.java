package lista5.komparatory;

import lista5.Kurs;
import lista5.Osoba;

import java.util.Comparator;

public class ComparatorKursyECTSy implements Comparator<Kurs> {
    public int compare(Kurs kurs1, Kurs kurs2){
        if(kurs1.getECTS()==kurs2.getECTS()){
            return (kurs1.getProwadzacy().getNazwisko()).compareTo(kurs2.getProwadzacy().getNazwisko());
        }
        else{
            return kurs1.getECTS()-kurs2.getECTS();
        }
    }
}

package observer;

import java.util.ArrayList;
import java.util.List;

public class Verlag {
    List<Abonnent> abonnentenListe = new ArrayList<Abonnent>();
    public void aboHinzufuegen(Abonnent abonnent) {
        abonnentenListe.add(abonnent);
    }

    public void aboEntfernen(Abonnent abonnent) {
        abonnentenListe.remove(abonnent);
    }

    public String abosZaehlen() { return String.valueOf(abonnentenListe.size()); }
    public void verteileZeitung(Zeitung zeitung){
        for (Abonnent abonnent : abonnentenListe) {
            abonnent.erhalteZeitung(zeitung);
        }
    }
}

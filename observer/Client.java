package observer;

public class Client {
    public static void main(String[] args) {
        System.out.println("drei FAZ-Abonnenten hinzufügen...");
        FAZVerlag fazVerlag = new FAZVerlag();
        FirmaXY firmaXY = new FirmaXY();
        fazVerlag.aboHinzufuegen(firmaXY);
        fazVerlag.aboHinzufuegen(new FamilieMeier());
        fazVerlag.aboHinzufuegen(new FamilieFischer());
        System.out.println("Anzahl Abonnenten: " + fazVerlag.abosZaehlen());

        System.out.println("neue Ausgabe versenden:");
        fazVerlag.setAktuelleZeitung(new Zeitung("FAZ"));

        System.out.println();
        System.out.println("einen FAZ-Abonnenten entfernen...");
        fazVerlag.aboEntfernen(firmaXY);
        System.out.println("Anzahl Abonnenten: " + fazVerlag.abosZaehlen());
        System.out.println("neue Ausgabe versenden: ");
        fazVerlag.setAktuelleZeitung(new Zeitung("FAZ am Sonntag"));

        System.out.println();
        System.out.println("einen Zeit-Abonnenten hinzufügen...");
        ZeitVerlag zeitVerlag = new ZeitVerlag();
        zeitVerlag.aboHinzufuegen(firmaXY);
        System.out.println("Anzahl Abonnenten: " + zeitVerlag.abosZaehlen());
        System.out.println("neue Ausgabe versenden: ");
        zeitVerlag.setAktuelleZeitung(new Zeitung("Zeit"));

    }
}

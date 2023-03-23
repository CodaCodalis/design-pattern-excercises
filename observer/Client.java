package observer;

public class Client {
    public static void main(String[] args) {
        FAZVerlag fazVerlag = new FAZVerlag();
        FirmaXY firmaXY = new FirmaXY();
        fazVerlag.aboHinzufuegen(firmaXY);
        fazVerlag.aboHinzufuegen(new FamilieMeier());
        fazVerlag.aboHinzufuegen(new FamilieFischer());

        fazVerlag.setAktuelleZeitung(new Zeitung("Die Zeit"));

        fazVerlag.aboEntfernen(firmaXY);
        fazVerlag.setAktuelleZeitung(new Zeitung("Die Welt"));
    }
}

package decorator;

public class Client {
    public static void main(String[] args) {
        Gericht gericht = new Salat(new Nudeln(new Hueftsteak()));
        gericht.druckeBeschreibung();
        //Hüftsteak, Nudeln, Salat
        System.out.println(" für "+gericht.getPreis() + " Euro");
        // für 19.75 Euro

        gericht = new Suppe(gericht);
        gericht.druckeBeschreibung();
        //Hüftsteak, Nudeln, Salat, Suppe
        System.out.println(" für "+gericht.getPreis() + " Euro");
        // für 21.25 Euro

        gericht = new Hueftsteak();
        gericht.druckeBeschreibung();
        System.out.println(" für " + gericht.getPreis() + " Euro");
        // für 13.00 Euro
    }
}

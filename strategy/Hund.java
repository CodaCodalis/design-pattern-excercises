package strategy;

public abstract class Hund {
    private String art;
    private BellVerhalten bellverhalten = new LautBellen();
    private LaufVerhalten laufverhalten = new SchnellLaufen();

    public void belle() {
        bellverhalten.belle();
    }

    public void laufe() {
        laufverhalten.laufe();
    }

    public void setBellVerhalten(BellVerhalten bellverhalten) {
        this.bellverhalten = bellverhalten;
    }

    public void setLaufVerhalten(LaufVerhalten laufverhalten) {
        this.laufverhalten = laufverhalten;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public String getArt() {
        return art;
    }

    public void printArt() {
        System.out.println(art);
    }
}

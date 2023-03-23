package strategy;

public class Pudel extends Hund{
    public Pudel() {
        setArt("Pudel");
        setBellVerhalten(new LeiseBellen());
        setLaufVerhalten(new Humpeln());
    }
}

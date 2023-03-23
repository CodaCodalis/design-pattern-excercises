package strategy;

public class Husky extends Hund{
    public Husky() {
        setArt("Husky");
        setBellVerhalten(new LeiseBellen());
        setLaufVerhalten(new SchnellLaufen());
    }
}

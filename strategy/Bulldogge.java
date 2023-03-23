package strategy;

public class Bulldogge extends Hund{
public Bulldogge() {
    setArt("Bulldogge");
    setBellVerhalten(new LautBellen());
    setLaufVerhalten(new SchnellLaufen());
}
}

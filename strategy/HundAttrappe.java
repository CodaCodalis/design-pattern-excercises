package strategy;

public class HundAttrappe extends Hund{
    public HundAttrappe() {
        setArt("Hundattrappe");
        setBellVerhalten(new ElektronischBellen());
        setLaufVerhalten(new KannNichtLaufen());
    }
}

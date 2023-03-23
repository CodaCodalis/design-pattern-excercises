package strategy;

public class KannNichtLaufen implements LaufVerhalten {
    @Override
    public void laufe() {
        System.out.println("Hund kann nicht laufen.");
    }
}

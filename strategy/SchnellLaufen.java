package strategy;

public class SchnellLaufen implements LaufVerhalten {
    @Override
    public void laufe() {
        System.out.println("Hund läuft schnell.");
    }
}

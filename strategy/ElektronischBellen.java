package strategy;

public class ElektronischBellen implements BellVerhalten {
    @Override
    public void belle() {
        System.out.println("Hund bellt elektronisch.");
    }
}


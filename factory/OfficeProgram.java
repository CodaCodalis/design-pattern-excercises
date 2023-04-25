package factory;

public abstract class OfficeProgram {
    public void einpacken() {
        System.out.println(this.getClass().getSimpleName() + " eingepackt");
    }

    public void etikettieren() {
        System.out.println(this.getClass().getSimpleName() + " etikettiert");
    }

    public abstract void versenden();
}

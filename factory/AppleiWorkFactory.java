package factory;

public class AppleiWorkFactory extends SoftwareShop{
    @Override
    protected OfficeProgram createOfficeProgram(String zuHolendeApp) {
        OfficeProgram program = null;
        switch (zuHolendeApp) {
            case "Textverarbeitung" -> program = new Pages();
            case "Tabellenkalkulation" -> program = new Numbers();
            case "Präsentation" -> program = new Keynote();
            default -> System.err.println("Unbekanntes Programm: " + zuHolendeApp);
        }
        return program;
    }
}

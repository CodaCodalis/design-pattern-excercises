package factory;

public class SunOpenOfficeFactory extends SoftwareShop {
    @Override
    protected OfficeProgram createOfficeProgram(String zuHolendeApp) {
        OfficeProgram program = null;
        switch (zuHolendeApp) {
            case "Textverarbeitung" -> program = new Write();
            case "Tabellenkalkulation" -> program = new Calc();
            case "Präsentation" -> program = new Impress();
            default -> System.err.println("Unbekanntes Programm: " + zuHolendeApp);
        }
        return program;
    }

}


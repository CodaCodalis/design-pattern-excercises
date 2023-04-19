package factory;

public class MicrosoftOfficeFactory extends SoftwareShop {
    @Override
    protected OfficeProgram createOfficeProgram(String zuHolendeApp) {
        OfficeProgram program = null;
        switch (zuHolendeApp) {
            case "Textverarbeitung" -> program = new Word();
            case "Tabellenkalkulation" -> program = new Excel();
            case "Präsentation" -> program = new PowerPoint();
            default -> System.err.println("Unbekanntes Programm: " + zuHolendeApp);
        }
        return program;
    }

}


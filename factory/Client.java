package factory;

public class Client {
    public static void main(String[] args) {
        SoftwareShop microsoftShop = new MicrosoftOfficeFactory();
        OfficeProgram microsoftTextProgram = microsoftShop.holeApp("Textverarbeitung");
        microsoftTextProgram.starten();

        SoftwareShop sunOpenOfficeShop = new SunOpenOfficeFactory();
        OfficeProgram sunOpenOfficeTabProgram = sunOpenOfficeShop.holeApp("Tabellenkalkulation");
        sunOpenOfficeTabProgram.starten();
    }
}


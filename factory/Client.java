package factory;

public class Client {
    public static void main(String[] args) {
        SoftwareShop microsoftShop = new MicrosoftOfficeFactory();
        OfficeProgram microsoftTextProgram = microsoftShop.holeApp("Textverarbeitung");
        microsoftTextProgram.versenden();

        SoftwareShop sunOpenOfficeShop = new SunOpenOfficeFactory();
        OfficeProgram sunOpenOfficeTabProgram = sunOpenOfficeShop.holeApp("Tabellenkalkulation");
        sunOpenOfficeTabProgram.versenden();

        SoftwareShop iWorkShop = new AppleiWorkFactory();
        OfficeProgram iWorkTabProgram = iWorkShop.holeApp("Tabellenkalkulation");
        iWorkTabProgram.versenden();
    }
}


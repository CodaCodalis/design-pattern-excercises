package factory;

public abstract class SoftwareShop {
    public OfficeProgram holeApp(String zuHolendeApp) {
        OfficeProgram programm = createOfficeProgram(zuHolendeApp);

        programm.einpacken();
        programm.etikettieren();

        return programm;
    }

    protected abstract OfficeProgram createOfficeProgram(String zuHolendeApp);

}

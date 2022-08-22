public class Electric extends Engine
{
    private int voltage;

    public Electric(int modelNo, int maxPower, int maxRPM, int voltage)
    {
        super(modelNo, maxPower, maxRPM);
        this.voltage = voltage;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public void getDisplay()
    {
        System.out.println("Voltage : " +voltage);


    }
}

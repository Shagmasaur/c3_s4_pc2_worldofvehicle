public class Petrol extends Engine
{
    private int displacement;
    private int noOfCylinders;

    public Petrol(int modelNo, int maxPower, int maxRPM, int displacement, int noOfCylinders)
    {
        super(modelNo, maxPower, maxRPM);
        this.displacement = displacement;
        this.noOfCylinders = noOfCylinders;
    }


    public void getDisplay()
    {
        System.out.println("Displacement : " +displacement);
        System.out.println("NoOFCylinders : " +noOfCylinders);

    }
}

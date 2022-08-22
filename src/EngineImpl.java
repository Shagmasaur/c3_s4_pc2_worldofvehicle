public class EngineImpl
{
    public static void main(String[] args)
    {

        Engine engine = new Engine(1234,700,9000);
        Petrol petr = new Petrol(1234,700,9000,6,6);
        Diesel dies = new Diesel(1234,700,9000,6,6);
        CNG CNG = new CNG(1234,700,9000,6,6);
        Electric Electric=new Electric(4321,900,9000,9000);


        Electric.setModelNo(4321);
        Electric.setMaxPower(9000);
        Electric.setMaxRPM(9999);
        Electric.setVoltage(9000);

        System.out.println("Engine Model "  +engine.getModelNo());
        System.out.println("Power : " +Electric.getMaxPower());
        System.out.println("RPM : " + Electric.getMaxRPM());
        System.out.println("VOltage : " + Electric.getVoltage());
    }

}

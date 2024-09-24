public class Bicycle extends Vehicle
{
    @Override
    public void start()
    {
        System.out.println("please start pedaling");
    }
    @Override
    public void stop()
    {
        System.out.println("stop pedaling to stop moving");
    }
    @Override
    public void accelerate ()
    {
        System.out.println("you need to pedal faster in order to accelerate");
    }
}

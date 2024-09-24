public class Car extends Vehicle
{
    @Override
    public void start()
    {
        System.out.println("press the gas button to start moving");
    }
    @Override
    public void stop()
    {
        System.out.println("press the brakes button to stop moving");
    }
    @Override
    public void accelerate ()
    {
        System.out.println("press the brakes a bit hared to accelerate");
    }
}

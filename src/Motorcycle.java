public class Motorcycle extends Vehicle
{
    @Override
    public void start()
    {
        System.out.println("pull the clutch lever in in order to start moving");
    }
    @Override
    public void stop()
    {
        System.out.println("pull the clutch in all the way, downshift to stop moving");
    }
    @Override
    public void accelerate ()
    {
        System.out.println("you accelerate faster than a car");
    }
}

public class ElectricCar extends Vehicle
{
    @Override
    public void start()
    {
        System.out.println("press the power button that's usually placed on the dashboard to turn the car on");
    }
    @Override
    public void stop()
    {
        System.out.println("hold down the brake pedal while the vehicle");
    }
    @Override
    public void accelerate ()
    {
        System.out.println("please use the accelerator to accelerate smoothly");
    }
}

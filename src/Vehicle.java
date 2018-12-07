abstract class Vehicle
{


    void start()
    {
        startEngine();
        horn();
        move();
    }

    abstract void horn();

    void startEngine()
    {
        System.out.println("Brap");
    }

    void move()
    {
        System.out.println("Woosh");
    }
}

class Ship extends Vehicle
{
    @Override
    void horn()
    {
        System.out.println("DOOT");
    }
}

class Car extends Vehicle
{
    @Override
    void horn()
    {
        System.out.println("beep beep");
    }
}

class Train extends Vehicle
{
    @Override
    void horn()
    {
        System.out.println("BEEEEEEEP");
    }
}

class Plane extends Vehicle
{
    @Override
    void horn()
    {
        System.out.println("I haz no horn");
    }
}

class SmallBoat extends Ship
{
    @Override
    void horn()
    {
        System.out.println("doot");
    }
}

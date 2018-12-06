public class Main
{
    public static void main(String[] args)
    {
        Vehicle v[] = new Vehicle[4];
        v[0] = new Plane();
        v[1] = new Ship();
        v[2] = new Truck();
        v[3] = new RaceCar();

        for(int i=0;i<v.length;i++)
        {
            if(v[i] instanceof Plane)
            {
                System.out.print("Plane: ");
            }
            else if(v[i] instanceof Ship)
            {
                System.out.print("Ship: ");
            }
            else if(v[i] instanceof Truck)
            {
                System.out.print("Truck: ");
            }
            else if(v[i] instanceof RaceCar)
            {
                System.out.print("RaceCar: ");
            }
            v[i].start();
        }
    }
}

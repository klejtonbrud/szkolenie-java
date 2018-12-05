public class Main
{
    public static boolean isLeapYear(int year)
    {
        if(year % 4 == 0)
        {
            if(year % 100 != 0)
            {
                return true;
            }
            else if(year % 400 == 0)
            {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args)
    {
        for(int i=1900; i<=2018; i++)
        {
            System.out.println(i + " " + isLeapYear(i));
        }
    }
}

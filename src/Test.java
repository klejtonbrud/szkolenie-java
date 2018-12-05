public class Test
{
    public static void getInfo(Date date)
    {
        System.out.println(date.day + "." + date.month + "." + date.year);
    }

    public static void main(String[] args)
    {
        Date start = new Date(23,7,2015);
        Date end = new Date(11,7,2017);
        getInfo(start);
        getInfo(end);
        Date today = start;
        getInfo(today);
        today.year = 2016;
        today.day = 17;
        getInfo(today);
        getInfo(start);
        end = today;
        getInfo(end);
    }
}

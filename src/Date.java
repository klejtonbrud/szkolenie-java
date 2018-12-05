public class Date
{
    int day;
    int month;
    int year;

    Date(int d,int m, int y)
    {
        day = d;
        month = m;
        year = y;
    }

    public static String getInfo(Date date)
    {
        return date.day + "." + date.month + "." + date.year;
    }

}

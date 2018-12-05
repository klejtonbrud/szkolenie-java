public class Trip
{
    Date start;
    Date end;
    String destination;

    Trip(Date st, Date en, String dest)
    {
        start = st;
        end = en;
        destination = dest;
    }

    public static String getInfo(Trip trip)
    {
        return "Trip to " + trip.destination + "\nstart: " + Date.getInfo(trip.start) + "\nend: " + Date.getInfo(trip.end);
    }
}

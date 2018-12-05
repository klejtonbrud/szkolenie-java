public class Customer
{
    String name;
    Address address;
    Trip trip;

    Customer(String customer_name)
    {
        name = customer_name;
    }

    public void setAddress(Address customer_address)
    {
        address = customer_address;
    }

    public void assignTrip(Trip customer_trip)
    {
        trip = customer_trip;
    }

    public String getInfo()
    {
        return "Customer info:\nName: " + name + "\nAddress: " + Address.getInfo(address) + "\nTrip: " + Trip.getInfo(trip);
    }
}

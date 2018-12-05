public class TravelOffice
{
    public static void main(String[] args)
    {
        Address first_customers_address = new Address("Lodzka", "93-320", "Lodz");
        Customer first_customer = new Customer("Adam Peczkowski");
        Trip first_customers_trip = new Trip(new Date(23,03,2018), new Date(30, 03, 2018), "Paris");
        first_customer.setAddress(first_customers_address);
        first_customer.assignTrip(first_customers_trip);
        System.out.print(first_customer.getInfo());
    }
}

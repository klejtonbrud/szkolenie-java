public class Address
{
    String street;
    String zip;
    String city;

    Address(String street_name, String zipcode, String city_name)
    {
        street = street_name;
        zip = zipcode;
        city = city_name;
    }

    public static String getInfo(Address address)
    {
        return address.street + "\n" + address.zip + ", " + address.city;
    }
}

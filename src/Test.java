import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test
{
    public static void main(String[] args)
    {
        TravelOffice niceTravelOffice = new TravelOffice();

        niceTravelOffice.addCustomer(new Customer("Adam"));
        niceTravelOffice.addCustomer(new Customer("Robert"));
        niceTravelOffice.addCustomer(new Customer("Dawid"));

        niceTravelOffice.customers[0].setAddress(new Address("Sarmacka 4/16", "93-320", "Lodz"));
        niceTravelOffice.customers[1].setAddress(new Address("Lodzka 16", "95-102", "Lodz"));
        niceTravelOffice.customers[2].setAddress(new Address("Kosynierow Gdynskich 3", "93-330", "Lodz"));

        niceTravelOffice.customers[0].assignTrip(new AbroadTrip(new Date("24.12.2018"), new Date("2.1.2019"),"London", 2500,500));
        niceTravelOffice.customers[1].assignTrip(new AbroadTrip(new Date("20/12/2018"), new Date("5/1/2019"),"Dubai", 4500, 1000));
        niceTravelOffice.customers[2].assignTrip(new DomesticTrip(new Date("30-12-2018"), new Date("2-1-2019"),"Mielno",1000, 500));

        System.out.print(niceTravelOffice.toString());
    }
}

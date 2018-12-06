public class TravelOffice
{
    Customer[] customers = new Customer[2];

    public int getCustomerCount()
    {
        for(int i = 0; i < customers.length; i++)
        {
            if(customers[i] == null)
            {
                return i;
            }
        }
        return customers.length;
    }

    public void addCustomer(Customer customer)
    {
        if(getCustomerCount() == customers.length)
        {
            int len = customers.length;
            Customer[] arr = new Customer[len+2];
            System.arraycopy(customers, 0, arr, 0, len);
            arr[len] = customer;
            customers = arr;
        }
        else
        {
            for(int i = 0; i < customers.length; i++)
            {
                if(customers[i] == null)
                {
                    customers[i] = customer;
                    break;
                }
            }
        }
    }

    public String getInfo()
    {
        String result = "";

        for(int i=0; i<getCustomerCount(); i++)
        {
            result += customers[i].getInfo() + "\n\n";
        }

        return result;
    }

    public static void main(String[] args)
    {
        TravelOffice niceTravelOffice = new TravelOffice();

        niceTravelOffice.addCustomer(new Customer("Adam"));
        niceTravelOffice.addCustomer(new Customer("Robert"));
        niceTravelOffice.addCustomer(new Customer("Dawid"));

        niceTravelOffice.customers[0].setAddress(new Address("Sarmacka 4/16", "93-320", "Lodz"));
        niceTravelOffice.customers[1].setAddress(new Address("Lodzka 16", "95-102", "Lodz"));
        niceTravelOffice.customers[2].setAddress(new Address("Kosynierow Gdynskich 3", "93-330", "Lodz"));

        niceTravelOffice.customers[0].assignTrip(new Trip(new Date(24, 12, 2018), new Date(2, 1, 2019),"London"));
        niceTravelOffice.customers[1].assignTrip(new Trip(new Date(20, 12, 2018), new Date(5, 1, 2019),"Dubai"));
        niceTravelOffice.customers[2].assignTrip(new Trip(new Date(30, 12, 2018), new Date(2, 1, 2019),"Paris"));

        System.out.print(niceTravelOffice.getInfo());
    }
}

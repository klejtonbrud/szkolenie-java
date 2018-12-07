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

    @Override
    public String toString()
    {
        String result = "";

        for(int i=0; i<getCustomerCount(); i++)
        {
            result += customers[i].toString() + "\n\n";
        }

        return result;
    }
}

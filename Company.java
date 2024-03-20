
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;
import java.util.HashMap;

/**
 * Manage a company.
 *
 * @author POO
 * @version 03/2024
 */
public class Company {

    // Clients registry
    private ArrayList<User> clients;
    // Sellers registry
    private ArrayList<User> sellers;
    // Properties registry
    private ArrayList<Property> properties;
    // Sells registry
    private ArrayList<Sell> sells;

    /**
     * Constructor of class Company
     */
    public Company() 
    {
        clients = new ArrayList();
        sellers = new ArrayList();
        properties = new ArrayList();
        sells = new ArrayList();
    }

    /**
     * Get the list of clients.
     *
     * @return This company clients.
     */
    public List<User> getClients() {
        return clients;         // dummy implementation
    }

    /**
     * Get the list of sellers.
     *
     * @return This company sellers.
     */
    public List<User> getSellers() {
        return sellers;         // dummy implementation
    }

    /**
     * Get the list of properties.
     *
     * @return This company's properties.
     */
    public List<Property> getProperties() {
        return properties;         // dummy implementation
    }

    /**
     * Get the list of sells.
     *
     * @return This company sells.
     */
    public List<Sell> getSells() {
        return sells;         // dummy implementation
    }

    /**
     * Register a client.
     *
     * @param client to register. Must not be null. Must not be registered.
     * @return true If the registration succeeds, false otherwise.
     */
    public boolean registerClient(User client) {
        if(clients.contains(client) || client == null)
        {
            return false;
        }
        return clients.add(client);
    }

    /**
     * Register a seller.
     *
     * @param seller to register. Must not be null. Must not be registered.
     * @return true If the registration succeeds, false otherwise.
     */
    public boolean registerSeller(User seller) {
        if(sellers.contains(seller) || seller == null)
        {
            return false;
        }
        return sellers.add(seller);
    }

    /**
     * Register a property.
     *
     * @param property to register. Must not be null. Must not be registered.
     * @return true If the registration succeeds, false otherwise.
     */
    public boolean registerProperty(Property property) {
        if(properties.contains(property) || property == null)
        {
            return false;
        }
        return properties.add(property);
    }

    /**
     * Register a sell.
     *
     * @param sell to register. Must not be null. Must not be registered.
     * @return true If the registration succeeds, false otherwise.
     */
    public boolean registerSell(Sell sell) 
    {
        if(sells.contains(sell) || sell == null)
        {
            return false;
        }
        return sells.add(sell);       
    }

    /**
     * Generate a new sell and register that sell.
     *
     * @param client Must be already registered.
     * @param seller Must be already registered.
     * @param property Must be already registered.
     * @return true If the request succeeds, false otherwise.
     */
    public boolean createSell(User client, User seller, Property property) 
    {
        if(clients.contains(client) && sellers.contains(seller) && properties.contains(property))
        {
            Sell sell = new Sell(client, seller, property);
            registerSell(sell);
            return true;
        }
        
        return false;
    }

    /**
     * Calculates the total number of sells within the provided year.
     *
     * @param year
     * @return The total number of sells in the year.
     */
    public int calculateSellsOfTheYear(int year) 
    {
        int counter = 0;
        
        for(Sell sell : sells)
        {
            if(sell.getDate().getYear() == year)
            {
                counter++;
            }
        }
        return counter;
    }

    /**
     * Find the seller with more sells within the provided year.
     *
     * @param year
     * @return The name of the seller of the year.
     */
    public String findSellerOfTheYear(int year) 
    {
        HashMap<User,Integer> sellersCount = new HashMap();
        for(User seller : sellers)
        {
            sellersCount.put(seller, 0);
        }
        
        for(Sell sell : sells)
        {
            for(User seller : sellers)
            {
                if(seller == sell.getSeller() && sell.getDate().getYear() == year)
                {
                    sellersCount.put(seller,sellersCount.get(seller)++);
                }
            }
        }
    }

}

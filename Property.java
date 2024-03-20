
/**
 * A property to sell.
 *
 * @author POO
 * @version 03/2024
 */
public class Property {

    private static int NUMBER_OF_PROPERTIES = 0;
    private final String id;
    private String description;
    private double price;

    /**
     * Constructor of class Property
     *
     * @param description The property description.
     * @param price The property price.
     */
    public Property(String description, double price) 
    {
        this.description = description;
        this.price = price;
        id = null;
    }

    /**
     * Id selector.
     */
    public String getId() 
    {
        return null;
    }

    /**
     * Description selector.
     */
    public String getDescription() 
    {
        return "T3 Monte Belo";

    }

    /**
     * Description modifier.
     * 
     * @param description The new description. Must not be null.
     */
    public void setDescription(String description) {

    }

    /**
     * Price selector.
     */
    public double getPrice() 
    {
        return 150000.0;
    }

    /**
     * Price modifier.
     * 
     * @param price The new price. Must not be negative.
     */
    public void setPrice(double price) {

    }

    @Override
    public String toString() 
    {
        return null;
    }
}

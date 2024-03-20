
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste CompanyTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */

public class CompanyTest
{
    private Company company;
    private User client1, client2, seller1, seller2;
    private Property property1, property2;

    @Test
    public void testConstructor()
    {
        assertNotNull(company.getClients());
        assertNotNull(company.getSellers());
        assertNotNull(company.getProperties());
        assertNotNull(company.getSells());
    }

    @Test
    public void testRegisterClient()
    {
        assertTrue(company.registerClient(client1));
    }

    @Test
    public void testRegisterClients()
    {
        assertTrue(company.registerClient(client1));
        assertTrue(company.registerClient(client2));
    }

    @Test
    public void testRegisterClientDuplicate()
    {
        assertTrue(company.registerClient(client1));
        assertFalse(company.registerClient(client1));
    }

    @Test
    public void testRegisterClientNull()
    {
        assertFalse(company.registerClient(null));
    }

    @Test
    public void testRegisterSeller()
    {
        assertTrue(company.registerSeller(seller1));
    }

    @Test
    public void testRegisterSellers()
    {
        assertTrue(company.registerSeller(seller1));
        assertTrue(company.registerSeller(seller2));
    }

    @Test
    public void testRegisterSellerDuplicate()
    {
        assertTrue(company.registerSeller(seller1));
        assertFalse(company.registerSeller(seller1));
    }

    @Test
    public void testRegisterSellerNull()
    {
        assertFalse(company.registerSeller(null));
    }
    
    @Test
    public void testRegisterProperty()
    {
        assertTrue(company.registerProperty(property1));
    }

    @Test
    public void testRegisterProperties()
    {
        assertTrue(company.registerProperty(property1));
        assertTrue(company.registerProperty(property2));
    }

    @Test
    public void testRegisterPropertyDuplicate()
    {
        assertTrue(company.registerProperty(property1));
        assertFalse(company.registerProperty(property1));
    }

    @Test
    public void testRegisterPropertyNull()
    {
        assertFalse(company.registerProperty(null));
    }

    /**
     * Construtor default para a classe de teste CompanyTest
     */
    public CompanyTest()
    {
    }

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
        company = new Company();
        client1 = new User("José Manuel", "911111111", "zemanel@yahoo.com");
        client2 = new User("António Francisco", "922222222", "tochico@hotmail.com");
        seller1 = new User("Fernando Fernandes", "966777101", "fefe@remax.pt");
        seller2 = new User("Rodrigo Rodrigues", "966777152", "roro@remax.pt");  
        property1 = new Property("T1 Felgueiras", 200000.5);
        property2 = new Property("T9 Porto", 1499999.99);
    }

    /**
     * Desfaz a 'fixture' do teste.
     *
     * Chamado após cada método de teste de caso.
     */
    @AfterEach
    public void tearDown()
    {
    }
}

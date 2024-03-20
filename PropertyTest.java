

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste PropertyTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class PropertyTest
{
    @Test
    public void testContructor()
    {
        Property property = new Property("T3 Monte Belo", 150000.0);
        assertEquals(150000.0, property.getPrice());
        assertEquals("T3 Monte Belo", property.getDescription());
    }
    
    @Test
    public void testToString()
    {
        Property property = new Property("T3 Monte Belo", 150000.0);
        assertEquals("Descricao   : T3 Monte Belo\nPreco       : 150000.0 Euros",property.toString());
    }
    
    /**
     * Construtor default para a classe de teste PropertyTest
     */
    public PropertyTest()
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

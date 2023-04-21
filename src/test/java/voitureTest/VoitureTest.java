package voitureTest;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import voiture.Voiture;

import static org.junit.Assert.assertEquals;

public class VoitureTest {
    protected double fValeur1;
    protected double fValeur2;

    /**
     * Constructeur de la classe-test VoitureTest
     */
    public VoitureTest() {
    }

    /**
     * Met en place les engagements.
     * <p>
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @BeforeEach
    public void setUp() // throws java.lang.Exception
    {
        // Initialisez ici vos engagements
        fValeur1 = 2.0;
        fValeur2 = 3.0;
    }

    /**
     * Supprime les engagements
     * <p>
     * Méthode appelée après chaque appel de méthode de test.
     */
    @AfterEach
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }

    @Test
    public void testVoitureAge() {
        Voiture Honda = new Voiture("Ali", 1977);
        assertEquals(46, Honda.getAge());
    }


    @Test
    public void testVoitureOwner() {
        Voiture Toyota = new Voiture("Yufei", 2005);
        assertEquals("Yufei", Toyota.getOwner());
    }

    @Test
    public void testVoitureAnnee() {
        Voiture Mercedes_AMG = new Voiture("Gio", 2005);
        assertEquals(2005, Mercedes_AMG.getAnnee());
    }
}

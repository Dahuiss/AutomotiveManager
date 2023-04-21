package caracteristiquesTest;

import caracteristiques.Caracteristique;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;

public class CaracteristiqueTest {
    protected double fValeur1;
    protected double fValeur2;

    /**
     * Constructeur de la classe-test TestCaractéristique
     */
    public CaracteristiqueTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @BeforeEach
    public void setUp() // throws java.lang.Exception
    {
        // Initialisez ici vos engagements
        fValeur1= 2.0;
        fValeur2= 3.0;
    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @AfterEach
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }

    @Test
    public void caracTests()
    {
        Caracteristique EditionLimite = new Caracteristique();
        EditionLimite.setVoiture("Ali", 2004);
        EditionLimite.setVitesse(34);
        assertEquals(34, EditionLimite.getVitesse(), 0.0);
        assertEquals(84, EditionLimite.accelerer(50), 0.0);
    }

    @Test
    public void testVitesse()
    {
        Caracteristique EditionLimite = new Caracteristique();
        EditionLimite.setVitesse(255);
        assertEquals(255, EditionLimite.getVitesse(), 0.0);
    }

    @Test
    public void testVoitureOwner()
    {
        Caracteristique EditionLimite = new Caracteristique();
        EditionLimite.setVoiture("Gio", 1999);
        assertEquals("Gio", EditionLimite.getVoitureOwner());
    }

    @Test
    public void testVoitureAnnee()
    {
        Caracteristique EditionLimite = new Caracteristique();
        EditionLimite.setVoiture("Ali", 2002);
        assertEquals(2002, EditionLimite.getVoitureAnnee());
    }

    @Test
    public void testVoitureAge()
    {
        Caracteristique EditionLimite = new Caracteristique();
        EditionLimite.setVoiture("Gio", 1977);
        assertEquals(46, EditionLimite.getVoitureAge());
    }
}

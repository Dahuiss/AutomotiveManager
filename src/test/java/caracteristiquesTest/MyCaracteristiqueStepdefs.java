package caracteristiquesTest;

import caracteristiques.Caracteristique;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class MyCaracteristiqueStepdefs {

    private Caracteristique caracteristique;
    private Caracteristique caracteristique1 = new Caracteristique();

    @Given("l'édition limité de {string} et datant de {int}")
    public void lEditionLimiteDeEtDatantDe(String owner, int annee) {
        caracteristique = new Caracteristique();
        caracteristique1.setVoiture(owner, annee);
    }

    @When("Je roule à {double}")
    public void jeRouleA(double vitesse) {
        caracteristique.setVitesse(vitesse);
        caracteristique1.setVitesse(vitesse);
        assertEquals(caracteristique1.getVitesse(), vitesse, 0.0);
    }

    @Then("Je vérifie que ma vitesse de pointe est de {double}")
    public void jeVerifieQueMaVitesseDePointeEstDe(double vitesse) {
        assertEquals(caracteristique1.getVitesse(), vitesse, 0.0);
    }
}

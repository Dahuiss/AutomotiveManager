package voitureTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import voiture.Voiture;

import static org.junit.Assert.assertEquals;

public class MyVoitureStepdefs {
    private Voiture voiture;
    private Voiture voiture1 = new Voiture();

    @Given("une voiture appartenant à {string} et datant de {int}")
    public void uneVoitureAppartenantAEtDatantDe(String owner, int annee) {
        voiture = new Voiture(owner, annee);
        voiture1 = new Voiture(owner,annee);
    }

    @When("je vérifie l'âge de la voiture de {string}")
    public void onCalculeSonAge(String owner) {

        voiture1 = voiture.findByOwner(owner);
        assertEquals(voiture1.getOwner(), owner);
    }

    @Then("l'âge de la voiture retourné est {int}")
    public void lAgeDeLaVoitureRetourneEst(int age) {
        assertEquals(voiture1.getAge(), age);
    }

    @Given("une voiture appartenant à {string} acheté en {int}")
    public void uneVoitureAppartenantAAcheteEn(String owner, int annee) {
        voiture = new Voiture(owner, annee);
        voiture1 = new Voiture(owner,annee);
    }


    @When("je vérifie que {string} propriétaire de la voiture")
    public void jeVerifieQueProprietaireDeLaVoiture(String owner) {
        voiture1 = voiture.findByOwner(owner);
        assertEquals(voiture1.getOwner(), owner);
    }

    @Then("le propriétaire de la voiture me est retourné est {string}")
    public void leProprietaireDeLaVoitureMeEstRetourneEst(String owner) {
        assertEquals(voiture1.getOwner(), owner);
    }

    @When("je vérifie {int} de construction de la voiture de {string}")
    public void jeVerifieDeConstructionDeLaVoitureDe(int annee, String owner) {
        voiture1 = voiture.findByOwner(owner);
        assertEquals(voiture1.getAnnee(), annee);
    }

    @Then("l'année de construction de la voiture me est retourné est {int}")
    public void lAnneeDeConstructionDeLaVoitureMeEstRetourneEst(int annee) {
        assertEquals(voiture1.getAnnee(), annee);
    }
}

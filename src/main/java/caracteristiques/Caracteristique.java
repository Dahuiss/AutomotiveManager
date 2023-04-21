package caracteristiques;
/**
 * Décrivez votre classe Caractéristiques ici.
 *
 * @author Ali & Giovanni
 * @version 17/04/23
 */
import voiture.Voiture;

public class Caracteristique {
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private double vitesse;
    private final Voiture voiture;

    /**
     * Constructeur d'objets de classe Caractéristiques
     */
    public Caracteristique()
    {
        // initialisation des variables d'instance
        this.vitesse = 0.0;
        this.voiture = new Voiture();
    }

    public double getVitesse() {
        return this.vitesse;
    }

    public void setVitesse(double vitesse) {
        this.vitesse = vitesse;
    }

    public void setVoiture(String owner, int annee) {
        this.voiture.setOwner(owner);
        this.voiture.setAnnee(annee);
    }

    public String getVoitureOwner() {
        return this.voiture.getOwner();
    }

    public int getVoitureAnnee() {
        return this.voiture.getAnnee();
    }

    public int getVoitureAge() {
        return this.voiture.getAge();
    }

    public double accelerer(double vitesse) {
        return this.vitesse += vitesse;
    }

    public String toString() {
        return "La voiture de " +this.voiture.getOwner()+ " de " +this.voiture.getAge()+ " ans "
        +"roule à la vitesse " +this.vitesse+" Kmh" ;
      }

}

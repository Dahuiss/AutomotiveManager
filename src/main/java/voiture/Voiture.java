package voiture;
/**
 * Décrivez votre classe Voiture ici.
 *
 * @author Ali & Giovanni
 * @version 17/04/2023
 **/

import java.time.LocalDate;

public class Voiture {
    private int annee; // L'année de la voiture
    private String owner; // Le propriétaire de la voiture

    // Constructeur pour initialiser les variables d'instance
    public Voiture(String owner, int annee) {
        this.owner = owner; // Initialiser le propriétaire de la voiture
        this.annee = annee; // Initialiser l'année de la voiture
    }

    public Voiture() {
        this.annee = 0; // L'année par défaut est l'année actuelle
        this.owner = "Unknown"; // Le propriétaire par défaut est "Unknown"
    }

    // Accesseur pour obtenir l'année de la voiture
    public int getAnnee() {
        return annee;
    }

    // Mutateur pour définir l'année de la voiture
    public void setAnnee(int annee) {
        this.annee = annee;
    }

    // Accesseur pour obtenir le propriétaire de la voiture
    public String getOwner() {
        return owner;
    }

    // Mutateur pour définir le propriétaire de la voiture
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Voiture findByOwner(String owner) {
        if (this.getOwner().equals(owner)) {
            return this;
        }
        return null;
    }

    // Méthode pour calculer l'âge de la voiture
    public int getAge() {
        int age = LocalDate.now().getYear() - annee; // Obtenir l'année actuelle et la soustraire à l'année de la voiture
        return age; // Renvoyer l'âge de la voiture
    }

    //Renvoie une chaîne de caractère pour les détails.
    public String toString() {
        return "La voiture de " + owner + " a " + this.getAge();
    }
}

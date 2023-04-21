Feature:US_002 - Vérifier les caractéristiques d'une voiture
  EN TANT QUE conducteur de Mercedes 300 SL
  Je VEUX pouvoir vérifier ma vitesse de pointe
  AFIN DE m'assurer que j'adopte une conduite responsable

  Scenario Outline: Vérifions le bon fonctionnement du Set et du Get
    Given l'édition limité de "<owner>" et datant de <annee>
    When Je roule à <vitesse>
    Then Je vérifie que ma vitesse de pointe est de <vitesse>
    Examples:
      | owner | annee | vitesse |
      | Jean  | 1954  | 150   |
      | Paul  | 1955  | 50    |
      | Jack  | 1956  | 250   |



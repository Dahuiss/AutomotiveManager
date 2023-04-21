Feature: US_001 - Vérifier les informations d'une voiture
  EN TANT QUE conducteur
  Je VEUX pouvoir vérifier les informations d'une voiture
  AFIN DE m'assurer de sa conformité

  Scenario Outline: Calculer l'âge d'une voiture
    Given une voiture appartenant à "<owner>" et datant de <annee>
    When je vérifie l'âge de la voiture de "<owner>"
    Then l'âge de la voiture retourné est <age>

    Examples:
      | owner | annee | age |
      | Ali   | 1977  | 46  |
      | Gio  | 2000  | 23  |
      | Yufei | 2015  | 8   |

  Scenario Outline: Vérifier le propriétaire d'une voiture
    Given une voiture appartenant à "<owner>" acheté en <annee>
      When je vérifie que "<owner>" propriétaire de la voiture
      Then le propriétaire de la voiture me est retourné est "<owner>"

      Examples:
        | owner | annee |
        | Gio   | 2005  |
        | Mehdi | 2000  |
        | Yufei | 2010  |

  Scenario Outline: Vérifier l'année de construction de la voiture
    Given une voiture appartenant à "<owner>" acheté en <annee>
      When je vérifie <annee> de construction de la voiture de "<owner>"
      Then l'année de construction de la voiture me est retourné est <annee>
      Examples:
        | owner | annee |
        | Gio   | 2005  |
        | Mehdi | 2000  |
        | Yufei | 2010  |
Feature: Verifier le module register
  En tant que utilisateur je souhaite remplir le formulaire afin de m'enregistrer


  @module_register
  Scenario Outline: Remplir le formulaire register
    Given Je me connecte sur le site Mercury
    When Je click sur le module register
    And Je saisis un data dans le champ username "<username>"
    And Je saisis un data dans le champ lastname "<lastname>"
 
    Examples: 
      | username  | lastname |
      | chaima |     benamor | 
      | med |     benyoussef | 

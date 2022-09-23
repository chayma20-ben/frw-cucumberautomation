Feature: je verifie la page de la connexion
  En tant que utilisateur je souhaite me connecter au site Mercury 

  @connexion
  Scenario: je verifie la page de la connexion
 Given Je me connecte sur le site Mercury
 When Je saisis le username "test"
 And Je saisis le mot de passe "test"
 And Je clique sur le boutton submit
 Then je me redirige vers la page home "Login Successfully"  
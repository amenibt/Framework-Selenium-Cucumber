@connexion3 
Feature: Authentification-Orange 
	Entant que utilisateur je souhaite m'authentifier

	@cnx3 
	Scenario: Authentification-Orange 
	Given  Open application 
	When  Set Name "Admin" 
	And  Set Pwd "admin123"
	And  Clik on button Login 
	Then  welcome page appears
	
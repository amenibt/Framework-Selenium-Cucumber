@connexion 
Feature: Authentification-Orange 
	Entant que utilisateur je souhaite m'enthentifier

@cnx 
Scenario: Authentification-Orange 
	Given Open application 
	When Set UserName 
	And Set Password 
	And Clik on button Login 
	Then welcome page appears
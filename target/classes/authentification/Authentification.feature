@connexion 
Feature: Authentification-Orange 
	Entant que utilisateur je souhaite m'authentifier

Background: 
	Given  Open application 
	When  Set UserName 
	And  Set Password 
	And  Clik on button Login 
	
	
@cnx 
Scenario: Authentification-Orange 
	Then  welcome page appears 
	
	
@link1 
Scenario: Click-Link 
	When click on Admin link 
	
	
@link2 
Scenario: Click-Link2 
	When click on Dashboard link
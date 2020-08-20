@connexion4 
Feature: Authentification-Orange 
	Entant que utilisateur je souhaite m'authentifier avec un login, mp invalides

@cnx4 
Scenario Outline: Failed Login with invalid Credentials Authentification-Orange 
	Given Open application 
	When Set login "<login>" 
	And Set pwdUser "<passwordInvalid>" 
	And  Clik on button Login 
	Examples: 
		| login      | passwordInvalid |
		| Admin      | admin123        |
		| testuser_2 | 123456          |
		| testuser_3 | 123456789 	   |
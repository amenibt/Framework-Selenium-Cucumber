@Patient
Feature: Patient - FullName
  ETQ User je souhaite de remplir le nom du patient

  @cnx2
  Scenario: Patient - FullName
    Given Open patient application
    When Set FirstName
    And Set LastName
    And Click button Submit
    Then Show an error message
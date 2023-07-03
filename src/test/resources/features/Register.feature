Feature: User register
  As a user I want to register on the page alkomprar

  Background:
    Given The user opens the page alkomprar

  @RegisterSuccessfully
  Scenario: Register user successfully

    And click on label mi cuenta
    And the user enter his email and click on button continuar
    When fills in the required fields with their data and click on button continuar
    Then the user can see the title

  @AddProductToCarSuccessfully
  Scenario: Add a product to car successfully
    And the user close the alert if exists
    And write product on search bar and click enter
    When the user select a product from list
    And click on add to card
    Then see a message of product selected added successfully

Feature: Login to faceBook
  Scenario: validation check on login page
    Given user navigates to facebook login page
    And enters his "username" and "password"
    Then assert validion error message

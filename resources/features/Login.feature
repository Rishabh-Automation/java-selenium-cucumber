Feature: Login page

  Background: Launch the URL
    Given user Launch Magneto url

  @homePage
  Scenario: Login to Magneto software
    When user logged into Magneto dashboard page
    Then verify magneto dashboard page
    #And verify website logo

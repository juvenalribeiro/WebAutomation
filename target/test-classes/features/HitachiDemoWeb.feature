#language: en

Feature: Home page of Senta Portal Verifications
@Test
  Scenario: People finder a existing person with sucess
    Given that accessing the Senta homepage
    When the page is loaded
    And click on "My Apps" label on HubNav
    And open "People Finder" application
    And the People Finder is loaded
    When search for "Juvenal Ribeiro"
    Then name "Ribeiro, Juvenal" is displyed on results

# language:en
# autor: Jefferson
@stories
Feature: Utest
  As a user, i want to learn how to automate in screenplay at the Utest with the automation course
  @scenario1
  Scenario: Search for a registration in utest
    Given than Jefferson wants to register at the page Utest
      | strFirstName  |strLastName  | strEmail                     | strMonth|strDay|strYear|strPassword   |
      | Jefferson     |Guzman       | jeffersonguzman167@gmail.com |    06   |   02 | 2000  | Jefferson123*|
    When he search for the course on the choucair academy platform
    Then he finds the course called Foundation Level


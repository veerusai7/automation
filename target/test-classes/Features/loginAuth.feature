Feature: Login Feature for automationpractice.com
  I want to login this website with this feature file

 Scenario: Login Test for website
    Given webdriver will be intiated
    And type of browser
    When I visit the login page
    And add username
    And add password
    Then validate the credentials
    And check for the successful login
    

  Scenario Outline: Login Test for website
    Given webdriver will be intiated
    And type of browser
    When I visit the login page
    And add "<username>" , "<password>"
    Then validate the credentials
    And check for the successful login

    Examples: 
      | username             | password      |
      | sandyago@gmail.com   | balayyarocks1 |
      | sanjaysaho@gmail.com | $3cr3t007     |


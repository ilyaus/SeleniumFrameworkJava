Feature: LoginFeature
  This feature tests login

  Scenario: Check Login with correct credentials
    Given I see application opened
    Then I click login link
    When I enter UserName and Password
      | UserName | Password |
      | admin    | password |
    Then I click login button
    Then I should see the username with hello
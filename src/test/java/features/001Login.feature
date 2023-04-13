@Smoke
Feature: Verify Admin login functionality

  @Login @Users @ChangePassword @Event @Halls
  Scenario Outline: Admin should be able to login into application
    Given : Admin is on login page
    When : Admin enters credentials "<Username>" "<Password>"
    Then : Admin hit the login button
    And : Admin is on Dashboard

    Examples: 
      | Username             | Password |
      | dshah@parkstreet.com | Test12312234 |

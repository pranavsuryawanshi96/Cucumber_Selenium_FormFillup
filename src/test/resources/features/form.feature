Feature: Simple Form Fillup

  Scenario: Verify the form works for all mandatory fields
    Given the user opens the browser and navigates to the URL
    When the user enters the first name as "Pranav"
    And the user enters the last name as "Patil"
    And the user enters the email as "prnav96@gmail.com"
    And the user enters the contact number as "9066179696"
    And the user clicks on the Submit button
    Then the form should be submitted successfully


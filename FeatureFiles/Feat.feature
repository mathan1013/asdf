Feature: Car Loan EMI Calculation

  Scenario: Calculate EMI for a car loan
    Given the car price is ₹15,00,000
    And the annual interest rate is 9.5%
    And the loan tenure is 1 year
    When I calculate the EMI
    Then the EMI should be ₹125,000
    And the interest amount for one month should be ₹X
    And the principal amount for one month should be ₹125,000

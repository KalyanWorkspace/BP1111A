#Author: kalyan.pulijala@sqa.org.uk

Feature: Login to SQA Portal

  @RegTest
  Scenario: Navigating to Admin Key Dates
    Given the user has access to SQA Appeals Portal
    When the user clicks on Admin
    Then the user will land on the Learner Direct Service
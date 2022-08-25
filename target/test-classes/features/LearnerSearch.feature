#Author: kalyan.pulijala@sqa.org.uk

Feature: Login to SQA Portal

  @RegTest
  Scenario: Navigating to Learners
    Given the user has access to SQA Appeals Portal
    When the user clicks on Learners
    Then the user will land on the learner search page
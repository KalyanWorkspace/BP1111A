#Author: kalyan.pulijala@sqa.org.uk

Feature: Login to SQA Portal

 @RegTest
  Scenario: Navigating to Centres
   Given the user has access to SQA Appeals Portal
    When the user clicks on the centres
    Then the user will land on the centre search page
    
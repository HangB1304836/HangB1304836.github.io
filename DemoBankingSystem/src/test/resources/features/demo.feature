Feature: DemoBankingSystem


Scenario: Login Home Page
  Given Open Guru page 
  When Login Guru page
  Then Login success
    @1
    Scenario: Verify new customer can be created
      Given Open New Customer Page
      #When Login Guru page
      #Then Login success
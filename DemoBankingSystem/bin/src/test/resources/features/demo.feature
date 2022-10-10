Feature: DemoBankingSystem

  @1
  Scenario Outline: Verify new customer can be created
    Given Open Guru page
    When login Guru page
    Then Login success

    @2
    Scenario Outline: Verify that GalaxyS6 displays correct in detail page when user click on name
	    Given Open add new customer page
	    When Fill info and submit
      Then The website navigate to galaxy detail page correct with "<name>" and "<description>"
      Examples:
        | name | description |
        | Samsung galaxy s5 | The Samsung Galaxy S6 is powered by 1.5GHz octa-core Samsung Exynos 7420 processor and it comes with 3GB of RAM. The phone packs 32GB of internal storage cannot be expanded. |
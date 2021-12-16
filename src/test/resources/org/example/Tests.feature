Feature: Sample tests to be injected in Octane

  Scenario: param controlled test fail
    When doomedToFail = "true"
    Then test is failed

  Scenario: param controlled test pass
     When doomedToFail = "false"
     Then test is passed

  Scenario: failing test
      Given testShouldNotPass
      When time has run out
      Then test is failed

  Scenario: passing test
      Given testShouldPass
      When time has run out
      Then test is passed
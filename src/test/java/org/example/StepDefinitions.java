package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static org.junit.Assert.*;

public class StepDefinitions {
    private boolean doomedToFail;

    @When("doomedToFail = {string}")
    public void doomedtofail(String doomedToFail) {
       this.doomedToFail = Boolean.getBoolean(doomedToFail);
    }

    @Then("test is passed")
    public void test_is_passed() {
       Assert.assertFalse(doomedToFail);
    }

    @Then("test is failed")
    public void test_is_failed() {
        Assert.assertTrue(doomedToFail);
    }

    @Given("testShouldNotPass")
    public void testshouldnotpass() {
       doomedToFail = false;
    }

    @Given("testShouldPass")
    public void testshouldpass() {
        doomedToFail = false;
    }


    @When("time has run out")
    public void time_has_run_out() {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

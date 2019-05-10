package StepDef;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CucumberHook {

    public static Scenario scenario;
    public static Scenario getScenario(){
        return scenario;
    }


    @Before
    public void beforeMethod(Scenario scenario){
        System.out.println("This is before method that run before every method");
        System.out.println("scenario name: "+scenario.getName());
        this.scenario =scenario;
    }

    @After
    public void afterMethod(){
        System.out.println("This is after method that run after every method");
    }

}

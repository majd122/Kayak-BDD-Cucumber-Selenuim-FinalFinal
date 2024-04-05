package com.kayak.hooks;

import com.kayak.utilities.Driver;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());
        }
        Driver.closeWebdriver();
        //comment
    }

}

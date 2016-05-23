package org.henrrich.jlocator.example.supercalculator;

import com.jprotractor.NgWebDriver;
import org.henrrich.jlocator.Channel;
import org.henrrich.jlocator.JLocatorElementLocatorFactory;
import org.henrrich.jlocator.JLocatorFieldDecorator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by henrrich on 23/05/2016.
 */
public class SuperCalculatorTest {

    private NgWebDriver ngDriver;
    private String baseUrl;

    private SuperCalculatorPage superCalculatorPage;

    @Before
    public void setUp() throws Exception {
        ngDriver = new NgWebDriver(new FirefoxDriver(), true);
        baseUrl = "http://juliemr.github.io/protractor-demo/";
        ngDriver.navigate().to(baseUrl);
        ngDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        superCalculatorPage = new SuperCalculatorPage();
        PageFactory.initElements(new JLocatorFieldDecorator(new JLocatorElementLocatorFactory(ngDriver, Channel.WEB)), superCalculatorPage);
    }

    @Test
    public void testShouldAddOneAndTwo() throws Exception {
        superCalculatorPage.add("1", "2");
        Assert.assertTrue("Result is not 3!", superCalculatorPage.getLatestResult().equals("3"));
    }

    @Test
    public void testShouldHaveAHistory() throws Exception {
        superCalculatorPage.add("1", "2");
        superCalculatorPage.add("3", "4");
        Assert.assertTrue("Should have 2 history!", superCalculatorPage.getNumberOfHistoryEntries() == 2);

        superCalculatorPage.add("5", "6");
        Assert.assertTrue("Should have 2 history!", superCalculatorPage.getNumberOfHistoryEntries() == 3);

    }

    @After
    public void tearDown() throws Exception {
        ngDriver.quit();
    }


}

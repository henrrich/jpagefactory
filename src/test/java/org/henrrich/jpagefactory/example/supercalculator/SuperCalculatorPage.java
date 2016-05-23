package org.henrrich.jpagefactory.example.supercalculator;

import org.henrrich.jpagefactory.How;
import org.henrrich.jpagefactory.annotations.FindAll;
import org.henrrich.jpagefactory.annotations.FindBy;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by hehuan on 23/05/2016.
 */
public class SuperCalculatorPage {

    @FindBy(how = How.MODEL, using = "first")
    private WebElement firstNumber;

    @FindBy(how = How.INPUT, using = "second")
    private WebElement secondNumber;

    @FindBy(how = How.ID, using = "gobutton")
    private WebElement goButton;

    @FindBy(how = How.BINDING, using = "latest")
    private WebElement latestResult;

    @FindAll({
            @FindBy(how = How.REPEATER, using = "result in memory")
    })
    private List<WebElement> history;

    public void add(String first, String second) throws InterruptedException {
        firstNumber.clear();
        secondNumber.clear();

        firstNumber.sendKeys(first);
        secondNumber.sendKeys(second);

        goButton.click();

        TimeUnit.SECONDS.sleep(5);
    }

    public int getNumberOfHistoryEntries() {
        return history.size();
    }

    public String getLatestResult() {
        return latestResult.getText();
    }

}

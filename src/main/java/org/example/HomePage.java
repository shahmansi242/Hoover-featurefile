package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends Utils {

    // verify User is on Home page
    public void verifyUserIsOnHomePage()
    {
        assertURL("demo.nopcommerce");
    }
     // user hoover over
    public void hooverOverCategory(String category){
        WebElement link_category = driver.findElement(By.linkText(category));
        Actions builder = new Actions(driver);
        Action mouseOverCategory = builder.moveToElement(link_category).build();
        mouseOverCategory.perform();

    }
      // user click on subcategory
    public void clickOnSubcategory(String subcategory){
        clickOnElement(By.linkText(subcategory));

    }
      // user navigate to subcategory page successfully
    public void userNavigateToSubcategoryPageSuccessfully(String subcategory){
        assertURL(subcategory);


    }


}



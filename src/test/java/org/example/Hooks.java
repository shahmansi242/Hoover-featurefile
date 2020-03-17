package org.example;

import io.cucumber.java.Before;

public class Hooks extends Utils {
    @Before
    public void openBrowser ()
    {   BrowserSelector browserSelector = new BrowserSelector();

        browserSelector.openBrowser();


    }
}

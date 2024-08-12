package com.example;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class WebCalculatorTest {
    public static void main(String[] args) throws Exception {

        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            Page page = browser.newPage();
            page.navigate("http://127.0.0.1:5500/calc/index.html");
            //page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("example.png")));

            page.locator("#inp1").fill("10");
            TimeUnit.SECONDS.sleep(3);
            page.locator("#op").selectOption("+");
            TimeUnit.SECONDS.sleep(3);
            page.locator("#inp2").fill("20");
            TimeUnit.SECONDS.sleep(3);
            page.locator("button").click();
            TimeUnit.SECONDS.sleep(3);
            String result = page.locator("#result").innerText();
            System.out.println("Result: " + result);

        }

    }
}

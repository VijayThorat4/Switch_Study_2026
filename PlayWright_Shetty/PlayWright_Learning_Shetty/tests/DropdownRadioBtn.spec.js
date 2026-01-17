const { test, expect } = require('@playwright/test');

// Test to fetch all product names from a shopping site without knowning number of products - Udemy session 16
test('Dropdown Radio Button Link - session 20', async ({ page }) => {
    await page.goto("https://rahulshettyacademy.com/loginpagePractise/");
    const username = page.locator('#username');
    const signIn = page.locator('#signInBtn');
    const documentLink = page.locator("[href*='documents-request']");
    const dropdown = page.locator("select.form-control");

    await dropdown.selectOption("consult");
    await page.locator(".radiotextsty").last().click();     // selecting the last radio option
    await page.locator("#okayBtn").click();
    
    console.log (await page.locator(".radiotextsty").last().isChecked());   // printing radio button is checked or not True or False
    await expect (page.locator(".radiotextsty").last()).toBeChecked();      // asserting if radio option is checked or not

    await page.locator("#terms").click();
    await expect(page.locator("#terms")).toBeChecked();
    await page.locator("#terms").uncheck();
    expect(await page.locator("#terms").isChecked()).toBeFalsy();

    // Working with blinking Link
    await expect(documentLink).toHaveAttribute("class", "blinkingText");   // check whether if any element has specific attribute or not


})
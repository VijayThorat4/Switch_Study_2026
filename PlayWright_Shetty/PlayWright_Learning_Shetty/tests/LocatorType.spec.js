import { test, expect } from '@playwright/test';
 
    // Using different types of locators
test('Playwright Special locators - Session 37', async ({ page }) => {
  
    await page.goto("https://rahulshettyacademy.com/angularpractice/");
    await page.getByLabel("Check me out if you Love IceCreams!").click();   // this html element has label tag like div, li
    await page.getByLabel("Employed").check();
    await page.getByLabel("Gender").selectOption("Female");     // here 'Gender' is label of dropdown & from there were are selecting 'Female' option
    await page.getByPlaceholder("Password").fill("abc123");     // here 'Password' field is having 'Password' as placeholder attribute
    await page.getByRole("button", {name: 'Submit'}).click();   // here there are multiple elements with 'button' role, so we are passing second argument as 'name' with as 'Submit'
    // here its not necessory to have role as button in html, but if that element itself is button then it will work. Same with link (hyperlink) also
    await page.getByText("Success! The Form has been submitted successfully!.").isVisible();
    await page.getByRole("link",{name : "Shop"}).click();       // here element in hyperlink means its a link, so we can filter it with link role
    
    // below step we want to click on Shop button for Nokia Edge. So we are finding all locators (products) with tag as 'app-card', filtering them with Text & clicking on Shop button by locator chaining
    await page.locator("app-card").filter({hasText: 'Nokia Edge'}).getByRole("button").click();
 
    //locator(css)
 
});
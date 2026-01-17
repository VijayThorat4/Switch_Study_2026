const { test, expect } = require('@playwright/test');

// Test to fetch all product names from a shopping site without knowning number of products - Udemy session 16
test('Web Client App login - session 16', async ({ page }) => {
   const email = "anshika@gmail.com";
   const productName = 'zara coat 3';
   const products = page.locator(".card-body");
   await page.goto("https://rahulshettyacademy.com/client");
   await page.locator("#userEmail").fill(email);
   await page.locator("#userPassword").fill("Iamking@000");
   await page.locator("[value='Login']").click();
   await page.waitForLoadState('networkidle');      // it will wait till all the network calls come to idle state means all calls gets completed in the network tab
   await page.locator(".card-body b").first().waitFor();    // its another option for above line, here we are waiting till all the elements matching this locator gets loaded
   const titles = await page.locator(".card-body b").allTextContents();
   console.log(titles); 

})
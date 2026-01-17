const { test, expect } = require('@playwright/test');

test('@Child windows hadl', async ({browser})=>
 {
    const context = await browser.newContext();
    const page =  await context.newPage();
    const userName = page.locator('#username');
    await page.goto("https://rahulshettyacademy.com/loginpagePractise/");
    const documentLink = page.locator("[href*='documents-request']");
 
	// both the events means clicking on page tab of child window & switching control to new page has to be done parallely
    const [newPage]=await Promise.all(      // Promise.all() functions returns array
   [
      context.waitForEvent('page'),	//listen for any new page pending,rejected,fulfilled
      documentLink.click()
   ])
   
   // Extracting the email from complete string
    const  text = await newPage.locator(".red").textContent();
    const arrayText = text.split("@")
    const domain =  arrayText[1].split(" ")[0]
    console.log(domain);
	
	// Entring the fetched string from new window back to element from original window
    await page.locator("#username").fill(domain);
    console.log(await page.locator("#username").inputValue());
 })
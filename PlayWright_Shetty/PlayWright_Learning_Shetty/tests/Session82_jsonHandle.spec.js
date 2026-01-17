const {test, expect} = require('@playwright/test')
const testData = JSON.parse(JSON.stringify(require("../utils/TestData.json")))  // here we are converting JSON to String to JS object

// Basic test to login to an application - Udemy initial session
test('JSON Data Handle - Session82', async ({page})=>
{
    const username = page.locator('#username');
    const signIn = page.locator('#signInBtn');
    await page.goto("https://rahulshettyacademy.com/loginpagePractise/");
    console.log(await page.title());

    await username.fill(testData.username);
    await page.locator("[type='password']").fill(testData.password);
    await signIn.click()
});

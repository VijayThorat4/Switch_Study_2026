const {test, expect} = require('@playwright/test')
const testData = JSON.parse(JSON.stringify(require("../utils/TestData.json")))  // here we are converting JSON to String to JS object

const {customFixture} = require('../utils/CustomFixture')

// Basic test to login to an application - Udemy initial session
customFixture('Custom Fixture - Session83', async ({page, testDataLogin})=>
{
    const username = page.locator('#username');
    const signIn = page.locator('#signInBtn');
    await page.goto("https://rahulshettyacademy.com/loginpagePractise/");
    console.log(await page.title());

    await username.fill(testDataLogin.username);
    await page.locator("[type='password']").fill(testDataLogin.password);
    await signIn.click()
});
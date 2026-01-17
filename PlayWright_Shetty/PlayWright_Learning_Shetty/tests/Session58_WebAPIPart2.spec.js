// Here we login once through UI only & after login we collect all login info (like headers, cookies etc) through ‘storageState()’ method 
// & store it in one json file. Next time when the browser opens, we can inject that json file directly into the browser.

const { test, expect} = require('@playwright/test');
let webContext;

test.beforeAll(async({browser})=>
{
  const context = await browser.newContext();
  const page =  await context.newPage();
  await page.goto("https://rahulshettyacademy.com/client");
  await page.locator("#userEmail").fill("vijaysinhathorat@yahoo.com");
  await page.locator("#userPassword").fill("Rahul004@"); 
  await page.locator("[value='Login']").click();
  await page.waitForLoadState('networkidle');
  await context.storageState({path: 'state.json'});   // here we are storing all the cookies, headers in state.json file
  webContext = await browser.newContext({storageState:'state.json'});   // in new browser session, we are injecting the same state.json file
})

test('Login Bypass - Session 58', async()=>
{
  const email ="";
  const productName = 'Zara Coat 4';
  const page = await webContext.newPage();

  await page.goto("https://rahulshettyacademy.com/client");
  const products = page.locator(".card-body");
  const titles = await page.locator(".card-body b").allTextContents();
  console.log(titles);
})

 
 
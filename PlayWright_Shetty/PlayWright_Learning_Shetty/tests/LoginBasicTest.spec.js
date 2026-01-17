const {test, expect} = require('@playwright/test')

// Basic test to login to an application - Udemy initial session
test('Login  Test', async ({page})=>
{
    const username = page.locator('#username');
    const signIn = page.locator('#signInBtn');
    await page.goto("https://rahulshettyacademy.com/loginpagePractise/");
    console.log(await page.title());

    await username.fill("rahulshetty");
    await page.locator("[type='password']").fill("learning");
    await signIn.click();

    console.log(await page.locator("[style*='block']").textContent());      // printing invalid credentials message
    await expect(page.locator("[style*='block']")).toContainText("Incorrect");  // assertion of invalid credentials message

    // Entring correct credentails 
    await username.fill("");    // this way it will clear the existing text in the field
    await username.fill("rahulshettyacademy");
    await signIn.click();

    console.log(await page.locator(".card-body a").first().textContent());  // this CSS locator is similar to xpath //div[@class='card-body']//a
    //with first() method, we are fetching the first matching element

    console.log(await page.locator(".card-body a").last().textContent());   // fetcing last matching element
    console.log(await page.locator(".card-body a").nth(1).textContent());   // fetching second mathing element


    // Fetching all the elements matching the locator
    const cardTitles = page.locator(".card-body a");
    const allTitles = await cardTitles.allTextContents();
    console.log(allTitles);


});
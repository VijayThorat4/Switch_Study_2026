// Simple program to fetch token from API response 

const {test, expect, request} = require('@playwright/test');

// Creating a payload object
const loginPayLoad = {userEmail:"vijaysinhathorat@yahoo.com",userPassword:"Rahul004@"};

test("Fetching Token from API Response - Session 49", async ()=>
{
    const apiContext = await request.newContext();

    // Proving the POST request details
    const loginResponse = await apiContext.post("https://rahulshettyacademy.com/api/ecom/auth/login", 
    {
        data: loginPayLoad
    })
    
    // console.log(loginResponse);                          // printing the complete response
    expect(loginResponse.ok()).toBeTruthy();                // ok() method will return true only if response is from 2XX family
    const loginResponseJson = await loginResponse.json();   // storing the response in a variable in json format
    const token = loginResponseJson.token;                  // fetching the token from response
    console.log(token);                                     // printing the token
})
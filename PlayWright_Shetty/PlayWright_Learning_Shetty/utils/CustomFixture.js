const base = require('@playwright/test');

exports.customFixture = base.test.extend(
{
testDataLogin : {
    username:"vijaysinhathorat@yahoo.com",
    password:"Rahul004@"
}

}


)
Feature: user registration form
Scenario: valid user details
Given User is in the registration page to register
When User enter "archu1" 
And first name "archana" 
And last name "devi" 
And password "arch123"
And confpassword "arch123" 
And select gender
And mail "arch12@gmail.com" 
And phno "9876543214" 
And dob "12/12/1995" 
And place "Bangalore" 
And ques  
And answer "Blue"
Then user must be in registration page
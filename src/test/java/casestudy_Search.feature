Feature: search for Product

Scenario: Searching headphones
Given open browser
When login and search for product
Then Payment done

Scenario: Unsuccessful search
Given  again open browser
When login and search for product which is not available
Then payment unsuccessfull 

Scenario: search blank
Given open browser again when blank
When login and no search 
Then unsuccessfull when blank
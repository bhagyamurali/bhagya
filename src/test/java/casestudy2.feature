Feature: Scenario Outline File
Scenario Outline: Login
Given user not logged in
When user performs login using "<username>" and "<password>"
Then logged in Successfully
Examples:
|username||password|
|lalitha||Password123|
|archu1||arch123|
Feature: searching products
Scenario Outline: searching products on google

Given  i am on the google home page 

When  i enter the "<product_name>"
And i clink on the search button

Then i see the realted search reesults successfully

Examples:
|product_name|
|Football   |
|Computer   |
|Toys       |
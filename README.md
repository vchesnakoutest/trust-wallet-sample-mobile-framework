# This is a sample framework for Trust Wallet Mobile Apps (Android)

[Click to view video presentation about the framework](https://github.com/vchesnakoutest/trust-wallet-sample-mobile-framework/blob/main/src/TW_Video_Presentation.mp4)

What was implemented:
1. 5 test cases for 'Create Wallet' feature
2. 1 sample test to demonstrate screenshot on test failure feature
2. Page Object Model (POM) design pattern
3. Service layer for UI validation
4. Logging (Log4j)
5. Reporting (Allure)
6. Test Listeners

How to generate Allure report:

1. Run the tests using the command:
   ```
   mvn clean test
   ```
2. Generate the Allure report using the command:
   ```
    allure serve target/allure-results
    ```
   
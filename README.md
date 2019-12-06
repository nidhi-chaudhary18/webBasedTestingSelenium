Automated test example in Java with Cucumber and Selenium WebDriver
This project is an example of UI automated functional test for Amazon and add product using Selenium and Cucumber.

Test scenarios are described in the feature files located here ./src/test/resources/common/webTestingAmazonProducts.feature.
Installation
You need to have Java 8 JDK installed along with maven.

To run the tests locally with Chrome, install ChromeDriver from here
To install all dependencies, run

$ mvn clean install
Running tests
$ mvn test
By default, tests will run on Chrome.

You can also select specific scenarios to execute using -Dcucumber.options="--tags @your_tag" and add your tag in the feature file.


WARNING: There is a robot check at launching of the Amazon.com for which I have added 15 seconds wait during which it should be handled manually.
I have to change the section and quantity for automation purpose only.


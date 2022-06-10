
# Simple Amazon Test

### About the project

Simple Test that access Amazon web page and validate "About this Item" for the second most expensive TV.

### Project Dependencies

*JDK 11
*Maven 3.5.3
*Chrome (latest)
*ChromeDriver 102

### Project Decisions
* Simple [Cucumber](https://docs.cucumber.io/) feature to better describe the steps on test execution
* [Page Object Pattern](https://martinfowler.com/bliki/PageObject.html) has been implemented for better readability. That means that each java class represent a page that Selenium Interacts with, including its mapped page elements.

### Project Structure

               .
               +-- src
                  +-- test
                  |   +-- java
                  |   |  +-- pages
                  |   |      +-- BasePage
                  |   |      +-- FilterMenu
                  |   |      +-- HomePage
                  |   |      +-- MainMenu
                  |   |      +-- ProductPage
                  |   |      +-- ResultPage
                  |   |  +-- stepdefinition
                  |   |      +-- StepDefinition
                  |   |      +-- TestRunner
                  |   +-- resources
                  |          +-- amazon.feature
                  |          +-- junit-platform.properties
               +-- .gitignore
               +-- docker-compose.yml
               +-- Dockerfile
               +-- pom.xml
               +-- README.md

### Installation Instructions

* Project Installation

             $ git clone https://github.com/tjustinosantos/amazon-test.git

  Install docker  https://docs.docker.com/docker-for-mac/install/

### Running Tests locally

            $ mvn test

### Running Tests with Docker (Selenium Grid setup)

             $ docker-compose -f docker-compose.yml up -d

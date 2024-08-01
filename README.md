Overview
This project provides a base class for Selenium WebDriver using Java, designed to help streamline the setup and teardown processes for your automated tests. It includes configurations for browser settings, driver initialization, and common utilities to facilitate efficient test automation.

Features
Initialization of WebDriver for multiple browsers (Chrome, Firefox, etc.)
Browser-specific configurations
Common utility methods for handling waits, screenshots, and more
Centralized setup and teardown methods
Easy-to-extend structure for creating custom test cases
Requirements
Java Development Kit (JDK) 8 or higher
Maven (for dependency management)
Selenium WebDriver
Browser drivers (e.g., ChromeDriver, GeckoDriver)
Getting Started
Prerequisites
Ensure you have the following software installed:

JDK 8 or higher
Maven
ChromeDriver or GeckoDriver (depending on your browser choice)
Installation
Clone the repository:

sh
Copy code
git clone https://github.com/yourusername/selenium-base-class.git
cd selenium-base-class
Install dependencies:

sh
Copy code
mvn clean install
Configuration
Configure your browser drivers in the src/main/resources/config.properties file:

properties
Copy code
chrome.driver.path=/path/to/chromedriver
firefox.driver.path=/path/to/geckodriver
default.browser=chrome
Running Tests
Build the project:

sh
Copy code
mvn clean compile

Contributing
Contributions are welcome! Please submit a pull request or open an issue to discuss improvements or bugs.

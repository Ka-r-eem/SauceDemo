# Automation Testing Framework

## Overview

This project is a UI Test Automation Framework developed using Java and Selenium WebDriver to automate end-to-end test scenarios on the SauceDemo e-commerce application.

The framework follows the Page Object Model (POM) design pattern to improve maintainability, scalability, and code reusability. Test data is managed through Excel files and integrated using TestNG Data Providers to support data-driven testing.

---

## Technologies Used

* Java
* Selenium WebDriver
* TestNG
* Maven
* Apache POI
* Page Object Model (POM)
* Data Provider
* WebDriverManager

---

## Project Structure

```
src
├── main
│   ├── java
│   │   ├── pages
│   │   ├── utils
│   │   └── constants
│
├── test
│   ├── java
│   │   ├── tests
│   │   ├── DataProviders
│   │   └── base
│   │
│   └── resources
│       └── testdata.xlsx
```

---

## Framework Features

### Authentication Testing

* Valid Login
* Invalid Login
* Login using Data Provider

### Product Management

* Add Product to Cart
* Remove Product from Cart
* Verify Cart Contents

### Checkout Process

* Enter Customer Information
* Complete Purchase Flow
* Verify Successful Order Completion

### Data-Driven Testing

* Read test data from Excel files
* Execute multiple test scenarios using TestNG Data Providers

### Reusable Components

* Browser setup and teardown
* Explicit waits
* Common Selenium actions
* Centralized locators and utilities

---

## Design Patterns Implemented

### Page Object Model (POM)

Each page is represented by a dedicated class containing:

* Web Elements
* Page Actions
* Business Logic

Benefits:

* Better maintainability
* Reduced code duplication
* Easier test scalability

---

## Automated End-to-End Scenario

The framework automates the complete user journey:

1. Login with valid credentials
2. Add product to cart
3. Open cart
4. Proceed to checkout
5. Enter customer information
6. Complete purchase
7. Verify successful order confirmation

---

## Test Data

Test data is stored externally in Excel files and loaded dynamically using Apache POI.

Example:

| Username      | Password     | First Name | Last Name | Postal Code |
| ------------- | ------------ | ---------- | --------- | ----------- |
| standard_user | secret_sauce | John       | Smith     | 12345       |

---

## How to Run

### Clone Repository

```bash
git clone <repository-url>
```

### Install Dependencies

```bash
mvn clean install
```

### Execute Tests

```bash
mvn test
```

### Run Specific TestNG Suite

```bash
mvn test -DsuiteXmlFile=testng.xml
```

---

## Key Learning Outcomes

* Selenium WebDriver Automation
* TestNG Framework
* Data-Driven Testing
* Apache POI Integration
* Page Object Model Design Pattern
* Maven Dependency Management
* Automation Framework Architecture
* End-to-End Test Automation

---

## Author

Kareem Amin

Junior QA Automation Engineer

Focused on building scalable and maintainable automation frameworks using Selenium, Java, and TestNG.

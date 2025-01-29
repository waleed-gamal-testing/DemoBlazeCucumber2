# Automation Testing Framework with Selenium, TestNG & Cucumber

## Overview
This project is a robust automation testing framework built using **Selenium WebDriver**, **TestNG**, and **Cucumber**, following best practices in test automation. It incorporates **Data Provider**, **Data Faker** for dynamic test data generation, and **Page Object Model (POM)** for maintainability. The framework utilizes **Driver Factory** and **Driver Holder** for efficient WebDriver management, generates **professional reports**, and follows industry-standard **design patterns**.

## Features
- **Selenium WebDriver**: Automates web applications efficiently.
- **TestNG & Cucumber**: Supports BDD with Cucumber and powerful test execution with TestNG.
- **Driver Factory & Driver Holder**: Manages WebDriver instances efficiently.
- **Data Provider**: Enables parameterized tests for data-driven testing.
- **Data Faker**: Generates dynamic and realistic test data.
- **Page Object Model (POM)**: Ensures better code organization and maintainability.
- **Locators (Static & Dynamic)**: Uses optimized locators for stable test execution.
- **Best Design Patterns**: Implements patterns like **Factory, Singleton, and Fluent Interface**.
- **Professional Reports**: Generates detailed execution reports using **Extent Reports / Allure Reports**.

## Technologies Used
- **Java** (Primary language)
- **Selenium WebDriver**
- **TestNG**
- **Cucumber** (for BDD testing)
- **Maven** (Build tool)
- **DataFaker** (for generating test data)
- **Extent Reports / Allure Reports** (for reporting)
- **Git & GitHub** (for version control)

## Project Structure
```
AutomationTestingFramework/
│-- src/
│   ├── main/
│   │   ├── pages/         # Page Object Model classes
│   │   ├── utils/         # Utilities (data generators, helper methods)
│   │   ├── config/        # Configuration files
│   │   ├── factory/       # Driver Factory for WebDriver instances
│   │   └── holder/        # Driver Holder for session management
│   ├── test/
│   │   ├── testcases/     # Test scripts
│   │   ├── testdata/      # Data provider classes
│   │   ├── features/      # Cucumber feature files
│   │   └── reports/       # Reports generated after execution
│-- pom.xml                # Maven dependencies
│-- README.md              # Project documentation
```

## Installation & Setup
1. **Clone the repository**
   ```sh
   git clone https://github.com/yourusername/AutomationTestingFramework.git
   cd AutomationTestingFramework
   ```
2. **Install dependencies**
   ```sh
   mvn clean install
   ```
3. **Run Tests**
   ```sh
   mvn test
   ```

## Test Execution & Reporting
- The framework supports **parallel execution** using TestNG XML configurations.
- **Cucumber scenarios** can be executed using predefined runners.
- After execution, reports are generated in the `reports/` directory.
- **To view Extent Reports**, open `index.html` inside the reports folder.

## Contributing
Contributions are welcome! Please follow these steps:
1. Fork the repository.
2. Create a new branch (`feature-branch-name`).
3. Commit your changes and push to GitHub.
4. Open a Pull Request.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

**Happy Testing! 🚀**


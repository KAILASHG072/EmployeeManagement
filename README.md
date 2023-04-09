
# Employee Management System

This is a basic Employee Management System web application built using Spring Boot and Thymeleaf as the template engine.

## Features
- Display all employees
- Add new employee
- Edit employee
- Delete employee

## Technologies Used
- Spring Boot
- Thymeleaf
- HTML
- CSS
- Bootstrap

## How to Run
1. Clone the repository.
2. Open the project in an IDE (Eclipse, IntelliJ, etc.).
3. Build the project using Maven.
4. Run the `EmployeeManagementApplication` class as a Java Application.
5. Open a web browser and go to `http://localhost:8080/home` to access the application.

## Project Structure
```
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com.employee.management/
│   │   │       ├── controller/
│   │   │       │   ├── EmployeeController.java
│   │   │       │   └── HomeController.java
│   │   │       ├── model/
│   │   │       │   └── Employee.java
│   │   │       ├── repository/
│   │   │       │   └── EmployeeRepository.java
│   │   │       ├── service/
│   │   │       │   └── EmployeeService.java
│   │   │       ├── EmployeeManagementApplication.java
│   │   │       └── WebConfig.java
│   │   └── resources/
│   │       ├── static/
│   │       │   └── css/
│   │       │       └── style.css
│   │       └── templates/
│   │           ├── add.html
│   │           ├── edit.html
│   │           ├── home.html
│   │           └── layout.html
│   └── test/
│       └── java/
├── .gitignore
├── HELP.md
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## Contributors
- Kailash ([@KAILASHG072](https://github.com/KAILASHG072))


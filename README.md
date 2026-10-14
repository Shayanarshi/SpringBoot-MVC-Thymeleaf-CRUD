# Employee Management System

A web-based Employee Management System built using Java and Spring Boot. This project implements CRUD operations to manage employee records through a simple user interface.

## Tech Stack

- **Language:** Java
- **Backend:** Spring Boot, Spring MVC
- **Frontend:** Thymeleaf, HTML, CSS
- **Database:** MySQL
- **ORM:** Spring Data JPA, Hibernate
- **Build Tool:** Maven

## Features

- Add new employee records
- View all employees
- Update employee details
- Delete employee records
- Search employees by ID
- Store employee data in MySQL

## Architecture

The application follows a layered architecture:

`Controller → Service → Repository → Database`

- **Controller:** Handles HTTP requests and responses.
- **Service:** Contains business logic.
- **Repository:** Interacts with the database using Spring Data JPA.
- **Entity:** Represents employee data.
- **Thymeleaf:** Renders dynamic HTML pages.

## Employee Details

The application manages the following fields:

- Employee Number
- Employee Name
- Department
- Salary

## Prerequisites

- Java JDK
- Maven
- MySQL Server
- An IDE such as IntelliJ IDEA or VS Code

## How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/Shayanarshi/SpringBoot-MVC-Thymeleaf-CRUD.git
   ```

2. Open the project in your IDE.

3. Create a MySQL database and configure your database connection in `application.properties`.

4. Run the Spring Boot application.

5. Open `http://localhost:8080` in your browser.

## Future Improvements

- Add employee search and pagination
- Implement form validation
- Add Spring Security authentication and authorization

## Author

**Shayan Arshi**

[GitHub](https://github.com/Shayanarshi)

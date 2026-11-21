# Employee Management System

A simple Employee Management System developed using **Java and Spring Boot**. This project demonstrates how to build a backend application with database integration using Spring Boot.

## 🚀 Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Eclipse IDE

## ✨ Features

- Add new employee details
- Retrieve employee information
- Update employee details
- Delete employee records
- Store employee information in a MySQL database

## 🏗️ Project Structure

```text
Employe
 └── src
     └── main
         ├── java
         │   └── com.example.Employe
         │       ├── model
         │       ├── repository
         │       ├── service
         │       └── controller
         └── resources
             └── application.properties
```

## ⚙️ Database Configuration

Create a MySQL database:

```sql
CREATE DATABASE employeesdb;
```

Configure your `application.properties` file:

```properties
server.port=9999

spring.datasource.url=jdbc:mysql://localhost:3306/employeesdb
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Replace `YOUR_PASSWORD` with your MySQL password.

## ▶️ How to Run the Project

1. Clone this repository.
2. Import the project into Eclipse IDE as an existing Maven project.
3. Configure your MySQL database.
4. Update database credentials in `application.properties`.
5. Run the Spring Boot application.
6. Test the API endpoints using Postman.

## 🎯 Project Objective

The main objective of this project is to understand Spring Boot application development, REST API creation, database connectivity, and CRUD operations using Spring Data JPA.

## 👨‍💻 Developer

**Ajay Kumar Payili**

B.Tech – Computer Science and Engineering (AI & ML)

GitHub: [payiliajaykumar-creator](https://github.com/payiliajaykumar-creator)

---

⭐ If you find this project useful, feel free to explore the repository!

# CrudRestApi

# Todo CRUD Application

This is a simple Todo CRUD (Create, Read, Update, Delete) operations project built using Spring Boot, Spring Data JPA, MySQL, and Spring Web.

## Overview

This application allows users to manage their todo tasks with basic CRUD operations. Users can create new tasks, view a list of tasks, update existing tasks, and delete tasks when they are completed.

## Requirements

- Java 8 or higher
- Maven 3.2+
- MySQL

## Getting Started


Configure MySQL:

Create a MySQL database named todo_db.

Update the application.properties file with your MySQL username and password:


spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
spring.datasource.username=your_username
spring.datasource.password=your_password
Run the application:

You can run the application using Maven or your preferred IDE.

Using Maven:


mvn spring-boot:run
Access the application:

Once the application is running, you can access it at http://localhost:8080.

Endpoints
The following endpoints are available:

GET /tasks: Get all tasks.
GET /tasks/{id}: Get a task by ID.
POST /tasks: Create a new task.
PUT /tasks/{id}: Update an existing task.
DELETE /tasks/{id}: Delete a task by ID.
Project Structure
The project structure follows the standard Maven project structure for a Spring Boot application:

bash
Copy code
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── todo
│   │   │               ├── controller      # REST Controller classes
│   │   │               ├── entity          # Entity classes (TaskEntity)
│   │   │               ├── repository      # Spring Data JPA repositories (TaskRepository)
│   │   │               ├── service         # Service classes (TaskService)
│   │   │               └── TodoApplication # Main Spring Boot application class
│   │   └── resources
│   │       └── application.properties      # Application configuration file
│   └── test                                # Test classes
└── pom.xml                                # Maven project configuration file
Technologies Used
Java
Spring Boot
Spring Data JPA
MySQL
Spring Web (Spring MVC)
Usage
Creating a new task:

Endpoint: POST /tasks
Request Body:
json

{
  "taskName": "Complete Todo App",
  "taskDate": "2024-03-25",
  "isCompleted": false
}
Getting all tasks:

Endpoint: GET /tasks
Response:
json


  {
    "id": 1,
    "taskName": "Complete Todo App",
    "taskDate": "2024-03-25",
    "isCompleted": false
  },
  {
    "id": 2,
    "taskName": "Review Documentation",
    "taskDate": "2024-03-28",
    "isCompleted": true
  }

Updating a task:

Endpoint: PUT /tasks/{id}
Request Body:
json

{
  "taskName": "Review Updated Documentation",
  "taskDate": "2024-03-29",
  "isCompleted": true
}
Deleting a task:

Endpoint: DELETE /tasks/{id}

Contributing
Contributions are welcome! Feel free to open an issue or submit a pull request.

License
This project is licensed under the MIT License - see the LICENSE file for details.

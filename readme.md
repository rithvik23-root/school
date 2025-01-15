# School App Backend

This repository contains the backend implementation for a school application built using **Spring Boot**. The app enables users to perform different tasks based on their roles:

- **Students**: View the list of questions posted by teachers.
- **Teachers**: Post questions for students to view.

The application is backed by a **MySQL database** to store user information, questions, and other related data.

---

## Features

### 1. User Roles
- **Student**:
  - View all questions posted by teachers.
- **Teacher**:
  - Post new questions.

### 2. Authentication and Authorization
- Role-based access control to ensure that only teachers can post questions and only students can view questions.

### 3. Question Management
- Teachers can create questions.
- Students can view all posted questions.

### 4. Database
- Persistent storage of user and question data using **MySQL**.

---

## Technologies Used

### Backend
- **Spring Boot**:
  - REST API development
  - Role-based security with Spring Security
  - Data persistence with Spring Data JPA
- **MySQL**:
  - Relational database for data storage
- **Maven**:
  - Build and dependency management

---

## Setup Instructions

### Prerequisites
- **Java 17** or later
- **Maven**
- **MySQL**

### Steps to Run

1. Clone the repository:
   
   git clone https://github.com/rithvik23-root/school.git
   cd school
   

2. Configure the database:
   - Create a database in MySQL:
     ```sql
     CREATE DATABASE school;
     ```
   - Update the `application.properties` file with your MySQL credentials:
     
     spring.datasource.url=jdbc:mysql://localhost:3306/school
     spring.datasource.username=your_username
     spring.datasource.password=your_password
     spring.jpa.hibernate.ddl-auto=update
    

3. Build and run the application:
   
   mvn clean install
   mvn spring-boot:run
   

4. Access the application:
   - API base URL: `http://localhost:8080`

---

## API Endpoints

### Authentication
- **SignUp**: `POST /api/creds`
  - Request Body:
    ```json
    {
      "email": "user@example.com",
      "password": "password",
      "role":"role"
    }
    ```
- **Login**: `GET /api/creds/:emailId`
  

### Questions
- **Get All Questions** (Students): `GET /api/questions`
- **Post a Question** (Teachers): `POST /api/questions`
  - Request Body:
    ```json
    {
      "question": "What is Spring Boot?"
      
    }
    ```

---

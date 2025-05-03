# Student Management System - Spring Boot REST API

This is a simple Student Management REST API built using **Spring Boot**, **Spring Data JPA**, and **MySQL**.  
It allows basic **CRUD** operations on student data.

---

## Features

- ✅ Get all students
- ✅ Get student by ID
- ✅ Add new student
- ✅ Update existing student
- ✅ Delete student by ID

---

## Technologies Used

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL
- Maven

---

## API Endpoints

Base URL: `http://localhost:8080/students`

| Method | Endpoint                | Description               |
|--------|-------------------------|---------------------------|
| GET    | `/students`             | Get all students          |
| GET    | `/students/{id}`        | Get student by ID         |
| POST   | `/students/add`         | Add new student           |
| PUT    | `/students/update/{id}` | Update student by ID      |
| DELETE | `/students/delete/{id}` | Delete student by ID      |

---

## Request/Response Example

### ✅ POST `/students/add`

```json
{
  "name": "John Doe",
  "branch": "CSE",
  "percentage": 88.5
}

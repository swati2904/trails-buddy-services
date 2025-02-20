# Trail Services

Trail Services is a Spring Boot application that provides APIs for user authentication, comment management, and more. This document provides an overview of the project structure, features, request and response details, tech stack, and database configuration.

## Content

- [Features](#features)
- [API Endpoints](#api-endpoints)
  - [Authentication](#authentication)
  - [Comments](#comments)
- [Tech Stack](#tech-stack)
- [Database Configuration](#database-configuration)
- [Running the Application](#running-the-application)

## Project Structure


## Features

- User Authentication (Registration and Login)
- JWT-based Authentication
- Comment Management (Create and Retrieve Comments)
- MongoDB Integration
- Exception Handling

## API Endpoints

### Authentication

#### Register

- **URL:** `/api/auth/register`
- **Method:** `POST`
- **Request Body:**
  ```json
  {
    "username": "xyz",
    "email": "xyz@gmail.com",
    "password": "pass123456"
  }

- **Response:**
  ```json
  {
  "id": "user-id",
  "username": "xyz",
  "email": "xyz@gmail.com",
  "password": "encoded-password"
  }

#### Login
- **URL:** `/api/auth/login`
- **Method:** `POST`
- **Request Body:**
  ```json
  {
    "email": "xyz@gmail.com",
    "password": "pass123456"
  }

- **Response:**
  ```json
  {
  "token": "jwt-token",
  "email": "xyz@gmail.com",
  "password": "encoded-password"
  }

- **URL:** `/api/comments`
- **Method:** `POST`
- **Request Body:**
  ```json
  {
  "trailId": "431428080", (example)
  "comment": "Nice Trail!!",
  "ratings": 5,
  "liked": [1, 2],
  "level": 2,
  "access": [1, 2],
  "parkingCost": [0, 1],
  "parkingLotSize": 50,
  "conditions": [1, 2, 3, 4, 5, 7, 9, 10],
  "activityType": 1,
  "activityDate": "2025-01-14T00:00:00Z"
  }

- **Response:**
  ```json
  {
  "id": "comment-id",
  "trailId": "431428080",
  "userId": "user-id",
  "username": "Swati",
  "comment": "Nice Trail!!",
  "ratings": 5,
  "liked": [1, 2],
  "level": 2,
  "access": [1, 2],
  "parkingCost": [0, 1],
  "parkingLotSize": 50,
  "conditions": [1, 2, 3, 4, 5, 7, 9, 10],
  "activityType": 1,
  "activityDate": "2025-01-14T00:00:00Z",
  "createdAt": "2023-10-01T12:00:00"
  }

- **URL:** `/api/comments/{trailId}`
- **Method:** `GET`
- **Query Parameters**:
    page (default: 0)
    size (default: 3)

- **Response:**
  ```json
  {
  "content": [
    {
      "id": "comment-id",
      "trailId": "431428080",
      "userId": "user-id",
      "username": "Swati",
      "comment": "Nice Trail!!",
      "ratings": 5,
      "liked": [1, 2],
      "level": 2,
      "access": [1, 2],
      "parkingCost": [0, 1],
      "parkingLotSize": 50,
      "conditions": [1, 2, 3, 4, 5, 7, 9, 10],
      "activityType": 1,
      "activityDate": "2025-01-14T00:00:00Z",
      "createdAt": "2023-10-01T12:00:00"
    }
  ],
  "pageable": {
    "sort": {
      "sorted": false,
      "unsorted": true,
      "empty": true
    },
    "pageNumber": 0,
    "pageSize": 3,
    "offset": 0,
    "paged": true,
    "unpaged": false
  },
  "totalPages": 1,
  "totalElements": 1,
  "last": true,
  "size": 3,
  "number": 0,
  "sort": {
    "sorted": false,
    "unsorted": true,
    "empty": true
  },
  "numberOfElements": 1,
  "first": true,
  "empty": false
  }


## Tech Stack
- Java 21
- Spring Boot 3.4.2
- Spring Security
- Spring Data MongoDB
- JWT (JSON Web Tokens)
- Maven

## Database Configuration
The application uses MongoDB as the database. The connection details are specified in the application.properties file.

```
spring.data.mongodb.uri=mongodb+srv://<user_name>:<password>@trailsbuddy.bvyzj.mongodb.net/trailsbuddy?retryWrites=true&w=majority&appName=trailsbuddy
```

## Running the Application
To run the application, use the following command:

```
./mvnw spring-boot:run
```

## Additional Configuration

### CORS Configuration
CORS is configured in the WebConfig class to allow requests from http://localhost:3000. (frontend running)

### Security Configuration
Security is configured in the SecurityConfig class. JWT authentication is used to secure the endpoints.

### Exception Handling
Global exception handling is implemented in the GlobalExceptionHandler class.



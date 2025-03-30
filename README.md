# Smart Expense Tracker

## Overview
Smart Expense Tracker is a Spring Boot application that allows users to manage their expenses by categorizing them, tracking spending, and storing data in a MySQL database.

## Features
- **Expense Management:** Add, update, delete, and view expenses.
- **Category Management:** Organize expenses by categories.
- **REST API:** Provides endpoints to interact with expenses and categories.
- **Database Integration:** Uses MySQL for persistent storage.
- **Spring Boot & JPA:** Implements Spring Boot with Spring Data JPA and Hibernate.

## Technologies Used
- **Java 17**
- **Spring Boot 3.5.0**
- **Spring Data JPA**
- **MySQL**
- **Lombok**
- **Spring Web**

## Setup Instructions

### Prerequisites
- Java 17 or later
- MySQL installed and running
- Maven installed

### Steps to Run the Project
1. Clone the repository:
   ```sh
   git clone https://github.com/your-username/Smart-Expense-Tracker.git
   cd Smart-Expense-Tracker
   ```

2. Configure MySQL database:
   - Update the `application.properties` file with your MySQL credentials:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/expense_tracker
     spring.datasource.username=root
     spring.datasource.password=root
     spring.jpa.hibernate.ddl-auto=update
     ```

3. Build and run the application:
   ```sh
   mvn spring-boot:run
   ```

4. The application will start on `http://localhost:8080`.

## API Endpoints

### Categories API
- **Get all categories:** `GET /api/categories`
- **Add a category:** `POST /api/categories`
  ```json
  {
    "name": "Food"
  }
  ```

### Expenses API
- **Get all expenses:** `GET /api/expenses`
- **Get an expense by ID:** `GET /api/expenses/{id}`
- **Add an expense:** `POST /api/expenses`
  ```json
  {
    "description": "Lunch at Subway",
    "amount": 12.50,
    "date": "2025-03-30",
    "category": { "id": 1 }
  }
  ```
- **Update an expense:** `PUT /api/expenses/{id}`
- **Delete an expense:** `DELETE /api/expenses/{id}`

## Contributing
Contributions are welcome! Feel free to fork the repository and submit a pull request.

## License
This project is licensed under the MIT License.


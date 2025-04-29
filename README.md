
# Microservice - Police Entity Management

This project is a simple Spring Boot microservice for managing Police entities.  
It is part of a multi-microservice system built as part of a practical Spring Boot project.

## 📚 Technologies Used

- Java 21
- Spring Boot
- Spring Data JPA
- H2 In-Memory Database
- Lombok
- Maven

## ⚙️ How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/Vraj-x2/microservice-police.git
   ```

2. Navigate into the project directory:
   ```bash
   cd microservice-police
   ```

3. Run the application:
   ```bash
   ./mvnw spring-boot:run
   ```
   or, if you are using Windows:
   ```bash
   mvnw spring-boot:run
   ```

4. The service will start on:
   ```
   http://localhost:8081
   ```

## 🌐 REST API Endpoints

| Method | Endpoint | Description |
|:------|:---------|:------------|
| GET | `/api/police` | Retrieve all police entities |
| GET | `/api/police/{id}` | Retrieve a specific police entity by ID |
| POST | `/api/police` | Create a new police entity |

## 🗄️ Database Information

- **Database**: H2 In-Memory Database
- **URL**: `http://localhost:8081/h2-console`
- **JDBC URL**: `jdbc:h2:mem:testdb`
- **Username**: `sa`
- **Password**: _(empty)_

## 🧩 Project Structure

- `domain/` → Entity classes
- `repository/` → Spring Data JPA repositories
- `service/` → Service interfaces and implementations
- `web/rest/` → REST controllers
- `config/` → Application configuration classes

## 📌 Notes

- Bootstrap class initializes 3 Police entities on startup.
- This microservice connects to a Gateway application in the complete system architecture.

---

## 🚀 Author

[Vraj Contractor](https://github.com/Vraj-x2)

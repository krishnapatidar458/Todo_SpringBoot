# Todo Application (Spring Boot)

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.7.0-green) ![PostgreSQL](https://img.shields.io/badge/PostgreSQL-14-blue) ![Docker](https://img.shields.io/badge/Docker-Enabled-blue)

## 📌 Project Overview
This is a **To-Do List Application** built using **Spring Boot** with **PostgreSQL** as the database and deployed using **Docker**. The application provides a REST API for managing tasks efficiently.

## 🚀 Features
- Create, read, update, and delete (CRUD) tasks.
- Mark tasks as complete or incomplete.
- Filter tasks based on their status.
- Store tasks securely in a **PostgreSQL** database.
- Docker support for easy deployment.
- Structured REST API using **Spring Boot and JPA**.

## 🏗️ Tech Stack
- **Backend:** Spring Boot, Spring Web, Spring Data JPA
- **Database:** PostgreSQL
- **Containerization:** Docker
- **ORM:** Hibernate
- **Build Tool:** Maven

## 🏁 Getting Started

### Prerequisites
Ensure you have the following installed:
- Java 17+
- Maven 3.8+
- Docker (for containerized deployment)
- PostgreSQL

### 🔧 Installation

#### 1️⃣ Clone the Repository
```sh
git clone https://github.com/krishnapatidar458/Todo_SpringBoot.git
cd Todo_SpringBoot
```

#### 2️⃣ Configure the Database
Update the `application.properties` file with your PostgreSQL credentials:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/todo_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

#### 3️⃣ Build and Run the Application
```sh
mvn clean install
mvn spring-boot:run
```

#### 4️⃣ Run with Docker (Optional)
```sh
docker-compose up --build
```

## 📡 API Endpoints

### Task Management
| Method | Endpoint | Description |
|--------|---------|-------------|
| `GET` | `/api/tasks` | Get all tasks |
| `GET` | `/api/tasks/{id}` | Get a specific task by ID |
| `POST` | `/api/tasks` | Create a new task |
| `PUT` | `/api/tasks/{id}` | Update a task |
| `DELETE` | `/api/tasks/{id}` | Delete a task |

## 🧪 Running Tests
```sh
mvn test
```

## 🏗️ Folder Structure
```
Todo_SpringBoot/
├── src/main/java/com/example/todo
│   ├── controller/  # REST Controllers
│   ├── service/     # Business Logic
│   ├── repository/  # Database Layer
│   ├── model/       # Entity Models
│   ├── TodoApplication.java # Main entry point
├── src/main/resources
│   ├── application.properties # Configurations
├── Dockerfile  # Docker setup
├── docker-compose.yml  # Docker Compose file
├── pom.xml  # Maven dependencies
└── README.md  # Project Documentation
```

## 📜 License
This project is licensed under the [MIT License](LICENSE).

## 🤝 Contributing
Contributions are welcome! Please open an issue or submit a pull request.

## 📬 Contact
For any queries, feel free to reach out:
- **Author:** Krishna Patidar
- **GitHub:** [krishnapatidar458](https://github.com/krishnapatidar458)
- **Email:** [kp7patidardudawat@example.com](mailto:kp7patidardudawat@example.com)


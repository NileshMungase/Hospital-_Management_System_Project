# Hospital Management System (HMS)

A comprehensive web-based application designed to streamline hospital operations, built with **Spring Boot**. This system handles appointments, doctor schedules, patient records, and billing with a secure and user-friendly interface.

## 🚀 Features

- **Doctor Management**: Manage doctor profiles, specializations, and availability.
- **Patient Portal**: Patient registration, medical history, and dashboards.
- **Appointment Scheduling**: Seamless booking system for patients and doctors.
- **Prescription Management**: Digital tracking of medications and prescriptions linked to appointments.
- **Billing System**: Automated invoice generation for simplified payment processing.
- **Secure Access**: Role-based authentication (Admin, Doctor, Patient) using Spring Security.

## 🛠️ Technology Stack

- **Backend**: Java 17, Spring Boot 3.2.0
  - Spring Web
  - Spring Data JPA
  - Spring Security
- **Frontend**: Thymeleaf, HTML5, CSS3, JavaScript
- **Database**: H2 In-Memory Database (configured for dev/test environments)
- **Tools**: Maven, Lombok

## ⚙️ Getting Started

### Prerequisites

Ensure you have the following installed:
- **Java Development Kit (JDK) 17** or higher
- **Maven 3.6** or higher

### Installation

1. **Clone the repository** (if using Git):
   ```bash
   git clone <your-repository-url>
   cd Hospital_Management_System_Project
   ```
   *Or simply open the project folder if you have it locally.*

2. **Build the project**:
   ```bash
   mvn clean install
   ```

### ▶️ Running the Application

1. **Start the server** using Maven:
   ```bash
   mvn spring-boot:run
   ```
   Or run the `HmsApplication.java` class directly from your IDE.

2. **Access the Application**:
   Open your browser and navigate to:
   [http://localhost:8080](http://localhost:8080)

### 🗄️ Database Access

The project is pre-configured with an H2 in-memory database for quick testing.

- **H2 Console**: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
- **JDBC URL**: `jdbc:h2:mem:testdb`
- **Username**: `sa`
- **Password**: `password`

## 📂 Project Structure

```plaintext
src/main/java/com/yourcompany/hms
├── controller   # Handles HTTP requests (e.g., BillingController, AdminController)
├── model        # JPA Entities (e.g., Doctor, Patient, Appointment)
├── repository   # Database access interfaces
├── service      # Business logic
└── HmsApplication.java # Entry point
```

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

---
**Hospital Management System Project**

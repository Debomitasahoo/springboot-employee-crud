# Employee Management System (Spring Boot + HTML/CSS/JS)

A simple and user-friendly **Employee Management System** built using  
**Java Spring Boot** for backend APIs and **HTML, CSS, JavaScript** for the frontend.

This project demonstrates full **CRUD operations** (Create, Read, Update, Delete) for employee records.  
It is designed for learning and showcasing how Spring Boot can work with a simple frontend without heavy frontend frameworks.

---

## 🚀 Features

- ➕ Add Employee  
- 📄 View All Employees  
- ✏️ Update Employee Details  
- ❌ Delete Employee  
- ⚡ REST API-based communication  
- 🎨 Clean UI using HTML, CSS, JS  
- 📦 Modular and maintainable backend (Controller → Service → Model)

---

## 🛠️ Tech Stack

### **Backend**
- Java 17+
- Spring Boot
- Spring MVC
- Spring Web (REST APIs)

### **Frontend**
- HTML
- CSS
- JavaScript (Fetch API)

### **Tools**
- Eclipse IDE
- Git & GitHub
- Maven

---
springboot-employee-crud/
├── src/main/java/
│ └── com.form.handling.server
│ ├── controller/ # API endpoints
│ ├── model/ # Employee entity
│ ├── service/ # Business logic
│ └── SpringBootApp.java # Main application
│
├── src/main/resources/
│ ├── static/ # Frontend files
│ │ ├── index.html
│ │ ├── style.css
│ │ └── script.js
│ └── application.properties
│
├── pom.xml
└── README.md


---

## 📡 API Endpoints

| Method | Endpoint       | Description                |
|--------|----------------|----------------------------|
| GET    | `/getEmp`      | Fetch all employees        |
| POST   | `/addEmp`      | Add a new employee         |
| PUT    | `/updateEmp`   | Update employee details    |
| DELETE | `/deleteEmp`   | Delete an employee by ID   |

---

## ▶️ How to Run the Project

### **1. Clone the repository**
```bash
git clone https://github.com/Debomitasahoo/springboot-employee-crud.git

2. Open in Eclipse/IntelliJ
3. Run the Spring Boot application
SpringBootApp.java
Or Using cmd:
mvn spring-boot:run
4. Open Frontend
src/main/resources/static/index.html
The frontend will call backend APIs through:
http://localhost:8083/
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/e4daaa96-d08f-41a5-9ee7-0f1515bb063f" />

Pull requests are welcome. Feel free to fork this repo and enhance the project.
👩‍💻 Author
Debomita Sahoo
Spring Boot Developer 
GitHub: https://github.com/Debomitasahoo



## 📂 Project Structure


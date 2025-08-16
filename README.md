# 📝 To-Do Application

A simple yet elegant **To-Do List Application** built with **Spring Boot**, **Thymeleaf**, and **Bootstrap 5**.  
It lets you add, delete, and toggle (complete/incomplete) tasks, with a modern **space-themed UI** 🌌.

---

## 🚀 Features
- ➕ Add new tasks  
- ✅ Mark tasks as completed / uncompleted  
- ❌ Delete tasks  
- 🎨 Beautiful dark space-themed UI with glowing accents  
- 🗄 Backend powered by Spring Boot + Thymeleaf  
- 📦 Easy to run locally (no extra setup)

---

## 🛠 Tech Stack
- **Backend:** Spring Boot (MVC, Thymeleaf)  
- **Frontend:** Thymeleaf templates, Bootstrap 5, Custom CSS  
- **Database:** H2 (in-memory) *(can be switched to MySQL/PostgreSQL)*  
- **Build Tool:** Maven  

---

## 📸 Screenshot

### Home Page
![App Screenshot](https://github.com/user-attachments/assets/bf5cc427-ac3d-450c-a067-a542b3e6a48d)

---

## ▶️ Getting Started

### 1. Clone the repo
```bash
git clone https://github.com/mukund654/toDoList.git
cd toDoList
```

### 2. Build and run
Using Maven:
```bash
mvn spring-boot:run
```

### 3. Open in browser
```
http://localhost:8080
```

---

## 📂 Project Structure
```
src
 └── main
     ├── java
     │    └── com.app.todoApp
     │          ├── controller   # TaskController (handles web requests)
     │          ├── models       # Task entity
     │          ├── services     # TaskService (business logic)
     │          └── TodoAppApplication.java (main class)
     └── resources
          ├── templates          # Thymeleaf templates (tasks.html)
          ├── static             # CSS, JS, images
          └── application.properties
```



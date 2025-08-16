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

## 📸 Screenshots

### Home Page
![App Screenshot](https://github.com/user-attachments/assets/548aed76-9b47-4539-ae7b-b6be2f2f1c12)

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

---

## 🌟 Future Improvements
- ✏️ Edit/update tasks  
- 📅 Add due dates & priority  
- 👤 Multi-user support with login  
- 📱 Mobile-friendly layout  
- ☁️ Deploy to Heroku / AWS  

---

## 🤝 Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you’d like to change.

---

## 📜 License
This project is licensed under the MIT License.

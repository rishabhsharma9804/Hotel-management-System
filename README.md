# 🏨 Hotel Management System

A role-based hotel management desktop application developed using **Java** and **MySQL**, designed to streamline hotel operations through distinct user roles: **Manager** and **Receptionist**.

> 📅 Completed: February 2024

---

## 🚀 Overview

This application provides two separate login portals:

- 👨‍💼 **Manager**: Full administrative control over hotel operations.
- 🧑‍💻 **Receptionist**: Limited access to day-to-day customer-facing functions.

Each role sees a tailored dashboard and access level, ensuring data security and operational clarity.

---

## 🎯 Features

### 🔐 Role-Based Login System
- Separate login panels for Managers and Receptionists
- Secure login verification via MySQL

### 👨‍💼 Manager Module
- Add, update, or delete rooms
- Manage staff information
- View all bookings and hotel data

### 🧾 Receptionist Module
- Customer check-ins and check-outs
- Booking management
- Service request logging

---

## 🛠️ Tech Stack

| Tech      | Role                        |
|-----------|-----------------------------|
| **Java**  | Core logic & UI (Swing/JavaFX) |
| **MySQL** | Database storage             |
| **JDBC**  | Java–MySQL connector         |
| **NetBeans / VS Code** | Development IDE  |

---

## 🧪 How to Run

### 🔧 Prerequisites
- Java JDK 8+
- MySQL server (with user and password)
- JDBC connector (MySQL Connector/J)

### 🔁 Steps

1. Clone the project:
```bash
git clone https://github.com/YOUR_USERNAME/Hotel-Management-System.git
Import into your Java IDE (NetBeans / Eclipse / IntelliJ / VS Code)

Setup MySQL database:

Open MySQL and run hotel.sql to create the database and tables

Update DB credentials in your code:

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_db", "root", "your_password");
Compile and run the app.
```
📸 Screenshots
Add UI screenshots here: login screen, manager dashboard, receptionist panel, etc.

💡 Future Enhancements
Email confirmation for bookings

Role-based access levels with finer control

Room availability calendar view

REST API or web version

🧑‍💻 Author
Rishabh Sharma
📧 rishabhsharma9804@gmail.com
🌐 GitHub | LinkedIn

📄 License
This project is licensed under the MIT License
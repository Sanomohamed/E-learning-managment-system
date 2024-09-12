# E-learning-managment-system
E-Learning Management System
Overview
The E-Learning Management System is a Java application designed to manage various aspects of an e-learning platform. 
This system allows for managing staff, students, courses, and programs. It includes functionalities for user login, course registration, and program management.

Features
User Authentication: Allows students to log in and sign up.
Course Management: Add, retrieve, and remove courses.
Program Management: Add and remove programs.
Staff Management: Add and retrieve staff, particularly focusing on academic staff.
Course Registration: Students can register for courses and view their registered courses.
Student Management: Add, retrieve, and manage student details

Usage
Upon running the application, the ELearningManagementSystem initializes with predefined staff, students, and courses.
You can interact with the system via a graphical user interface provided by MainFrame. 
This frame provides options for viewing and managing courses, programs, students, and staff.

Example Usage
Login: Use the login method to authenticate students with their username and password.
Signup: New students can be registered using the signup method.
Register Course: Students can register for courses using the registerCourse method.
Get Registered Courses: Retrieve a list of registered courses using getRegisteredCourses.
Code Structure
ELearningManagementSystem.java: Main class that handles application logic, including staff, student, course, and program management.
Staff.java: Class representing staff members.
Student.java: Class representing students and their course registrations.
Course.java: Class representing courses.
Program.java: Class representing academic programs.
RegisteredCourse.java: Class representing a course registration by a student

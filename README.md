# Quiz Management System

Sem – 2nd Degree ENGINEERING
in
Information and Communication Technology Engineering

Faculty of Technology Studies 
Marwadi University, Rajkot

---

## Table of Contents
- [Project Overview](#project-overview)
- [Project Definition](#project-definition)
- [List of Functionalities](#list-of-functionalities)
- [Technology Stack](#technology-stack)
- [Installation](#installation)
- [How to Run](#how-to-run)
- [Contact](#contact)

## Project Overview
The Quiz Management System is a Java-based application designed to facilitate quiz creation and management for faculties and students. The project includes a comprehensive set of features to manage quizzes, handle user authentication, and track student performance. Data is maintained using Excel File Handling.

## Project Definition
The Quiz Management System allows teachers to create and manage quizzes, while students can take quizzes and track their progress. The key functionalities include:

- Login page for teachers and students
- Collection of student and teacher information
- Display of quiz details
- Creation and management of quiz questions
- Display of quiz results
- Teachers can add and update quiz questions


## Technology Stack
- **Frontend:** Java Swing (for GUI)
- **Backend:** Java
- **Database:** Excel File Handling using Apache POI library

## Installation
### Prerequisites
- **Java Development Kit (JDK):** Ensure you have JDK installed.
- **Apache POI Library:** Required for Excel file handling. Include the following JAR files in your project classpath:
  - `commons-collections4-4.1.jar`
  - `poi-3.17.jar`
  - `poi-ooxml-3.17.jar`
  - `poi-ooxml-schemas-3.17.jar`
  - `xmlbeans-2.6.0.jar`

### Steps
1. **Clone the repository:**
    ```bash
    git clone https://github.com/YourUsername/QuizManagementSystem.git
    ```

2. **Navigate to the project directory:**
    ```bash
    cd QuizManagementSystem
    ```

3. **Set up your classpath for the required libraries:** Add the following line to your batch file or run it manually in the terminal.
    ```bash
    set classpath=commons-collections4-4.1.jar;poi-3.17.jar;poi-ooxml-3.17.jar;poi-ooxml-schemas-3.17.jar;xmlbeans-2.6.0.jar;.;
    ```

4. **Compile the Java files:**
    ```bash
    javac -d . *.java
    javac *.java
    ```

5. **Run the project using the provided batch file:**
    ```bash
    java Main_Frame
    ```

## How to Run
1. **Run the batch file:**
    Simply double-click on the `test.bat` file in your project directory. This will automatically compile and run the project.

    Alternatively, you can manually compile and run the project using the following commands:
    ```bash
    javac -d . *.java
    javac *.java
    java Main_Frame
    ```

2. **Application Workflow:**
    - **Main Frame:** The main page where users can choose to log in as a student or teacher.
    - **Student Login:** Students can log in or register, take quizzes, and view their progress.
    - **Teacher Login:** Teachers can log in or register, create and update quizzes, and view quiz details.

## Contact
For any questions or suggestions, please reach out to Hasti Hajipariya at hasti.hajipara@gmail.com or create an issue in the repository.

---

This project was developed during my 2nd semester for the Object Oriented Programming with Java course at Marwadi University. Your feedback and contributions are highly appreciated!

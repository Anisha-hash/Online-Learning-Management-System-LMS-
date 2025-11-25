# Online-Learning-Management-System-LMS-
An Online Learning Management System is a platform that enables digital teaching, learning, and progress tracking anytime, anywhere.

## Project Overview
This project is an Online Learning Management System implemented using core Java concepts and Object-Oriented Programming principles. It includes designing a relational database schema, establishing JDBC connectivity, and developing Java classes for database operations such as CRUD for users, courses, and enrollments.

## Features
- User registration and management
- Course creation and enrollment
- Database interaction using JDBC
- Modular design following OOP principles

## Project Structure
- `model/` - Contains Java classes representing entities like User, Course, Enrollment
- `dao/` - Data Access Object classes handling database operations
- `service/` - Business logic and service classes
- `util/` - Utility classes for database connection and helper methods
- `Main.java` - Entry point of the application

## Requirements
- Java JDK 8 or later
- MySQL or any relational database
- JDBC driver for your database

## Setup Instructions
1. Clone the repository:
git clone https://github.com/Anisha-hash/OnlineLearningManagementSystem.git
2. Set up your database and import the provided SQL schema file (`database/schema.sql`) to create required tables.
3. Update the database configuration in `util/DBConnection.java` with your database URL, username, and password.
4. Build and run the project using your preferred IDE or command line.

## Running the Project
- Run the `Main.java` class to start the application.
- Follow the console prompts to register users, create courses, and manage enrollments.

## Contributing
Contributions are welcome. Please fork the repository and create a pull request with your enhancements or bug fixes.

## License
This project is licensed under the MIT License.

## Contact
For any queries or contributions, contact: anisha.102569@gmail.com


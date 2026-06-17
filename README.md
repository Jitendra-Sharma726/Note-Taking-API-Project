# Note-Taking-API-Project

### Note Taking API Project Description

The **Note Taking API Project** is a backend application built using **Spring Boot** that enables users to create, read, update, and delete personal notes through RESTful APIs. The project follows a **Layered Architecture** approach, separating responsibilities into Controller, Service, Repository, and Model layers to create a clean, maintainable, and scalable backend system.

This application serves as an introduction to how modern backend services process HTTP requests, apply business logic, manage data storage, and return responses to clients.

### Project Objective

Develop a lightweight note management system where users can:

* Create new notes
* View all saved notes
* Update existing notes
* Delete notes

The application stores data in memory using an **ArrayList**, making it simple and efficient for learning purposes.

### Architecture Overview

#### 1. Model Layer (`Note.java`)

Represents the Note entity used throughout the application.

Each note contains:

* **id** (Long): Auto-generated unique identifier
* **title** (String): Title of the note
* **content** (String): Main content of the note

Responsibilities:

* Store note data
* Provide constructors, getters, and setters
* Support JSON-to-Java object mapping

---

#### 2. Repository Layer (`NoteRepository.java`)

Acts as an in-memory database using an `ArrayList<Note>`.

Responsibilities:

* Store notes
* Generate unique IDs
* Retrieve all notes
* Update existing notes
* Delete notes

The repository is marked with the `@Repository` annotation to indicate that it handles data persistence operations.

---

#### 3. Service Layer (`NoteService.java`)

Contains the business logic and acts as an intermediary between the Controller and Repository.

Responsibilities:

* Process note-related operations
* Delegate CRUD operations to the repository
* Manage dependency injection

The service is marked with the `@Service` annotation.

---

#### 4. Controller Layer (`NoteController.java`)

Exposes REST endpoints for client applications.

Responsibilities:

* Receive HTTP requests
* Validate and forward data to the service layer
* Return appropriate HTTP responses

The controller is marked with the `@RestController` annotation.

### REST API Endpoints

| Method | Endpoint      | Description             |
| ------ | ------------- | ----------------------- |
| POST   | `/notes`      | Create a new note       |
| GET    | `/notes`      | Retrieve all notes      |
| PUT    | `/notes/{id}` | Update an existing note |
| DELETE | `/notes/{id}` | Delete a note           |

### Application Workflow

#### Create Note

1. Client sends a POST request with title and content.
2. Controller receives the request.
3. Service forwards the request to the repository.
4. Repository generates a unique ID and stores the note.
5. Created note is returned to the client.

#### View Notes

1. Client sends a GET request.
2. Controller calls the service.
3. Service retrieves all notes from the repository.
4. Notes are returned as JSON.

#### Update Note

1. Client sends a PUT request with the note ID and updated data.
2. Controller passes the request to the service.
3. Repository locates the note and updates its fields.
4. Updated note list is returned.

#### Delete Note

1. Client sends a DELETE request with the note ID.
2. Controller calls the service.
3. Repository removes the matching note.
4. Success response is returned.

### Key Concepts Learned

By completing this project, you will gain practical experience with:

* Spring Boot REST API development
* CRUD (Create, Read, Update, Delete) operations
* Layered Architecture
* Dependency Injection
* Repository Pattern
* Service Layer Pattern
* REST Controller implementation
* Request Body handling
* Path Variable mapping
* Java Collections (`ArrayList`)
* Object-Oriented Programming (OOP)
* In-memory data management

### Expected Outcome

After implementing all TODO sections, the application will function as a complete Note Management API capable of:

* Creating notes with automatically generated IDs
* Listing all stored notes
* Updating note titles and content
* Deleting notes by ID
* Following industry-standard Spring Boot architecture principles

This project provides a solid foundation for understanding how backend applications are structured and prepares learners for building more advanced Spring Boot applications with real databases such as MySQL, PostgreSQL, or MongoDB.

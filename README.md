# Deep Skilling Program – Cognizant

This repository contains solutions and exercises for the Deep Skilling program by Cognizant. It is organized week-wise, covering core software engineering concepts, design patterns, PL/SQL, and Spring Core with Maven.

## Overview

The repository is structured to help learners progressively build their skills in:
- Java Design Patterns and Principles
- PL/SQL and Unit Testing
- Spring Core (with Maven)

Each week contains hands-on exercises and sample code to reinforce learning.

## Directory Structure

```
mypractice/
  week1_DesignPatternsAndPrinciple/   # Java design patterns (Singleton, Factory, Builder, Adapter)
  week2_PL_SQL_UnitTesting/           # PL/SQL exercises
  week3_SpringCore_maven/             # Spring Core projects (Maven)
```

### Week 1: Design Patterns and Principles
- **1_implementic_singleton_pattern**: Singleton pattern in Java
- **2_ImplementingFactoryMethodPattern**: Factory Method pattern in Java
- **3_Implementing_Builder_pattern**: Builder pattern in Java
- **4_implementing_adapter_pattern**: Adapter pattern in Java

### Week 2: PL/SQL & Unit Testing
- PL/SQL exercises and documentation

### Week 3: Spring Core with Maven
- **Excercise1-8**: Spring Core projects with Maven, including repository, service, aspect, and application layers
- Each exercise contains a `LibraryManagement` project with source code and resources

## How to Run

### Java Projects (Week 1)
1. Navigate to the relevant `code` directory (e.g., `week1_DesignPatternsAndPrinciple/1_implementic_singleton_pattern/code/`).
2. Compile the Java files:
   ```sh
   javac *.java
   ```
3. Run the main class:
   ```sh
   java Main
   ```

### Spring Core Projects (Week 3)
1. Navigate to the relevant `LibraryManagement` directory (e.g., `week3_SpringCore_maven/Excercise1/LibraryManagement/`).
2. Build the project using Maven:
   ```sh
   ./mvnw clean install
   ```
3. Run the application:
   ```sh
   ./mvnw spring-boot:run
   ```

> **Note:** Ensure you have Java and Maven installed on your system.

## Contributors

- Saikat Kar

## License

This project is for educational purposes as part of Cognizant's Deep Skilling program. 
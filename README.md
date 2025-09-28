# SOLID Library Management System

This is a mini-project implemented in Java to demonstrate the application of **SOLID principles** in designing a simple Library Management System.
The project showcases clean object-oriented programming practices, modularity, and maintainability.

---

## Project Overview

The system manages multiple types of library items such as **Books, CDs, and DVDs**.
Key functionalities include:

* Calculating the **total value of library items**.
* Computing **late fees** based on the type of item and number of overdue days.
* Allowing new item types to be added with minimal modifications to existing code.

The design adheres to the following **SOLID principles**:

* **Single Responsibility Principle**: Each class has a clear and distinct responsibility.
* **Open/Closed Principle**: Classes are open for extension but closed for modification.
* **Liskov Substitution Principle**: All item types can be substituted through a common interface.
* **Interface Segregation Principle**: Specific interfaces are defined for distinct behaviors.
* **Dependency Inversion Principle**: High-level modules depend on abstractions rather than concrete implementations.

---

## Project Structure

```
src/
 └── Item/
     ├── Book.java
     ├── CD.java
     ├── DVD.java
     ├── LibraryItem.java
     ├── LateFeeCalculate.java
     ├── LateFeeCalculator.java
     ├── Library.java
 Main.java
```


---

## Future Enhancements

* Support for additional item types such as magazines, newspapers, or e-books.
* Integration with a database for persistent storage.
* Development of a graphical or web-based user interface.
* Borrowing system with tracking of due dates and returns.

---

## License

This project is licensed under the **MIT License**.
You are free to use, modify, and distribute it for educational or professional purposes.

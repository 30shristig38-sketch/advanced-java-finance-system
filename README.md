# Advanced Java Finance & Audit System

An object-oriented financial management application designed to model portfolio tracking, budget enforcement, and data persistence.

---

## Technical Overview & Architecture

This project was built to explore and implement object-oriented programming concepts and system design patterns that extend beyond APCSA. I have incorporated outside Java knowledge, including ideas expressed within the Certiport IT Specialist in Java course:

* **Abstract Classes & Inheritance:** Utilizes an abstract parent class (`Transaction`) with specialized subclasses (`Income` and `Expense`) to enforce clean code architecture and polymorphism.
* **Encapsulation:** Protects internal data structures and fields across financial entities.
* **File I/O Data Persistence:** Features custom file stream processing (`FileWriter` and `PrintWriter`) to export financial logs directly to persistent CSV reports.
* **Robust Exception Handling:** Implements `try-catch` blocks and input sanitization loops to ensure application stability against invalid user inputs.

---

## How to Compile and Run the Program

To Clone the repository:
   ```bash
   git clone [https://github.com/your-username/advanced-java-finance-system.git](https://github.com/your-username/advanced-java-finance-system.git)

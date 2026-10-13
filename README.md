# CIT300 - Data Structures and Algorithms: Practical Assignment 2
## Data Structure and Graph Performance Analyzer

### Project Description
This project is a Java-based console application developed as a group assignment for the CIT300 Data Structures and Algorithms course[cite: 11]. The system demonstrates the practical implementation and application of fundamental data structures, search algorithms, graph representations, traversals, and performance comparisons[cite: 11, 12, 13].

---

### Team Members & Contributions

#### 1. Student Name:K.S.C.Pushpakumara
* **Student ID:** 23da2-1068
* **Assigned Responsibility:** Integration, Main Menu, and Performance Analyzer (Member 4)[cite: 15]
* **Individual Contribution:**
  * Developed the `PerformanceAnalyzer.java` module to measure and compare execution times of Linear Search and Binary Search[cite: 14].
  * Designed and implemented the central `Main.java` console application menu.
  * Integrated all individual modules (Array, Stack, Queue, Linked List, Searching, and Graph) into a unified system[cite: 15].
  * Managed Git repository branches, commits, and collaborative merges[cite: 16].

#### 2. Student Name: W.V.M.P.D.B.Wijethunga
* **Student ID:** 23da2-0884
* **Assigned Responsibility:** Array and Searching implementation (Member 1)[cite: 15]
* **Individual Contribution:**
  * Implemented the `ArrayOperations.java` class with core operations (Insert, Delete, Search, and Display)[cite: 12].
  * Implemented the `SearchingOperations.java` class covering linear and binary search algorithms[cite: 13].
  * Implemented user input validation and empty-state handling for array and searching modules.
  * Tested and verified array and searching functionalities.

#### 3. Student Name: Ilma farhath
* **Student ID:** 23da2-0961
* **Assigned Responsibility:** Stack and Queue implementation (Member 2)[cite: 15]
* **Individual Contribution:**
  * Implemented the `StackOperations.java` class covering Push, Pop, Peek, and Display operations[cite: 12].
  * Implemented the `QueueOperations.java` class covering Enqueue, Dequeue, Peek/Front, and Display operations[cite: 12].
  * Added robust error handling for edge cases such as stack-underflow (popping from an empty stack) and queue-underflow[cite: 12].
  * Created submenus for stack and queue management.

#### 4. Student Name: W.M.P.I.Wickramasinghe 
* **Student ID:** 23DA2-0621
* **Assigned Responsibility:** Linked List and Graph implementation (Member 3)[cite: 15]
* **Individual Contribution:**
  * Implemented the `LinkedListGraphOperations.java` class containing singly linked list nodes and dynamic list management[cite: 12, 13].
  * Developed adjacency list-based graph representations supporting vertex and edge additions[cite: 13].
  * Implemented graph traversal algorithms (BFS and DFS) to demonstrate network path traversal[cite: 13].
  * Designed dedicated submenus for linked list and graph operations[cite: 13].

---

### Technologies Used
* **Programming Language:** Java[cite: 11]
* **Application Type:** Console-Based System[cite: 11]
* **Version Control:** Git & GitHub[cite: 16]
* **Development Environment:** Visual Studio Code / IntelliJ IDEA

---

### Main System Features
1. **Array Operations:** Dynamic insertion, deletion, searching, and displaying[cite: 12].
2. **Stack Operations:** LIFO management with push, pop, peek, and display[cite: 12].
3. **Queue Operations:** FIFO management with enqueue, dequeue, peek, and display[cite: 12].
4. **Linked List Operations:** Pointer-based node insertion, deletion, and traversal[cite: 12].
5. **Searching Operations:** Comparative execution of linear and binary search algorithms[cite: 13].
6. **Graph Operations:** Adjacency list mapping with edge additions and traversals (BFS/DFS)[cite: 13].
7. **Performance Comparison:** Nanosecond-level execution time evaluation between sorting/searching methodologies[cite: 14].

---

### Instructions for Running the Program
1. Ensure **Java Development Kit (JDK)** is installed on your machine.
2. Open the project folder in your terminal or IDE (such as VS Code).
3. Compile all Java source files:
   ```bash
   javac *.java
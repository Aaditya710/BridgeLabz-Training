# Week 4: Java Collections & Stream
---

## 📅 Day 1 – Java Generics Overview 
**(Date: 15-Jan-2026)**                    
**Branch:** `java-collections-practice`

Studied the Java Collections Framework to manage groups of objects efficiently using built-in data structures. Learned the difference between Collection and Map interfaces and their real-world use cases.

## 📁Project Structure

```
BridgeLabz-Training/
│
├── 📁 java-collections-practice/
│   ├── 📁 gcr-codebase/
│   │   └── 📁 JavaCollections/
│   │       └── 📁 src/
│   │           └── 📁 com/
│   │               ├── 📁 generics/
│   │               ├── 📁 collections/
│   │               ├── 📁 streams/
│   │               ├── 📁 regex/
│   │               ├── 📁 exceptionhandling/
│   │               ├── 📁 reflections/
│   │               ├── 📁 annotations/
│   │   └── 📁 Junit/
│   │       └── 📁 src/
│   │           └── 📁 main/
│   │               ├── 📁 java/
│   │                   ├── 📁 com/
│   │                       ├── 📁 Junit/
│   │           └── 📁 test/
│   │               ├── 📁 java/
│   │                   ├── 📁 com/
│   │                       ├── 📁 Junit/
│   └── 📁 scenario-based-codebase/
│
└── README.md
```

#### 🔹 Created a new branch `java-collections-practice`
- Learned and applied Java Generics best practices:
  - Generic classes, methods, and constructors
  - Bounded type parameters and wildcards
  - Type safety and reusability

#### 🔹 Topics Learned
- Type safety with generics
- Generic classes, methods, and constructors
- Upper & lower bounded wildcards
- Bounded type parameters
- Avoiding raw types and type erasure pitfalls
- Designing clean and reusable generic APIs
  
#### 🔹 Implemented real-world generic systems:
  - Smart Warehouse Management
  - Online Marketplace
  - Course Management System
  - Meal Plan Generator
  - AI-Driven Resume Screening System

🔗 **Code Links:**  
👉 [Day 1 - Java Generics Practice](https://github.com/Aaditya710/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/JavaCollectionConcepts/src/com/generic)

---

## 📅 Day 2 – Java Collections Framework  
**(Date: 16-Jan-2026)** 
**Branch:** `java-collections-practice`

Learned and practiced the **Java Collections Framework** in depth:

#### ✔ Core Topics Covered
- Collection hierarchy: `List`, `Set`, `Queue`, `Map`
- Implementations:
  - **List:** ArrayList, LinkedList, Vector
  - **Set:** HashSet, LinkedHashSet, TreeSet
  - **Queue/Deque:** PriorityQueue, ArrayDeque
  - **Map:** HashMap, LinkedHashMap, TreeMap, Hashtable
- Performance comparison & real-world use cases
- Best practices: generics, choosing correct collection, avoiding legacy misuse

#### ✔ Practice Problems Implemented
- **List operations:** reverse, rotate, frequency count, remove duplicates
- **Set operations:** union, intersection, subsets, sorting
- **Queue problems:** reverse queue, triage system, circular buffer
- **Map problems:** word frequency, merge maps, grouping objects
- **Mini systems:**
  - Insurance Policy Management
  - Banking System
  - Voting System
  - Shopping Cart

#### ✅ Summary
- Built strong fundamentals of **Java Collections**
- Solved extensive **hands-on problems** across List, Set, Queue, and Map

🔗 **Code Links:**   
👉 [Day 2 - Java Collections Framework](https://github.com/Aaditya710/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/JavaCollectionConcepts/src/com)

---

## 📅 Day 3 – Java I/O Streams 
**(Date: 19-Jan-2026)** 


### Overview
Today, we explored **Java I/O Streams**, focusing on file operations, object serialization, and memory streams. The key concepts include Byte Streams, Character Streams, and best practices for handling files efficiently.

#### Topics Covered:
- **Byte Streams**: `FileInputStream`, `FileOutputStream`
- **Character Streams**: `FileReader`, `FileWriter`
- **Buffered Streams**: `BufferedInputStream`, `BufferedOutputStream`, `BufferedReader`, `BufferedWriter`
- **Object Streams**: `ObjectInputStream`, `ObjectOutputStream` for serialization
- **In-memory Streams**: `ByteArrayInputStream`, `ByteArrayOutputStream`
- **Bridge Streams**: `InputStreamReader`, `OutputStreamWriter`
- **Try-with-resources** for resource management and file performance optimizations.

#### Practical Problems:
- **File Copy** using Byte Streams.
- **Serialization** and **Deserialization** of objects.
- Efficient **Large File Reading** with buffering.

🔗 **Code Links:**   
👉 [Day 3 - Java IO Streams](https://github.com/Aaditya710/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/JavaCollectionConcepts/src/com/streams)

---

## 📅 Day 4 – Exception Handling 
**(Date: 20-Jan-2026)**

### Overview
Today, we focused on **Java Exception Handling**, understanding the exception hierarchy, and learning how to handle errors effectively using `try`, `catch`, and `finally`.

#### Topics Covered:
- **Exception Hierarchy**: Differentiated between checked and unchecked exceptions.
- **Error Handling**: Used `try-catch`, `finally`, and multiple `catch` blocks.
- **Granular Error Handling**: Applied nested `try-catch` for specific error management.
- **Throw & Throws**: Learned how to create and propagate exceptions.
- **Custom Exceptions**: Designed exceptions for business rules.
- **Try-with-Resources**: Automated resource management to avoid leaks.

#### Practical Problems:
- Handled common runtime exceptions.
- Solved scenario-based problems using exception handling.

🔗 **Code Links:**   
👉 [Day 4 - Java Exception Handling](https://github.com/Aaditya710/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/JavaCollectionConcepts/src/com/exception)

---
# 📅 Day 5 – Regex & JUnit Testing 
**(Date: 21-Jan-2026)**

### Overview
 we explored **Java Regular Expressions** for pattern matching and validation, followed by **JUnit 5 Testing** to write structured and automated unit tests.

#### Topics Covered

##### 🔹 Regular Expressions (Regex)
- Java `java.util.regex` API
- `Pattern` and `Matcher` classes
- Regex metacharacters and quantifiers
- Validation using regex:
  - Email addresses
  - Password strength
  - Phone numbers
- Regex operations:
  - `find()`, `matches()`, `replaceAll()`
- Data extraction:
  - Dates
  - Hashtags
  - Domain names

##### 🔹 JUnit 5 Testing
- JUnit fundamentals and testing lifecycle
- JUnit 5 annotations:
  - `@Test`, `@BeforeEach`, `@AfterEach`
  - `@BeforeAll`, `@AfterAll`
- Implemented:
  - Parameterized tests
  - Repeated tests
  - Exception testing using `assertThrows`
- Assertions:
  - `assertEquals`, `assertTrue`, `assertAll`
- Followed **Arrange–Act–Assert (AAA)** testing pattern
- Structured test classes and automated execution


🔗 **Code Links:**   
👉 [Day 5 - Regex](https://github.com/Aaditya710/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/JavaCollectionConcepts/src/com/regex)   
👉 [Day 5 - Junit](https://github.com/Aaditya710/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/Junit/src)

---

# 📅 Day 6 – Annotations & Reflection (Date: 22-Jan-2026)

## Overview
we delved into **Java Annotations** and **Reflection**, focusing on both built-in and custom annotations, and learning how to retrieve and work with annotations at runtime. We also explored the fundamentals of **Reflection** to inspect and manipulate classes and objects dynamically.

### Topics Covered

#### 🔹 Annotations
- Standard annotations: `@Override`, `@Deprecated`, `@SuppressWarnings`
- Custom annotations with attributes and defaults
- **Repeatable annotations** using `@Repeatable`
- Retrieved annotation metadata using **Reflection API**
- Field and method validation using annotations
- Role-based access control simulation with custom annotations
- **Annotation-driven utilities** for:
  - JSON mapping
  - Caching mechanisms

#### 🔹 Reflection
- Java Reflection fundamentals:
  - Inspecting classes, fields, methods, and constructors
  - Dynamic object creation and method invocation
- Accessed **private** and **static** members via Reflection
- Advanced Reflection use cases:
  - **Execution-time logging**
  - **JSON generation**
  - **Dependency injection simulation**

🔗 **Code Links:**   
👉 [Day 6 - Reflections](https://github.com/Aaditya710/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/JavaCollectionConcepts/src/com/reflection)   
👉 [Day 6 - Annotations](https://github.com/Aaditya710/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/JavaCollectionConcepts/src/com/annotations)

---

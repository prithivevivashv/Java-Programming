# **Java Programming**

## **Introduction to Java**

Java is a **high-level, object-oriented, platform-independent programming language** developed by **James Gosling** and his team at **Sun Microsystems** in **1995**. It was designed with the philosophy of **"Write Once, Run Anywhere (WORA)"**, meaning that a Java program compiled on one operating system can run on any other system that has a Java Virtual Machine (JVM). Java is one of the most widely used programming languages because of its simplicity, reliability, security, portability, and scalability. It is extensively used in web development, mobile application development, desktop applications, enterprise software, cloud computing, big data processing, Internet of Things (IoT), and game development. Today, Java is maintained by Oracle Corporation and continues to evolve with regular updates and new features.

---

# **Features of Java**

### **1. Platform Independent**

Java programs are compiled into **bytecode**, which is executed by the **Java Virtual Machine (JVM)**. Since JVMs are available for different operating systems such as Windows, Linux, and macOS, the same Java program can run on any platform without modification.

### **2. Object-Oriented**

Java follows the principles of Object-Oriented Programming (OOP), allowing developers to organize code into reusable objects and classes. It supports concepts like:

* Encapsulation
* Inheritance
* Polymorphism
* Abstraction

These principles improve code reusability, maintainability, and scalability.

### **3. Simple**

Java has a syntax similar to C and C++, making it easy to learn. However, it removes complex features such as pointer arithmetic and multiple inheritance through classes, reducing programming errors.

### **4. Secure**

Java provides strong security through features like:

* Bytecode verification
* Class loader
* Security Manager
* No direct memory access using pointers
* Automatic garbage collection

These features make Java suitable for developing secure web and enterprise applications.

### **5. Robust**

Java is considered robust because it includes:

* Exception handling
* Automatic memory management
* Strong type checking
* Garbage collection
* Runtime error detection

These features reduce crashes and improve software reliability.

### **6. Multithreaded**

Java supports multithreading, allowing multiple tasks to run simultaneously within a single program. This improves application performance and responsiveness.

### **7. Distributed**

Java provides networking libraries that simplify communication between systems, making it ideal for distributed and cloud-based applications.

### **8. High Performance**

Although Java is an interpreted language, the **Just-In-Time (JIT) Compiler** converts bytecode into native machine code during execution, improving performance significantly.

### **9. Dynamic**

Java supports dynamic loading of classes during runtime, allowing applications to be extended without recompilation.

---

# **Java Architecture**

Java follows the following execution process:

```
Java Source Code (.java)
          ↓
      Java Compiler (javac)
          ↓
       Bytecode (.class)
          ↓
   Java Virtual Machine (JVM)
          ↓
      Machine Code
          ↓
      Program Execution
```

### **Components of Java Architecture**

### **1. JDK (Java Development Kit)**

JDK is a software development kit that contains everything needed to develop Java applications.

It includes:

* JRE
* Java Compiler (javac)
* Debugger
* Documentation
* Development tools

### **2. JRE (Java Runtime Environment)**

JRE provides the environment required to run Java applications.

It contains:

* JVM
* Java Libraries
* Supporting files

### **3. JVM (Java Virtual Machine)**

The JVM is responsible for:

* Loading Java classes
* Verifying bytecode
* Executing bytecode
* Managing memory
* Performing garbage collection

The JVM enables Java's platform independence.

---

# **Java Program Structure**

Every Java program contains the following components:

```java
public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello World");

    }

}
```

### Explanation

* **public class HelloWorld** → Defines a class named `HelloWorld`.
* **public static void main(String[] args)** → The entry point of the Java program.
* **System.out.println()** → Prints output to the console.

---

# **Variables in Java**

Variables are named memory locations used to store data.

Example:

```java
int age = 20;
double salary = 45000.50;
char grade = 'A';
boolean passed = true;
String name = "John";
```

---

# **Data Types in Java**

Java data types are divided into two categories.

## Primitive Data Types

| Data Type | Size            | Example |
| --------- | --------------- | ------- |
| byte      | 1 Byte          | 100     |
| short     | 2 Bytes         | 500     |
| int       | 4 Bytes         | 10000   |
| long      | 8 Bytes         | 100000L |
| float     | 4 Bytes         | 10.5f   |
| double    | 8 Bytes         | 15.75   |
| char      | 2 Bytes         | 'A'     |
| boolean   | 1 Bit (logical) | true    |

---

## Non-Primitive Data Types

* String
* Arrays
* Classes
* Objects
* Interfaces
* Collections

---

# **Operators in Java**

Java supports several types of operators.

### Arithmetic Operators

```
+
-
*
/
%
```

### Relational Operators

```
==
!=
>
<
>=
<=
```

### Logical Operators

```
&&
||
!
```

### Assignment Operators

```
=
+=
-=
*=
/=
```

### Increment and Decrement

```
++
--
```

---

# **Control Statements**

## Decision Making

### if Statement

```java
if(age >= 18)
{
    System.out.println("Eligible");
}
```

### if-else

```java
if(age >= 18)
{
    System.out.println("Adult");
}
else
{
    System.out.println("Minor");
}
```

### switch Statement

```java
switch(day)
{
    case 1:
        System.out.println("Monday");
        break;
}
```

---

## Looping Statements

### for Loop

```java
for(int i=1;i<=5;i++)
{
    System.out.println(i);
}
```

### while Loop

```java
while(i<=5)
{
    System.out.println(i);
    i++;
}
```

### do-while Loop

```java
do
{
    System.out.println(i);
    i++;
}
while(i<=5);
```

---

# **Methods in Java**

A method is a reusable block of code that performs a specific task.

Example:

```java
public static int add(int a,int b)
{
    return a+b;
}
```

Benefits:

* Code reusability
* Easier maintenance
* Better modularity

---

# **Object-Oriented Programming (OOP) Concepts**

## Class

A class is a blueprint for creating objects.

```java
class Student
{
    String name;
}
```

---

## Object

An object is an instance of a class.

```java
Student s = new Student();
```

---

## Encapsulation

Encapsulation combines data and methods into a single unit while restricting direct access to data using access modifiers and getter/setter methods.

---

## Inheritance

Inheritance allows one class to acquire the properties and methods of another class.

```java
class Animal
{
}

class Dog extends Animal
{
}
```

---

## Polymorphism

Polymorphism allows one method or object to have multiple forms.

Types:

* Method Overloading (Compile-time)
* Method Overriding (Runtime)

---

## Abstraction

Abstraction hides implementation details and exposes only essential functionality using abstract classes and interfaces.

---

# **Exception Handling**

Exception handling prevents program crashes by handling runtime errors gracefully.

Keywords:

* try
* catch
* finally
* throw
* throws

Example:

```java
try
{
    int a = 10/0;
}
catch(Exception e)
{
    System.out.println(e);
}
```

---

# **Arrays in Java**

Arrays store multiple values of the same data type in contiguous memory.

Example:

```java
int numbers[] = {10,20,30,40,50};
```

Types:

* One-Dimensional Array
* Two-Dimensional Array
* Multi-Dimensional Array

---

# **Strings in Java**

Strings represent sequences of characters.

```java
String name = "Java";
```

Common methods:

* length()
* charAt()
* substring()
* equals()
* compareTo()
* toUpperCase()
* toLowerCase()

---

# **Collections Framework**

Java Collections provide dynamic data structures.

Common collection classes:

* ArrayList
* LinkedList
* HashSet
* TreeSet
* HashMap
* TreeMap
* PriorityQueue
* Stack

Advantages:

* Dynamic size
* Efficient searching
* Sorting
* Easy data manipulation

---

# **Packages in Java**

Packages organize related classes and interfaces into namespaces.

Examples:

* `java.lang`
* `java.util`
* `java.io`
* `java.net`
* `java.sql`

Benefits:

* Better organization
* Avoid naming conflicts
* Improved code maintenance

---

# **Java Applications**

Java is widely used in many domains, including:

* Web applications
* Android mobile applications
* Desktop software
* Enterprise systems
* Banking and financial applications
* Cloud computing
* Big data technologies (e.g., Apache Hadoop)
* Scientific applications
* Internet of Things (IoT)
* E-commerce platforms
* Game development

---

# **Advantages of Java**

* Platform independent (Write Once, Run Anywhere)
* Object-oriented and modular
* Secure and robust
* Automatic memory management with garbage collection
* Rich standard libraries and APIs
* Strong multithreading support
* Large developer community
* High scalability for enterprise applications
* Excellent support for distributed and cloud-based systems

---

# **Limitations of Java**

* Slower than low-level languages like C and C++ due to JVM overhead
* Higher memory consumption
* Limited control over hardware because it does not support pointers
* Startup time can be slower for some applications

---

# **Conclusion**

Java is a powerful, versatile, and reliable programming language that has remained one of the most popular choices for software development for decades. Its platform independence, object-oriented design, robust security features, automatic memory management, and extensive standard libraries make it suitable for developing applications ranging from small desktop programs to large-scale enterprise systems, cloud services, and Android applications. With continuous improvements and strong community support, Java continues to be a valuable language for beginners and experienced developers alike, making it an essential skill in modern software development.

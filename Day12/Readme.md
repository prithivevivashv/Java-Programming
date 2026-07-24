## 1. Object-Oriented Programming System (OOPS)

Object-Oriented Programming System (OOPS) is a programming paradigm that organizes software design around **objects** rather than functions or logic. An object is a real-world entity that contains both **data (attributes or variables)** and **behavior (methods or functions)**. OOPS helps developers create programs that are modular, reusable, secure, and easy to maintain. Instead of writing a large program as a single block of code, OOPS divides it into multiple classes and objects, making the program easier to understand and manage. Java is a pure object-oriented language (except for primitive data types) and heavily relies on OOPS concepts. The four main pillars of OOPS are **Encapsulation**, **Inheritance**, **Polymorphism**, and **Abstraction**. **Encapsulation** binds data and methods into a single unit called a class while restricting direct access using access modifiers such as private, protected, and public. **Inheritance** allows one class to acquire the properties and methods of another class, promoting code reusability. **Polymorphism** enables a single method or object to perform different tasks depending on the situation, achieved through method overloading and method overriding. **Abstraction** hides implementation details and exposes only the essential features to the user using abstract classes and interfaces. OOPS improves code reusability, scalability, security, flexibility, debugging, and maintenance, making it the preferred approach for developing modern software applications such as banking systems, e-commerce platforms, games, and enterprise applications.

---

## 2. Constructors

A **constructor** is a special member of a class that is automatically invoked whenever an object is created. Its primary purpose is to initialize the object's data members with appropriate values. In Java, a constructor has the **same name as the class** and **does not have any return type**, not even `void`. Constructors simplify object creation by allowing initialization during instantiation rather than assigning values separately. Every class has a default constructor provided by the Java compiler if no constructor is explicitly defined. However, once a programmer defines any constructor, the compiler no longer provides the default constructor automatically. Constructors can initialize primitive variables, objects, arrays, and other resources required by the class. They can also call another constructor in the same class using `this()` or invoke the parent class constructor using `super()`. Constructors cannot be inherited or overridden because they belong specifically to the class in which they are declared. They are executed only once during object creation. Proper use of constructors ensures that objects are always created in a valid state, reducing errors and improving code readability. Constructors play a vital role in object initialization and are widely used in real-world applications to assign default values, accept user-defined values, establish database connections, initialize files, and allocate memory efficiently.

**Types of Constructors:**

* **Default Constructor:** Takes no arguments and initializes objects with default values.
* **Parameterized Constructor:** Accepts parameters to initialize objects with user-defined values.
* **Copy Constructor (conceptual in Java):** Initializes one object using another object's values through a custom constructor.

---

## 3. Constructor Overloading

**Constructor overloading** is a feature of Java that allows a class to have **multiple constructors with the same name but different parameter lists**. Since constructors always have the same name as the class, they are distinguished by the **number, type, or order of parameters**. Constructor overloading provides multiple ways to create objects depending on the available information. For example, one constructor may initialize default values, another may initialize only a few variables, while another initializes all variables. The Java compiler determines which constructor to execute based on the arguments supplied during object creation, a process known as **compile-time (static) polymorphism**. Constructor overloading improves flexibility, readability, and code reusability because the programmer does not need to create different initialization methods. It also avoids repetitive code by allowing one constructor to call another using `this()`, a concept called **constructor chaining**. Constructor overloading is commonly used in applications where objects may require different initialization scenarios, such as creating employee records with only an ID, with an ID and name, or with complete employee details. It enhances object creation by providing multiple initialization options while keeping the code organized and maintainable.

**Example:**

```java
class Student {
    Student() {
        System.out.println("Default Constructor");
    }

    Student(int id) {
        System.out.println("ID: " + id);
    }

    Student(int id, String name) {
        System.out.println(id + " " + name);
    }
}
```

---

## 4. Method Overloading

**Method overloading** is a feature in Java that allows a class to contain **multiple methods with the same name but different parameter lists**. The methods must differ in the **number of parameters, type of parameters, or order of parameters**. Simply changing the return type is **not sufficient** for method overloading. Method overloading is an example of **compile-time polymorphism**, where the compiler decides which method to invoke based on the arguments passed during the method call. This feature increases code readability because programmers can use the same method name to perform similar operations on different types of data. For instance, a method named `add()` can be overloaded to add two integers, two floating-point numbers, or three integers. Method overloading reduces the need for multiple method names performing similar tasks, making the code cleaner and easier to maintain. It also improves flexibility by allowing methods to accept varying inputs without changing their functionality. Java libraries extensively use method overloading, such as `System.out.println()`, which can print integers, strings, characters, booleans, and objects using the same method name. Method overloading enhances code reusability, simplifies programming, and provides a user-friendly interface while maintaining efficiency through compile-time method resolution.

**Example:**

```java
class Display {
    void show() {
        System.out.println("No arguments");
    }

    void show(int a) {
        System.out.println("Integer: " + a);
    }

    void show(String name) {
        System.out.println("String: " + name);
    }

    void show(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
}
```

### Difference between Constructor Overloading and Method Overloading

| Constructor Overloading                              | Method Overloading                                                                                     |
| ---------------------------------------------------- | ------------------------------------------------------------------------------------------------------ |
| Used to initialize objects.                          | Used to perform different operations.                                                                  |
| Constructor name must be the same as the class name. | Method name can be any valid identifier.                                                               |
| Has no return type.                                  | May have any valid return type.                                                                        |
| Called automatically when an object is created.      | Called explicitly using a method call.                                                                 |
| Used for object initialization.                      | Used for implementing compile-time polymorphism.                                                       |
| Cannot be inherited or overridden.                   | Can be inherited; overloading occurs within the same class (or inherited methods with new signatures). |


# Strings in Java

## Introduction to Strings

A **String** in Java is a sequence of characters used to store and manipulate text. It is one of the most commonly used classes in Java and belongs to the `java.lang` package. Strings are **immutable**, meaning that once a String object is created, its contents cannot be changed. Whenever a modification is made, Java creates a new String object instead of altering the existing one. This immutability improves security, thread safety, and memory optimization through the **String Constant Pool (SCP)**. Strings are widely used for storing names, messages, passwords, file paths, URLs, and other textual information.

Example:

```java
String name = "Java";
String course = new String("Programming");
```

---

# Characteristics of Strings

* Immutable in nature.
* Stored in the String Constant Pool when created using string literals.
* Supports a large number of built-in methods.
* Implements the `Comparable`, `Serializable`, and `CharSequence` interfaces.
* Can be compared using `equals()` and `compareTo()` methods.
* Uses Unicode characters, allowing support for multiple languages.

---

# Creating Strings

## 1. Using String Literal

```java
String s = "Hello";
```

* Stored in the String Constant Pool.
* Memory efficient because duplicate literals share the same object.

---

## 2. Using new Keyword

```java
String s = new String("Hello");
```

* Creates a new object in heap memory.
* Even if the same value exists in SCP, a new object is created.

---

# Common String Methods

Java provides numerous methods for manipulating strings.

## 1. length()

Returns the number of characters.

```java
String s = "Programming";
System.out.println(s.length());
```

Output:

```
11
```

---

## 2. charAt()

Returns the character at a specified index.

```java
String s = "Java";
System.out.println(s.charAt(2));
```

Output:

```
v
```

---

## 3. substring()

Extracts part of a string.

```java
String s = "Programming";
System.out.println(s.substring(3));
System.out.println(s.substring(3,7));
```

Output:

```
gramming
gram
```

---

## 4. toUpperCase()

Converts all letters to uppercase.

```java
String s = "java";
System.out.println(s.toUpperCase());
```

Output:

```
JAVA
```

---

## 5. toLowerCase()

Converts all letters to lowercase.

```java
String s = "JAVA";
System.out.println(s.toLowerCase());
```

Output:

```
java
```

---

## 6. equals()

Compares string contents.

```java
String s1 = "Java";
String s2 = "Java";

System.out.println(s1.equals(s2));
```

Output:

```
true
```

---

## 7. equalsIgnoreCase()

Ignores uppercase and lowercase differences.

```java
String s1 = "JAVA";
String s2 = "java";

System.out.println(s1.equalsIgnoreCase(s2));
```

Output:

```
true
```

---

## 8. compareTo()

Compares two strings lexicographically.

```java
System.out.println("Apple".compareTo("Banana"));
```

Negative value because Apple comes before Banana.

---

## 9. contains()

Checks whether a string contains another string.

```java
String s = "Java Programming";
System.out.println(s.contains("Java"));
```

Output:

```
true
```

---

## 10. startsWith()

Checks starting characters.

```java
String s = "Programming";
System.out.println(s.startsWith("Pro"));
```

Output:

```
true
```

---

## 11. endsWith()

Checks ending characters.

```java
String s = "Programming";
System.out.println(s.endsWith("ing"));
```

Output:

```
true
```

---

## 12. replace()

Replaces characters.

```java
String s = "Java";
System.out.println(s.replace('a','o'));
```

Output:

```
Jovo
```

---

## 13. replaceAll()

Replaces matching patterns.

```java
String s = "Java123";
System.out.println(s.replaceAll("[0-9]",""));
```

Output:

```
Java
```

---

## 14. trim()

Removes leading and trailing spaces.

```java
String s = "   Java   ";
System.out.println(s.trim());
```

---

## 15. split()

Splits the string.

```java
String s = "Apple,Mango,Banana";
String arr[] = s.split(",");
```

---

## 16. indexOf()

Returns first occurrence.

```java
String s = "Programming";
System.out.println(s.indexOf('g'));
```

---

## 17. lastIndexOf()

Returns last occurrence.

```java
String s = "Programming";
System.out.println(s.lastIndexOf('g'));
```

---

## 18. isEmpty()

Checks whether the string is empty.

```java
String s = "";
System.out.println(s.isEmpty());
```

---

## 19. concat()

Joins strings.

```java
String s1 = "Java";
String s2 = "Programming";

System.out.println(s1.concat(s2));
```

---

## 20. valueOf()

Converts primitive values into String.

```java
int n = 100;
String s = String.valueOf(n);
```

---

# String Comparison

## Using ==

Compares memory addresses.

```java
String a = "Java";
String b = "Java";

System.out.println(a == b);
```

Output:

```
true
```

---

## Using equals()

Compares actual contents.

```java
String a = new String("Java");
String b = new String("Java");

System.out.println(a.equals(b));
```

Output:

```
true
```

---

# StringBuilder

## Introduction

`StringBuilder` is a mutable class introduced in Java 5. Unlike String, it allows modifications without creating new objects. It is faster than String when performing multiple string operations. However, it is **not thread-safe**, making it suitable for single-threaded applications.

Example:

```java
StringBuilder sb = new StringBuilder("Java");
```

---

## Advantages

* Mutable
* Fast performance
* Less memory usage
* Suitable for loops
* Better than String for repeated modifications

---

## Common StringBuilder Methods

### append()

```java
sb.append(" Programming");
```

---

### insert()

```java
sb.insert(4," Language");
```

---

### delete()

```java
sb.delete(2,5);
```

---

### deleteCharAt()

```java
sb.deleteCharAt(3);
```

---

### replace()

```java
sb.replace(0,4,"Python");
```

---

### reverse()

```java
sb.reverse();
```

---

### length()

```java
sb.length();
```

---

### capacity()

Returns storage capacity.

```java
sb.capacity();
```

---

### setCharAt()

```java
sb.setCharAt(0,'K');
```

---

### toString()

Converts StringBuilder into String.

```java
String str = sb.toString();
```

---

# StringBuffer

## Introduction

`StringBuffer` is also a mutable class used for modifying strings efficiently. Unlike `StringBuilder`, it is **thread-safe** because its methods are synchronized. It is slightly slower due to synchronization but is ideal for multi-threaded applications.

Example:

```java
StringBuffer sb = new StringBuffer("Java");
```

---

## Advantages

* Mutable
* Thread-safe
* Suitable for multi-threaded applications
* Faster than String for repeated modifications

---

## Common StringBuffer Methods

Most methods are identical to `StringBuilder`.

```java
append()

insert()

replace()

delete()

deleteCharAt()

reverse()

capacity()

length()

setCharAt()

toString()
```

Example:

```java
StringBuffer sb = new StringBuffer("Java");

sb.append(" Programming");
sb.insert(4," Language");
sb.reverse();

System.out.println(sb);
```

---

# Difference Between String, StringBuilder and StringBuffer

| Feature         | String                   | StringBuilder                | StringBuffer                |
| --------------- | ------------------------ | ---------------------------- | --------------------------- |
| Nature          | Immutable                | Mutable                      | Mutable                     |
| Performance     | Slow for modifications   | Fast                         | Slightly slower             |
| Thread Safety   | Safe due to immutability | Not Thread-safe              | Thread-safe                 |
| Synchronization | No                       | No                           | Yes                         |
| Memory Usage    | Higher                   | Lower                        | Lower                       |
| Best Used For   | Fixed text               | Single-threaded applications | Multi-threaded applications |

---

# String Constant Pool (SCP)

The **String Constant Pool** is a special memory area inside the heap where Java stores unique string literals. When a string literal is created, Java first checks whether the same value already exists in the pool. If it does, Java reuses the existing object instead of creating a new one, which saves memory and improves performance.

Example:

```java
String s1 = "Java";
String s2 = "Java";

System.out.println(s1 == s2);
```

Output:

```
true
```

Both variables point to the same object in the String Constant Pool.

---

# Applications of Strings

* User input validation
* Password checking
* Searching and sorting text
* File handling
* Data parsing
* Web development
* Database operations
* Text processing
* Email and URL validation
* Log file analysis

---

# Conclusion

Strings are a fundamental part of Java programming and are used extensively for handling textual data. The immutable nature of `String` ensures security and efficient memory management through the String Constant Pool. Java also provides `StringBuilder` and `StringBuffer` for situations where strings need to be modified frequently. `StringBuilder` offers high performance for single-threaded applications, while `StringBuffer` provides thread safety for multi-threaded environments. Understanding the features, methods, and differences among these classes enables developers to write efficient, optimized, and maintainable Java programs.


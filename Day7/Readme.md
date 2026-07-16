# Arrays in Java

## Introduction to Arrays

An **array** is one of the most fundamental data structures in Java. It is used to store multiple values of the same data type in a single variable instead of creating separate variables for each value. Arrays provide an efficient way to organize and manage collections of data, making programs simpler, faster, and easier to maintain. Since arrays store elements in **contiguous memory locations**, they allow direct access to any element using its index, resulting in fast retrieval of data.

In Java, arrays are **fixed in size**, meaning the number of elements must be specified when the array is created and cannot be changed later. Arrays are widely used in real-world applications such as student management systems, inventory management, banking applications, gaming, image processing, and scientific computations.

Example:

```java
int[] numbers = {10, 20, 30, 40, 50};
```

Here, `numbers` is an integer array containing five elements.

---

# Array Concepts

## 1. Declaration of an Array

Declaring an array informs the compiler about the type of elements the array will store.

Syntax:

```java
datatype[] arrayName;
```

Example:

```java
int[] marks;
String[] names;
double[] salary;
```

At this stage, memory is not allocated.

---

## 2. Array Creation

Memory for an array is allocated using the `new` keyword.

Syntax:

```java
arrayName = new datatype[size];
```

Example:

```java
marks = new int[5];
```

This creates an integer array capable of storing five elements.

---

## 3. Array Initialization

Arrays can be initialized either manually or while creating them.

### Method 1: Manual Initialization

```java
marks[0] = 85;
marks[1] = 90;
marks[2] = 75;
marks[3] = 88;
marks[4] = 95;
```

### Method 2: Direct Initialization

```java
int[] marks = {85, 90, 75, 88, 95};
```

This method is simpler and commonly used.

---

## 4. Indexing

Each element in an array is identified using an **index**.

* Indexing always starts from **0**.
* Last index = Size - 1.

Example:

| Index | Value |
| ----- | ----- |
| 0     | 85    |
| 1     | 90    |
| 2     | 75    |
| 3     | 88    |
| 4     | 95    |

Accessing elements:

```java
System.out.println(marks[2]);
```

Output:

```
75
```

---

## 5. Traversing an Array

Traversal means visiting every element of the array.

Using a `for` loop:

```java
for(int i=0;i<marks.length;i++)
{
    System.out.println(marks[i]);
}
```

Using an enhanced for loop:

```java
for(int mark : marks)
{
    System.out.println(mark);
}
```

The enhanced for loop is simpler when only reading values.

---

## 6. Length Property

Java arrays provide a built-in property called `length`.

Example:

```java
System.out.println(marks.length);
```

Output:

```
5
```

Unlike methods, `length` is a property, so parentheses are not used.

---

## 7. Default Values

When arrays are created without initialization, Java automatically assigns default values.

| Data Type | Default Value |
| --------- | ------------- |
| int       | 0             |
| double    | 0.0           |
| float     | 0.0           |
| boolean   | false         |
| char      | '\u0000'      |
| String    | null          |

Example:

```java
int[] arr = new int[3];
System.out.println(arr[0]);
```

Output:

```
0
```

---

## 8. Advantages of Arrays

* Stores multiple values using one variable.
* Faster access using indexes.
* Reduces code complexity.
* Efficient memory utilization.
* Easy traversal using loops.
* Forms the foundation for advanced data structures like stacks, queues, heaps, and graphs.

---

## 9. Limitations of Arrays

* Fixed size after creation.
* Can store only one data type.
* Insertion and deletion operations are expensive.
* Memory may be wasted if the allocated size is larger than required.

---

# One-Dimensional (1D) Array

A **One-Dimensional Array** stores data in a single row. Each element is accessed using one index.

Example:

```java
int[] numbers = {5,10,15,20,25};
```

Visualization:

```
Index : 0   1   2   3   4
Value : 5  10  15  20  25
```

Printing elements:

```java
for(int i=0;i<numbers.length;i++)
{
    System.out.println(numbers[i]);
}
```

Applications:

* Student marks
* Employee salaries
* Monthly expenses
* Product prices
* Temperature records

---

# Two-Dimensional (2D) Array

## Introduction

A **Two-Dimensional Array** is an array of arrays. It stores data in the form of **rows and columns**, similar to a table or matrix. Each element is identified using two indices: the row index and the column index.

2D arrays are commonly used in applications involving matrices, game boards, seating arrangements, spreadsheets, and image processing.

Syntax:

```java
datatype[][] arrayName = new datatype[rows][columns];
```

Example:

```java
int[][] matrix = new int[3][3];
```

This creates a matrix with 3 rows and 3 columns.

---

## Initialization

```java
int[][] matrix =
{
    {1,2,3},
    {4,5,6},
    {7,8,9}
};
```

Visualization:

```
      Column

      0  1  2

0 ->  1  2  3

1 ->  4  5  6

2 ->  7  8  9
```

Accessing an element:

```java
System.out.println(matrix[1][2]);
```

Output:

```
6
```

---

## Traversing a 2D Array

Nested loops are used because there are rows and columns.

```java
for(int i=0;i<matrix.length;i++)
{
    for(int j=0;j<matrix[i].length;j++)
    {
        System.out.print(matrix[i][j]+" ");
    }
    System.out.println();
}
```

Output:

```
1 2 3
4 5 6
7 8 9
```

---

## Jagged Arrays

Java allows rows of different lengths, known as **jagged arrays**.

Example:

```java
int[][] jagged =
{
    {1,2},
    {3,4,5},
    {6}
};
```

Visualization:

```
1 2
3 4 5
6
```

Each row can have a different number of columns.

---

# Operations on Arrays

Common operations include:

### Searching

Finding whether an element exists.

Example:

```java
int key = 20;

for(int num : numbers)
{
    if(num == key)
    {
        System.out.println("Found");
    }
}
```

---

### Updating

```java
numbers[2] = 100;
```

---

### Summation

```java
int sum = 0;

for(int num : numbers)
{
    sum += num;
}

System.out.println(sum);
```

---

### Finding Maximum

```java
int max = numbers[0];

for(int num : numbers)
{
    if(num > max)
        max = num;
}

System.out.println(max);
```

---

### Finding Minimum

```java
int min = numbers[0];

for(int num : numbers)
{
    if(num < min)
        min = num;
}

System.out.println(min);
```

---

# Applications of Arrays

Arrays are widely used in software development and form the basis of many algorithms and data structures. Common applications include:

* Storing student records
* Employee payroll systems
* Banking transaction records
* Inventory management
* Image processing (pixel representation)
* Game development (game boards and maps)
* Matrix operations
* Scientific and engineering computations
* Sorting and searching algorithms
* Building advanced data structures such as stacks, queues, heaps, and graphs

---

# Conclusion

Arrays are one of the most essential concepts in Java programming. They provide a simple and efficient way to store and manage collections of similar data using indexed positions. A **one-dimensional array** is ideal for linear data storage, while a **two-dimensional array** is suited for tabular or matrix-like data organized into rows and columns. Understanding array declaration, creation, initialization, traversal, indexing, and common operations such as searching, updating, and aggregation is fundamental for mastering Java programming. Arrays also serve as the foundation for many advanced data structures and algorithms, making them an indispensable topic for beginners and experienced programmers alike.

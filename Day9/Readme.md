# Binary Search and Related LeetCode Problems in Java

## 1. Binary Search

**Binary Search** is one of the most efficient searching algorithms used to find an element in a **sorted array**. Unlike Linear Search, which checks each element one by one, Binary Search repeatedly divides the search space into two halves until the target element is found or the search space becomes empty. Since it eliminates half of the remaining elements after every comparison, its time complexity is **O(log n)**, making it much faster for large datasets. Binary Search works by initializing two pointers: **low** (starting index) and **high** (ending index). The middle index is calculated using the formula:

```java
mid = low + (high - low) / 2;
```

This formula prevents integer overflow that may occur with `(low + high) / 2`. If the target is equal to the middle element, the search ends successfully. If the target is greater, the search continues in the right half by updating `low = mid + 1`. If the target is smaller, the search continues in the left half by updating `high = mid - 1`. Binary Search requires the array to be sorted; otherwise, it does not work correctly.

### Advantages

* Very fast for large sorted datasets.
* Time Complexity: **O(log n)**
* Space Complexity: **O(1)** (Iterative), **O(log n)** (Recursive)

### Applications

* Searching in sorted arrays.
* Finding insertion positions.
* Searching in rotated sorted arrays.
* Finding first or last occurrence of an element.
* Database indexing.
* Dictionary and phonebook searching.

---

# LeetCode Problem 35 – Search Insert Position

### Problem Statement

Given a sorted array of distinct integers and a target value, return the index if the target exists. If it does not exist, return the index where it should be inserted to maintain sorted order.

### Concept

This problem is a direct application of Binary Search. If the target is found, return its index. Otherwise, when the search finishes, the `low` pointer indicates the correct insertion position.

### Example

Input:

```
nums = [1,3,5,6]
target = 5
```

Output:

```
2
```

Input:

```
nums = [1,3,5,6]
target = 2
```

Output:

```
1
```

### Complexity

* Time: **O(log n)**
* Space: **O(1)**

---

# LeetCode Problem 34 – Find First and Last Position of Element in Sorted Array

### Problem Statement

Given a sorted array and a target value, find the first and last occurrence of the target. If not found, return `[-1, -1]`.

### Concept

Instead of performing a normal Binary Search once, Binary Search is executed twice:

1. Find the first occurrence.
2. Find the last occurrence.

Whenever the target is found:

* Move left to find the first position.
* Move right to find the last position.

### Example

Input:

```
nums = [5,7,7,8,8,10]
target = 8
```

Output:

```
[3,4]
```

### Complexity

* Time: **O(log n)**
* Space: **O(1)**

---

# LeetCode Problem 283 – Move Zeroes

### Problem Statement

Move all zeroes to the end of the array while maintaining the relative order of non-zero elements.

### Concept

This problem uses the **Two Pointer Technique**. One pointer tracks where the next non-zero element should be placed, while another scans through the array.

### Example

Input:

```
[0,1,0,3,12]
```

Output:

```
[1,3,12,0,0]
```

### Complexity

* Time: **O(n)**
* Space: **O(1)**

---

# LeetCode Problem 1217 – Minimum Cost to Move Chips to The Same Position

### Problem Statement

Several chips are placed on a number line. Moving a chip by two positions costs nothing, while moving by one position costs one. Find the minimum cost to gather all chips at the same position.

### Concept

Moving chips between positions of the same parity (even-to-even or odd-to-odd) is free. Therefore, count chips at even positions and odd positions. The answer is the smaller count because only those chips need to cross parity.

### Example

Input:

```
[1,2,3]
```

Output:

```
1
```

### Complexity

* Time: **O(n)**
* Space: **O(1)**

---

# LeetCode Problem 1103 – Distribute Candies to People

### Problem Statement

Distribute candies among people such that each person receives one more candy than the previous distribution until all candies are distributed.

### Concept

Simulate the distribution using a loop. Give candies incrementally while ensuring not to exceed the remaining candies.

### Example

Input:

```
candies = 7
people = 4
```

Output:

```
[1,2,3,1]
```

### Complexity

* Time: **O(√candies)** (approximately, depending on total distributions)
* Space: **O(n)**

---

# LeetCode Problem 1295 – Find Numbers with Even Number of Digits

### Problem Statement

Return how many numbers in the array contain an even number of digits.

### Concept

For every number:

1. Count its digits.
2. Check whether the digit count is even.
3. Increment the answer if true.

### Example

Input:

```
[12,345,2,6,7896]
```

Output:

```
2
```

### Complexity

* Time: **O(n × d)** where `d` is the number of digits.
* Space: **O(1)**

---

# LeetCode Problem 2455 – Average Value of Even Numbers Divisible by Three

### Problem Statement

Find the average of all numbers that are both even and divisible by 3 (i.e., divisible by 6). Return 0 if no such numbers exist.

### Concept

Traverse the array and check:

```java
num % 6 == 0
```

Maintain the sum and count, then compute:

```
average = sum / count
```

### Example

Input:

```
[1,3,6,10,12,15]
```

Output:

```
9
```

(6 + 12 = 18, 18 / 2 = 9)

### Complexity

* Time: **O(n)**
* Space: **O(1)**

---

# LeetCode Problem 268 – Missing Number

### Problem Statement

An array contains numbers from `0` to `n`, with one number missing. Find the missing number.

### Concept

There are several approaches:

### Method 1: Sum Formula

Expected sum:

```
n × (n + 1) / 2
```

Subtract the actual sum.

Missing Number:

```
Expected Sum − Actual Sum
```

### Method 2: XOR

Use XOR properties:

```
a ^ a = 0
```

The remaining value after XORing indices and elements is the missing number.

### Example

Input:

```
[3,0,1]
```

Output:

```
2
```

### Complexity

* Time: **O(n)**
* Space: **O(1)**

---

# LeetCode Problem 2469 – Convert the Temperature

### Problem Statement

Convert Celsius into Kelvin and Fahrenheit.

### Formula

Kelvin:

```
Kelvin = Celsius + 273.15
```

Fahrenheit:

```
Fahrenheit = Celsius × 1.80 + 32
```

### Example

Input:

```
36.50
```

Output:

```
[309.65000,97.70000]
```

### Complexity

* Time: **O(1)**
* Space: **O(1)**

---

# LeetCode Problem 136 – Single Number

### Problem Statement

Every element appears twice except one element. Find the single element.

### Concept

The most efficient solution uses the **XOR operator (`^`)**.

Properties of XOR:

* `a ^ a = 0`
* `a ^ 0 = a`
* XOR is commutative and associative.

When all numbers are XORed together, duplicate values cancel each other, leaving only the unique number.

### Example

Input:

```
[2,2,1]
```

Output:

```
1
```

Example:

```
2 ^ 2 ^ 1
= 0 ^ 1
= 1
```

### Complexity

* Time: **O(n)**
* Space: **O(1)**

---

# Summary Table

| Topic         | Main Concept                  | Time Complexity | Space Complexity |
| ------------- | ----------------------------- | --------------- | ---------------- |
| Binary Search | Divide-and-conquer searching  | **O(log n)**    | **O(1)**         |
| LeetCode 35   | Search Insert Position        | **O(log n)**    | **O(1)**         |
| LeetCode 34   | First & Last Position         | **O(log n)**    | **O(1)**         |
| LeetCode 283  | Move Zeroes (Two Pointers)    | **O(n)**        | **O(1)**         |
| LeetCode 1217 | Even/Odd Position Counting    | **O(n)**        | **O(1)**         |
| LeetCode 1103 | Candy Distribution Simulation | **O(√candies)** | **O(n)**         |
| LeetCode 1295 | Count Even-Digit Numbers      | **O(n × d)**    | **O(1)**         |
| LeetCode 2455 | Average of Multiples of 6     | **O(n)**        | **O(1)**         |
| LeetCode 268  | Missing Number (Sum/XOR)      | **O(n)**        | **O(1)**         |
| LeetCode 2469 | Temperature Conversion        | **O(1)**        | **O(1)**         |
| LeetCode 136  | Single Number (XOR)           | **O(n)**        | **O(1)**         |

These topics cover several important programming concepts used in Java and coding interviews, including **Binary Search**, **Two Pointers**, **Simulation**, **Mathematical Formulas**, **Bit Manipulation (XOR)**, **Array Traversal**, **Counting Techniques**, and **Conditional Logic**. Mastering these problems builds a strong foundation for solving more advanced algorithmic challenges and improves problem-solving skills for technical interviews and competitive programming.


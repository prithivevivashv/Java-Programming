### Number Crunching Concepts in Java

Number crunching in Java refers to solving mathematical and logical problems using arithmetic operations, loops, conditional statements, and built-in methods. These problems help developers strengthen their understanding of programming fundamentals such as variables, operators, control flow, functions, and algorithm design. Common number-crunching tasks include checking whether a number is prime, palindrome, Armstrong, Strong, Harshad, Perfect, Neon, or Automorphic, as well as finding factorials, Fibonacci numbers, digit sums, digital roots, and reversing numbers. Java provides a rich set of operators and the `Math` class (`Math.pow()`, `Math.sqrt()`, `Math.abs()`, etc.) to simplify these computations. Most number-crunching problems involve extracting digits using the modulus (`%`) operator and removing digits using integer division (`/`). These exercises improve logical thinking, computational efficiency, and problem-solving skills while introducing concepts such as recursion, iteration, time complexity, and space optimization. They also serve as an excellent foundation for coding interviews and competitive programming platforms like LeetCode.

---

### Strong Number

A **Strong Number** is a positive integer in which the sum of the factorials of its individual digits is equal to the original number. To determine whether a number is strong, each digit is extracted using the modulus operator (`%`), its factorial is calculated, and the factorial values are added together. If the final sum equals the original number, the number is classified as a Strong Number. For example, **145** is a Strong Number because **1! + 4! + 5! = 1 + 24 + 120 = 145**. In Java, this problem is commonly solved using loops or helper methods to compute factorials. The algorithm has a time complexity of **O(d × f)**, where *d* is the number of digits and *f* represents the factorial computation. Strong Number programs help students practice nested loops, digit extraction, mathematical operations, and modular programming.

---

### Armstrong Number

An **Armstrong Number** (also known as a Narcissistic Number) is a number that is equal to the sum of each of its digits raised to the power of the total number of digits. The algorithm first counts the number of digits in the given number, then extracts each digit, raises it to the calculated power using `Math.pow()`, and sums the results. If the sum matches the original number, the number is an Armstrong Number. For example, **153** is an Armstrong Number because **1³ + 5³ + 3³ = 1 + 125 + 27 = 153**, and **9474** is also an Armstrong Number because **9⁴ + 4⁴ + 7⁴ + 4⁴ = 9474**. Java implementations typically use loops, temporary variables, and the `Math.pow()` method. This problem enhances understanding of exponentiation, digit manipulation, iterative processing, and algorithm development, making it a frequently asked interview and academic programming question.

---

### LeetCode 326 – Power of Three

**LeetCode Problem 326: Power of Three** requires determining whether a given integer is an exact power of 3. A number is considered a power of three if it can be expressed as **3ⁿ**, where **n ≥ 0**. For example, **27 = 3³**, so the output is `true`, whereas **45** is not a power of three, so the output is `false`. A straightforward Java solution repeatedly divides the number by 3 while it remains divisible. If the final value becomes 1, the number is a power of three; otherwise, it is not. Alternative solutions include recursion or mathematical approaches using logarithms, although repeated division is generally more reliable due to floating-point precision issues. This problem helps learners understand loops, divisibility, recursion, mathematical reasoning, and efficient algorithm implementation.

---

### LeetCode 1137 – N-th Tribonacci Number

**LeetCode Problem 1137: N-th Tribonacci Number** asks programmers to compute the *n*-th Tribonacci number. Unlike the Fibonacci sequence, where each number is the sum of the previous two numbers, the Tribonacci sequence is formed by adding the previous **three** numbers. The initial values are **T₀ = 0**, **T₁ = 1**, and **T₂ = 1**, with the recurrence relation **Tₙ = Tₙ₋₁ + Tₙ₋₂ + Tₙ₋₃** for **n ≥ 3**. For example, the sequence begins **0, 1, 1, 2, 4, 7, 13, 24, ...**. In Java, the most efficient solution uses dynamic programming or an iterative approach with three variables, achieving **O(n)** time complexity and **O(1)** space complexity. This problem introduces concepts such as dynamic programming, recurrence relations, iterative optimization, and memory-efficient programming.

---

### LeetCode 1518 – Water Bottles

**LeetCode Problem 1518: Water Bottles** is a simulation problem that tests logical thinking and iterative problem-solving. The problem provides the number of full water bottles and specifies how many empty bottles can be exchanged for one full bottle. The objective is to determine the maximum number of bottles that can be consumed. For example, if there are **9 full bottles** and **3 empty bottles** can be exchanged for one full bottle, the total number of bottles that can be consumed is **13**. In Java, the solution repeatedly drinks all available bottles, collects the empty bottles, exchanges them whenever possible, and continues until no further exchanges can be made. The algorithm primarily uses loops, integer division, and the modulus operator to track exchanges efficiently. This problem strengthens understanding of simulation algorithms, iterative computation, arithmetic operations, and real-world problem modeling while maintaining an efficient time complexity of **O(log n)** or proportional to the number of exchanges.


## LeetCode 709 – To Lower Case

**Problem Overview:**
LeetCode 709, **To Lower Case**, is one of the simplest string manipulation problems. The objective is to convert every uppercase English letter in a given string into its lowercase equivalent while leaving lowercase letters, numbers, spaces, and special characters unchanged. This problem introduces beginners to character manipulation, ASCII values, and built-in string methods. It demonstrates how programming languages handle character conversions and emphasizes the immutability of strings in Java, meaning a new string must be created instead of modifying the existing one.

**Approach:**
The easiest solution in Java is to use the built-in `toLowerCase()` method, which automatically converts all uppercase letters to lowercase. Alternatively, you can iterate through each character of the string, check if it lies between `'A'` and `'Z'`, and convert it by adding 32 to its ASCII value before appending it to a `StringBuilder`. This manual method helps understand character encoding and ASCII arithmetic.

**Time Complexity:** O(n)
**Space Complexity:** O(n)

**Concepts Learned:**

* String manipulation
* Character conversion
* ASCII values
* StringBuilder
* Java String methods

---

## LeetCode 1108 – Defanging an IP Address

**Problem Overview:**
LeetCode 1108, **Defanging an IP Address**, requires replacing every period (`.`) in an IPv4 address with `"[.]"`. This process is known as "defanging" because it makes the IP address harmless in documents or web pages by preventing browsers or systems from recognizing it as a clickable address. This problem focuses on string replacement operations and introduces beginners to text processing techniques.

**Approach:**
The simplest solution uses Java's `replace()` method:

```java
address.replace(".", "[.]");
```

Another approach is to iterate through each character, append it to a `StringBuilder`, and whenever a period is encountered, append `"[.]"` instead. Both methods produce the same output, although the built-in method is shorter and more readable.

**Time Complexity:** O(n)
**Space Complexity:** O(n)

**Concepts Learned:**

* String replacement
* StringBuilder
* Character traversal
* Built-in string methods

---

## LeetCode 771 – Jewels and Stones

**Problem Overview:**
LeetCode 771, **Jewels and Stones**, asks you to determine how many characters in a string representing stones are also present in another string representing jewels. Each character in the jewels string is considered valuable, and the goal is to count the number of valuable stones. This problem introduces searching, character comparison, and efficient data structures such as HashSet.

**Approach:**
The optimal solution stores every jewel character in a `HashSet<Character>`. Then, traverse the stones string and check whether each character exists in the set. If it does, increment the count. Using a HashSet provides constant-time lookups, making the algorithm efficient even for larger inputs.

**Time Complexity:** O(n + m)
**Space Complexity:** O(m)

*(n = number of stones, m = number of jewels)*

**Concepts Learned:**

* HashSet
* Character comparison
* Membership testing
* String traversal
* Efficient searching

---

## LeetCode 1528 – Shuffle String

**Problem Overview:**
LeetCode 1528, **Shuffle String**, provides a string and an integer array called `indices`. Each value in the indices array indicates the new position of the corresponding character in the original string. The task is to reconstruct the original string by placing each character into its correct position. This problem teaches array indexing and rearranging elements efficiently.

**Approach:**
Create a character array of the same length as the input string. Traverse the original string, and for every character at position `i`, place it into the character array at position `indices[i]`. Finally, convert the character array back into a string. This direct mapping solution is both simple and efficient.

**Time Complexity:** O(n)
**Space Complexity:** O(n)

**Concepts Learned:**

* Arrays
* Character arrays
* Index mapping
* String reconstruction

---

## LeetCode 242 – Valid Anagram

**Problem Overview:**
LeetCode 242, **Valid Anagram**, determines whether two strings are anagrams of each other. Two strings are considered anagrams if they contain exactly the same characters with the same frequencies, regardless of the order of the characters. This is a fundamental problem in string processing and frequency counting.

**Approach:**
One efficient solution uses an integer frequency array of size 26 for lowercase English letters. Traverse the first string and increment the count for each character. Then traverse the second string and decrement the corresponding count. If all values in the frequency array are zero after processing both strings, the strings are anagrams. Another valid approach is to sort both strings and compare them, though sorting is less efficient.

**Time Complexity:**

* Frequency Array: **O(n)**
* Sorting: **O(n log n)**

**Space Complexity:**

* Frequency Array: **O(1)** (fixed-size array)
* Sorting: **O(n)**

**Concepts Learned:**

* Frequency counting
* Arrays
* Character indexing
* Sorting
* String comparison

---

### Summary of Problems

| LeetCode | Problem Name            | Main Concept             | Time Complexity |
| -------- | ----------------------- | ------------------------ | --------------- |
| 709      | To Lower Case           | String conversion, ASCII | **O(n)**        |
| 1108     | Defanging an IP Address | String replacement       | **O(n)**        |
| 771      | Jewels and Stones       | HashSet, searching       | **O(n + m)**    |
| 1528     | Shuffle String          | Array indexing, mapping  | **O(n)**        |
| 242      | Valid Anagram           | Frequency array, hashing | **O(n)**        |

These problems are excellent beginner-level exercises that strengthen your understanding of **strings, arrays, character manipulation, HashSet, frequency counting, indexing, and Java's built-in string methods**. They also build the foundation for solving more advanced string and hashing problems on LeetCode.


# DSA Practice Questions - Set 2


## Array Problems

### Q1. Rotate Array by K Positions

**Problem:** Given an array, rotate it to the right by K steps.

**Input Format:**
- First line: integer `n`
- Second line: `n` space-separated integers
- Third line: integer `k`

**Output Format:**
- Array after rotation

**Example:**
```
Input:
5
1 2 3 4 5
2

Output:
4 5 1 2 3
```

**Key Concepts:** Array manipulation, modular arithmetic

---

### Q2. Find the Missing Number

**Problem:** Given `n-1` numbers from 1 to `n`, find the missing number.

**Input Format:**
- First line: integer `n`
- Second line: `n-1` space-separated integers

**Output Format:**
- Missing number

**Example:**
```
Input:
5
1 2 4 5

Output:
3
```

**Key Concepts:** Mathematical formula (sum of n natural numbers), XOR approach

---

## Linked List Problems

### Q3. Reverse a Linked List

**Problem:** Reverse a singly linked list.

**Input Format:**
- First line: integer `n`
- Second line: `n` space-separated integers

**Output Format:**
- Reversed linked list

**Example:**
```
Input:
4
10 20 30 40

Output:
40 30 20 10
```

**Key Concepts:** Pointer manipulation, iterative/recursive reversal

---

### Q4. Detect Loop in Linked List

**Problem:** Detect if a linked list contains a cycle using Floyd's algorithm.

**Input Format:**
- First line: integer `n`
- Second line: `n` space-separated integers
- Third line: integer `pos` (position where tail connects, `-1` for no loop)

**Output Format:**
- Print "Loop Found" or "No Loop"

**Example:**
```
Input:
5
1 2 3 4 5
2

Output:
Loop Found
```

**Key Concepts:** Floyd's Cycle Detection (Tortoise and Hare), two pointers

---

## Stack Problems

### Q5. Next Greater Element

**Problem:** For each element, print the next greater element to its right using a stack.

**Input Format:**
- First line: integer `n`
- Second line: `n` space-separated integers

**Output Format:**
- Next greater elements

**Example:**
```
Input:
4
4 5 2 25

Output:
5 25 25 -1
```

**Key Concepts:** Monotonic stack, O(n) solution

---

### Q6. Convert Infix to Postfix

**Problem:** Convert an infix expression to postfix using stack.

**Input Format:**
- A string containing infix expression

**Output Format:**
- Postfix expression

**Example:**
```
Input:
(A+B)*C

Output:
AB+C*
```

**Key Concepts:** Operator precedence, stack-based parsing, postfix notation

---

## Queue Problems

### Q7. Implement Priority Queue

**Problem:** Implement a priority queue where higher number = higher priority.

**Input Format:**
- Commands: `INSERT x`, `DELETE`, `DISPLAY`, `STOP`

**Output Format:**
- After each DISPLAY, print queue elements in priority order

**Example:**
```
Input:
INSERT 10
INSERT 50
INSERT 20
DELETE
DISPLAY
STOP

Output:
20 10
```

**Key Concepts:** Heap data structure, priority ordering

---

### Q8. First Non-Repeating Character in Stream

**Problem:** Given a stream of characters, print the first non-repeating character at each step.

**Input Format:**
- A string

**Output Format:**
- Characters separated by space (use queue)

**Example:**
```
Input:
aabc

Output:
a a b b
```

**Key Concepts:** Queue for ordering, hash map for frequency

---

## Recursion Problems

### Q9. Count Ways to Climb Stairs

**Problem:** You are given N steps. You can climb 1 or 2 steps at a time. Count the number of ways using recursion.

**Input Format:**
- Integer `n`

**Output Format:**
- Number of ways

**Example:**
```
Input:
4

Output:
5
```

**Key Concepts:** Fibonacci sequence, dynamic programming optimization

---

### Q10. Find Power Using Recursion

**Problem:** Compute `a^b` using recursion.

**Input Format:**
- Two integers `a` and `b`

**Output Format:**
- Result

**Example:**
```
Input:
2 10

Output:
1024
```

**Key Concepts:** Exponentiation by squaring, divide and conquer

---

## Searching Algorithms

### Q11. Find First and Last Occurrence (Binary Search)

**Problem:** In a sorted array, find the first and last position of a target value.

**Input Format:**
- First line: integer `n`
- Second line: `n` space-separated sorted integers
- Third line: integer `target`

**Output Format:**
- Two integers: first and last index (0-based), or `-1 -1` if not found

**Example:**
```
Input:
7
2 4 4 4 6 7 8
4

Output:
1 3
```

**Key Concepts:** Modified binary search, finding boundaries

---

### Q12. Jump Search

**Problem:** Perform Jump Search on a sorted array.

**Input Format:**
- First line: integer `n`
- Second line: `n` space-separated sorted integers
- Third line: integer `key`

**Output Format:**
- Index (0-based) if found, else `-1`

**Example:**
```
Input:
6
1 3 5 7 9 11
7

Output:
3
```

**Key Concepts:** Jump size = √n, block-based searching

---

## Sorting Algorithms

### Q13. Selection Sort

**Problem:** Sort an array using Selection Sort.

**Input Format:**
- First line: integer `n`
- Second line: `n` space-separated integers

**Output Format:**
- Sorted array

**Example:**
```
Input:
5
64 25 12 22 11

Output:
11 12 22 25 64
```

**Key Concepts:** In-place sorting, O(n²) time complexity

---

### Q14. Quick Sort

**Problem:** Sort an array using Quick Sort.

**Input Format:**
- First line: integer `n`
- Second line: `n` space-separated integers

**Output Format:**
- Sorted array

**Example:**
```
Input:
6
10 7 8 9 1 5

Output:
1 5 7 8 9 10
```

**Key Concepts:** Divide and conquer, partitioning, pivot selection

---

### Q15. Heap Sort

**Problem:** Sort an array using Heap Sort.

**Input Format:**
- First line: integer `n`
- Second line: `n` space-separated integers

**Output Format:**
- Sorted array

**Example:**
```
Input:
6
4 10 3 5 1 2

Output:
1 2 3 4 5 10
```

**Key Concepts:** Max heap, heapify, O(n log n) time complexity

---

# Programming Problems 3

## Problem 1: Padosan (Adjacent Squares)

### Problem Description

A Square is a closed geometric figure with 4 equal sides, and its interior angles all right angles (90°). From this it follows that the opposite sides are parallel.

Consider a grid comprising several identical squares. Squares sharing one of its sides with another are adjacent squares (Padosan). Overlapping squares and squares sharing a single vertex point are not considered adjacent.

### Example

In the following figure:
- Square 1 is adjacent to squares 2 & 4
- Square 2 is adjacent to squares 1 & 3
- Square 3 is adjacent to square 2
- Square 4 is adjacent to square 1
- Square 5 is adjacent to square 6
- Square 6 is adjacent to square 5
- Square 7 is isolated (not adjacent to any of the other squares)



### Input Specification

1. The first line of the input will contain integer N where N is number of squares (1 ≤ N ≤ 50).
2. The next N lines will contain 8 positive integers in each line, each pair of the integers represents the (x, y) coordinates of one of the vertices of the Nth square.

### Output Specification

On each line print the square number and the number of the squares adjacent to it, separated by a space, for each square starting from square no. 1 to square no. N terminated by new line character.

### Sample Test Cases

#### Sample 1

**Input:**
```
7
1 1 3 1 3 3 1 3
3 1 5 1 5 3 3 3
5 1 7 1 7 3 5 3
1 3 3 3 3 5 1 5
1 7 3 7 3 9 1 9
3 7 5 7 5 9 3 9
5 4 7 4 7 6 5 6
```

**Output:**
```
1 2
2 2
3 1
4 1
5 1
6 1
7 0
```

#### Sample 2

**Input:**
```
4
1 1 3 1 3 3 1 3
3 1 5 1 5 3 3 3
1 3 3 3 3 5 1 5
3 3 5 3 5 5 3 5
```

**Output:**
```
1 2
2 2
3 2
4 2
```

---

## Problem 2: ShabdKhosh (Word Chaining)

### Problem Description

You have to write a program to chain some words. A word is properly chained if it starts with a trailing sub-string of its predecessor word with a minimum overlap of three (3) characters. Given a number of words, you have to reorder them to appropriately chain them. The first word in the input is used as a starting word in the chain. It may happen that there is no chaining possible for a given set of words. If chaining is possible, assume that there will be a unique word chain.

**Note:** A word is a sequence of alphabetic characters.

### Input Specification

- The first line will be an integer N, indicating the number of words that will follow. Assume N will never be greater than twenty (20)
- The next N lines of input will contain words, which are to be chained. Assume that the maximum length of a word will never exceed thirty (30) characters.

### Output Specification

- Your program should output the chain of words, one word on a separate line. If there is no chain possible from the given words, the program should print `IMPOSSIBLE`

### Sample Test Cases

#### Sample 1

**Input:**
```
2
start
finish
```

**Output:**
```
IMPOSSIBLE
```

#### Sample 2

**Input:**
```
8
whisper
format
perform
sonnet
person
shopper
workshop
network
```

**Output:**
```
whisper
person
sonnet
network
workshop
shopper
perform
format
```

**Explanation:** 
- whisper → person (overlap: "per")
- person → sonnet (overlap: "son")
- sonnet → network (overlap: "net")
- network → workshop (overlap: "work")
- workshop → shopper (overlap: "shop")
- shopper → perform (overlap: "per")
- perform → format (overlap: "form")

---

## Problem 3: Happy Numbers

### Problem Description

Let the sum of the squares of the digits of a positive integer s₀ be represented by s₁. In a similar way, let the sum of the squares of the digits of s₁ be represented by s₂, and so on. If sᵢ = 1 for some i ≥ 1, then the original integer s₀ is said to be happy.

**Example:** Starting with 7 gives the sequence:
- 7
- 49 (= 7²)
- 97 (= 4² + 9²)
- 130 (= 9² + 7²)
- 10 (= 1² + 3² + 0²)
- 1 (= 1² + 0²)

So 7 is a happy number, which reaches 1 on 6 iterations.

The first few happy numbers are: 1, 7, 10, 13, 19, 23, 28, 31, 32, 44, 49, 68, 70, 79, 82, 86, 91, 94, 97, 100, ...

The number of iterations i required for these to reach 1 are, respectively: 1, 6, 2, 3, 5, 4, 4, 3, 4, 5, 5, 3, ...

A number that is not happy is called unhappy. Once it is known whether a number is happy (unhappy), then any number in the sequence s₁, s₂, s₃, ... will also be happy (unhappy). Unhappy numbers have eventually periodic sequences of sᵢ which do not reach 1 (e.g., 4, 16, 37, 58, 89, 145, 42, 20, 4, ...).

You need to write a program to find all the happy numbers in a given closed interval, which reach 1 within 10 iterations.

### Input Specification

- It is a single line input of two positive integers separated by a space.

### Output Specification

- Print all happy numbers in the interval and the number of iterations required by it to reach 1, separated by a space and each in a new line.

### Sample Test Cases

#### Sample 1

**Input:**
```
7 11
```

**Output:**
```
7 6
10 2
```

#### Sample 2

**Input:**
```
44 68
```

**Output:**
```
44 5
49 5
68 3
```

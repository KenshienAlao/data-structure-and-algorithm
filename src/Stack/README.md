## What is a Stack?

[![View Sample Code](https://img.shields.io/badge/View_Sample_Code-StackLesson.java-blue?style=for-the-badge&logo=java)](./StackLesson.java)

A **Stack** is a data structure that follows the **LIFO (Last In, First Out)** principle.

This means the **last item added** to the stack is the **first item removed**.

Example:

```text
Push Apple
Push Banana
Push Orange

Stack:
Top
Orange
Banana
Apple
```

If we remove an item using `pop()`, Orange will be removed first because it was added last.

---

## Stack Methods

### isEmpty()

Checks whether the stack is empty.

```java
stack.isEmpty();
```

Returns:

- `true` if the stack has no items
- `false` if the stack contains items

---

### push()

Adds an item to the top of the stack.

```java
stack.push("Apple");
```

---

### pop()

Returns and removes the top item from the stack.

```java
stack.pop();
```

Example:

```text
Before:
Top
Orange
Banana
Apple

After pop():
Top
Banana
Apple
```

---

### peek()

Returns the top item without removing it.

```java
stack.peek();
```

Example:

```text
Top item: Banana

Stack remains unchanged.
```

---

### search()

Searches for an item and returns its position from the top.

```java
stack.search("Apple");
```

Example:

```text
Top
Banana  -> Position 1
Apple   -> Position 2
```

Result:

```text
2
```

If the item is not found:

```java
stack.search("Orange");
```

Result:

```text
-1
```

---

## Summary

| Method      | Description                                         |
| ----------- | --------------------------------------------------- |
| `isEmpty()` | Checks if the stack is empty                        |
| `push()`    | Adds an item to the top                             |
| `pop()`     | Returns and removes the top item                    |
| `peek()`    | Returns the top item without removing it            |
| `search()`  | Finds an item and returns its position from the top |

## Problems
### Problem 1: "Reverse a String"
```text
Input: Hello
Output: olleH

Starter: String text = "Hello"

tip: Use a Stack<Character> and use for loop to print the reversed string
```
[![Solution](https://img.shields.io/badge/Solution-Click_Here-blue?style=for-the-badge&logo=java)](./Problems/Problem1.java)

### Problem 2: "Check Balanced Parentheses"
```text
Input: ((()))
Output: Balanced

Input: (()
Output: Not Balanced

Starter: String text = "((()))"

tip: Use push/pop and use conditional
```
[![Solution](https://img.shields.io/badge/Solution-Click_Here-blue?style=for-the-badge&logo=java)](./Problems/Problem2.java)

### Problem 3: "Display Stack Contents Without Destroying It"
```text
Expected Output:
Top
Xiaomi
Samsung
Tablet
iPhone

Starter: Stack = [iPhone, Tablet, Samsung, Xiaomi]

tip: Use temporary storage
```
[![Solution](https://img.shields.io/badge/Solution-Click_Here-blue?style=for-the-badge&logo=java)](./Problems/Problem3.java)


### Problem 4: "Finding The Largest Number And Print The Stack"
```text
Expected Output:
Largest: 13

Starter: Stack = [10, 5, 50, 3, 13]

tip: Use temporary storage
```
[![Solution](https://img.shields.io/badge/Solution-Click_Here-blue?style=for-the-badge&logo=java)](./Problems/Problem4.java)

### Problem 5: "Browser Back Button Simulation"
```text
Current Page: Facebook

Back -> GitHub
Back -> YouTube

Current Page: YouTube

Starter:
        history.push("Google");
        history.push("YouTube");
        history.push("GitHub");
        history.push("Facebook");

tip: use size() to determine if there&apos;s a page to back
```
[![Solution](https://img.shields.io/badge/Solution-Click_Here-blue?style=for-the-badge&logo=java)](./Problems/Problem5.java)
## What is a Queue?

[![View Sample Code](https://img.shields.io/badge/View_Sample_Code-QueuesLesson.java-blue?style=for-the-badge&logo=java)](./QueuesLesson.java)

A **Queue** is a data structure that follows the **FIFO (First In, First Out)** principle.

This means the **first item added** to the queue is the **first item removed**.

![Queue](/src/assets//queue.webp)

Example:

```text
offer Spongebob
offer Patrick
offer Squidward

Head                    Tail
Spongebob -> Patrick -> Squidward
```

If we remove an item using `poll()`, Spongebob will be removed first because he entered the queue first.

---

## Queue Methods

### isEmpty()

Checks whether the queue is empty.

```java
queue.isEmpty();
```

Returns:

- `true` if the queue has no items
- `false` if the queue contains items

---

### offer()

Adds an item to the tail of the queue.

```java
queue.offer("Spongebob");
```

---

### poll()

Returns and removes the head item from the queue.

```java
queue.poll();
```

Example:

```text
Before:
Head                    Tail
Spongebob -> Patrick -> Squidward

After poll():
Head             Tail
Patrick -> Squidward
```

---

### peek()

Returns the head item without removing it.

```java
queue.peek();
```

Example:

```text
Current head: Patrick

Queue remains unchanged.
```

---

## Summary

| Method      | Description                               |
| ----------- | ----------------------------------------- |
| `isEmpty()` | Checks if the queue is empty              |
| `offer()`   | Adds an item to the tail                  |
| `poll()`    | Returns and removes the head item         |
| `peek()`    | Returns the head item without removing it |

## Problems

### Problem 1: "Print All Queue Elements"

```text
Input:
Spongebob
Patrick
Squidward

Output:
Spongebob
Patrick
Squidward

Tip: Use poll() until the queue becomes empty.
```

[![Solution](https://img.shields.io/badge/Solution-Click_Here-blue?style=for-the-badge&logo=java)](./Problems/Problem1.java)

### Problem 2: "Sum All Numbers in a Queue"

```text
Input:
10
20
30
40

Output:
100

Tip: Use poll() and add each number to a sum variable.
```

[![Solution](https://img.shields.io/badge/Solution-Click_Here-blue?style=for-the-badge&logo=java)](./Problems/Problem2.java)

### Problem 3: "Find the Average"

```text
Input:
10
20
30
40

Output:
25.0

Tip: Keep track of both the sum and the count.
```

[![Solution](https://img.shields.io/badge/Solution-Click_Here-blue?style=for-the-badge&logo=java)](./Problems/Problem3.java)

### Problem 4: "Find the Average"

```text
Input:
1
2
3
4
5
6

Output:
2
4
6

Tip: Use the modulo operator (%) to check if a number is even.
```

[![Solution](https://img.shields.io/badge/Solution-Click_Here-blue?style=for-the-badge&logo=java)](./Problems/Problem4.java)

### Problem 5: "Count How Many Times a Number Appears"

```text
Input:
10
20
10
30
10

Search:
10

Output:
3

Tip: Increment a counter whenever the number matches.
```

[![Solution](https://img.shields.io/badge/Solution-Click_Here-blue?style=for-the-badge&logo=java)](./Problems/Problem5.java)

## What is a LinkedList?

[![View Sample Code](https://img.shields.io/badge/View_Sample_Code-LinkedListLesson.java-blue?style=for-the-badge&logo=java)](./LinkedListLesson.java)

A **LinkedList** is a data structure that stores elements in **nodes**.

Each node contains:

- Data
- A reference to the next node

Unlike arrays, elements are not stored in contiguous memory locations.

![LinkedList](/src/assets/linkedlist.webp)

Example:

```text
Head
[Spongebob] -> [Patrick] -> [Squidward] -> null
```

A LinkedList can be used as a:

- List
- Queue (FIFO)
- Stack (LIFO)

### Why Sort → Merge is Important for Performance

![Merge](/src/assets/merge.webp)

The **Sort -> Merge** technique is important because it allows data to be processed efficiently.

After data is sorted, two collections can be merged by simply comparing their front elements and taking the smaller value. Each element is visited only once during the merge process.

```text
Sorted List 1:
[1, 3, 5]

Sorted List 2:
[2, 4, 6]

Merge:
1 → 2 → 3 → 4 → 5 → 6
```

The merge step runs in:

```text
O(n + m)
```

which is one of the most efficient time complexities possible for combining two collections.

Without sorting, algorithms often need additional comparisons, searches, or a full re-sort of the merged data, resulting in slower performance.

This concept is heavily used in Data Structures and Algorithms, especially in:

- Merge Sort
- Database joins
- Processing large datasets
- External sorting
- Combining sorted search results

Learning **Sort → Merge** is valuable because it demonstrates how organizing data first can significantly improve the performance of later operations.

---

## LinkedList Methods

### isEmpty()

Checks whether the LinkedList is empty.

```java
list.isEmpty();
```

Returns:

- `true` if the LinkedList has no elements
- `false` if the LinkedList contains elements

---

### add()

Adds an element to the end of the LinkedList.

```java
list.add("Spongebob");
```

---

### addFirst()

Adds an element to the beginning of the LinkedList.

```java
list.addFirst("Spongebob");
```

---

### addLast()

Adds an element to the end of the LinkedList.

```java
list.addLast("Spongebob");
```

---

### remove()

Removes the first matching element.

```java
list.remove("Patrick");
```

---

### getFirst()

Returns the first element.

```java
list.getFirst();
```

---

### getLast()

Returns the last element.

```java
list.getLast();
```

---

### size()

Returns the number of elements.

```java
list.size();
```

---

### contains()

Checks whether an element exists.

```java
list.contains("Spongebob");
```

Returns:

- `true` if found
- `false` if not found

---

## Queue Methods

Since LinkedList implements the Queue interface, it can also be used as a Queue.

### offer()

Adds an element to the tail.

```java
list.offer("Sandy");
```

---

### poll()

Removes and returns the head element.

```java
list.poll();
```

---

### peek()

Returns the head element without removing it.

```java
list.peek();
```

---

## Stack Methods

Since LinkedList implements the Deque interface, it can also be used as a Stack.

### push()

Adds an element to the top.

```java
list.push("Mr. Krabs");
```

---

### pop()

Removes and returns the top element.

```java
list.pop();
```

---

### peek()

Returns the top element without removing it.

```java
list.peek();
```

---

## Summary

| Method       | Description                         |
| ------------ | ----------------------------------- |
| `isEmpty()`  | Checks if the LinkedList is empty   |
| `add()`      | Adds an element to the end          |
| `addFirst()` | Adds an element to the beginning    |
| `addLast()`  | Adds an element to the end          |
| `remove()`   | Removes a matching element          |
| `getFirst()` | Returns the first element           |
| `getLast()`  | Returns the last element            |
| `size()`     | Returns the number of elements      |
| `contains()` | Checks if an element exists         |
| `offer()`    | Adds an element to the tail (Queue) |
| `poll()`     | Removes the head element (Queue)    |
| `peek()`     | Returns the head/top element        |
| `push()`     | Adds an element to the top (Stack)  |
| `pop()`      | Removes the top element (Stack)     |

---

## Problems

### Problem 1: "Search for an Element"

```text
Input:
Spongebob
Patrick
Squidward

Search:
Patrick

Output:
Found

Tip: Use contains() or a loop.
```

[![Solution](https://img.shields.io/badge/Solution-Click_Here-blue?style=for-the-badge&logo=java)](./Problems/Problem1.java)

### Problem 2: "All Even Numbers"

```text
Input:
1
2
3
4
5
6

Output:
[2, 4, 6]

Tip: Use removeIf().
```

[![Solution](https://img.shields.io/badge/Solution-Click_Here-blue?style=for-the-badge&logo=java)](./Problem/Problem2.java)

### Problem 3: "Remove Every Second Element"

```text
Input:
A
B
C
D
E
F

Output:
[A, C, E]

Tip: Remove elements at odd indexes.
```

[![Solution](https://img.shields.io/badge/Solution-Click_Here-blue?style=for-the-badge&logo=java)](./Problem/Problem3.java)

### Problem 4: "Remove Consecutive Duplicates"

```text
Input:
A
A
B
B
B
C
A

Output:
[A, B, C, A]

Tip: Compare each element with the previous one.
```

[![Solution](https://img.shields.io/badge/Solution-Click_Here-blue?style=for-the-badge&logo=java)](./Problem/Problem4.java)

### Problem 5: "Merge Two Sorted LinkedLists"

```text
List 1:
[5, 1, 3]

List 2:
[6, 2, 4]

Output:
[1, 2, 3, 4, 5, 6]

Tip: Compare the front elements of both lists.
```

[![Solution](https://img.shields.io/badge/Solution-Click_Here-blue?style=for-the-badge&logo=java)](./Problem/Problem5.java)

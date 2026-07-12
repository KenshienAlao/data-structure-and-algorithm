## What is a Queue?

[![View Sample Code](https://img.shields.io/badge/View_Sample_Code-QueuesLesson.java-blue?style=for-the-badge&logo=java)](./QueuesLesson.java)

A **Queue** is a data structure that follows the **FIFO (First In, First Out)** principle.

This means the **first item added** to the queue is the **first item removed**.

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

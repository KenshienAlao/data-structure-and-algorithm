# What is a Dynamic Array?

A **Dynamic Array** is a data structure that can **grow in size when it becomes full**.

Unlike a **Static Array**, which has a fixed capacity, a Dynamic Array can create a **new larger array** and move all existing elements into it when more space is needed.

Examples in different programming languages:

- **Java** => ArrayList
- **C++** => Vector
- **JavaScript** => Array
- **Python** => List

![Dynamic Array](/src/assets/dynamicarray.png)

---

# Static Array

A **Static Array** has a fixed capacity.

```text
                    new String[4]

                0        1        2      3
             "Banana" "Apple" "Grapes" null

                    size: 3
                 capacity: 4
```

A static array is fast because every element has an index.

To access an element, we simply use its index.

```java
fruits[1]; // Apple
```

Accessing an element takes **O(1)** time.

This means it takes the same amount of time no matter how many elements are in the array.

![O(1)](/src/assets/o1.png)

---

## Searching

To find a value, we usually start from index `0` and check each element until we find it.

```java
Banana -> Apple -> Grapes
```

Searching takes **O(n)** time.

The more elements there are, the longer it may take.

## ![O(n)](/src/assets/on.png)

## Inserting an Element

If we insert at the beginning, all following elements must move one position to the right.

### Before

```text
                    new String[4]

                0        1        2      3
             "Banana" "Apple" "Grapes" null
```

### After

```text
                    new String[4]

                0        1        2         3
             "Lemon" "Banana" "Apple" "Grapes"
```

This takes **O(n)** time because elements need to be shifted.

---

## Deleting an Element

If we delete an element from the beginning, all remaining elements must move one position to the left.

### Before

```text
                    new String[4]

                0        1        2         3
             "Lemon" "Banana" "Apple" "Grapes"
```

### After

```text
                    new String[4]

                0        1        2      3
             "Banana" "Apple" "Grapes" null
```

This also takes **O(n)** time.

---

# Major Disadvantage of Static Arrays

A static array has a fixed capacity.

When the array becomes full, it cannot store any more elements.

```text
capacity = 4
size     = 4

Array is full!
```

To add more elements, we would need to create a completely new array with a larger size.

---

# Dynamic Array

A Dynamic Array solves the fixed-capacity problem.

When the internal array becomes full, a new larger array is created.

The old elements are copied into the new array.

### Before

```text
                    new String[4]

                0        1        2         3
             "Lemon" "Banana" "Apple" "Grapes"

                    size: 4
                 capacity: 4
```

### Resize

```text
                  new String[8]

          0        1        2         3      4    5    6    7
       "Lemon" "Banana" "Apple" "Grapes" null null null null

                    size: 4
                 capacity: 8
```

Many programming languages increase the capacity by a **growth factor** such as 1.5x or 2x.

![Growth Factor](/src/assets/growthfactor.png)

---

# Time Complexity

| Operation           | Dynamic Array |
| ------------------- | ------------- |
| Access              | O(1)          |
| Search              | O(n)          |
| Insert at End       | O(1) Average  |
| Insert at Beginning | O(n)          |
| Delete at End       | O(1)          |
| Delete at Beginning | O(n)          |
| Resize              | O(n)          |

---

# Advantages of Dynamic Arrays

- Fast random access **O(1)**
- Can grow automatically when full
- Good cache performance
- Fast insertion at the end
- Easy to use in most programming languages

---

# Disadvantages of Dynamic Arrays

- Uses extra memory
- Inserting or deleting in the middle requires shifting elements **O(n)**
- Resizing requires copying all elements **O(n)**
- May allocate more space than currently needed

---

# Summary

A **Static Array** has a fixed size and cannot grow.

A **Dynamic Array** can automatically increase its capacity when it becomes full.

Because of this flexibility, Dynamic Arrays are one of the most commonly used data structures in programming and are the foundation of structures such as **ArrayList (Java)**, **Vector (C++)**, **List (Python)**, and **Array (JavaScript)**.

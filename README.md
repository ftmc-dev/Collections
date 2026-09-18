# Java Collections

This repository contains my practice and exercises while learning **Java Collections Framework** as a beginner.

I created this repository to understand how Java collections work, how to use the different collection types, and how to choose the appropriate collection for a particular problem.

## Learning Objectives

Through this repository, I am learning to:

* Understand why collections are used instead of arrays in some situations.
* Understand the Java Collections Framework.
* Understand the difference between `List`, `Set`, `Queue`, and `Map`.
* Add, remove, search, and iterate through elements.
* Understand how duplicates and ordering are handled.
* Understand the difference between `ArrayList` and `LinkedList`.
* Understand `HashSet`, `LinkedHashSet`, and `TreeSet`.
* Understand `HashMap`, `LinkedHashMap`, and `TreeMap`.
* Use `Comparable` and `Comparator` for sorting.
* Understand `equals()` and `hashCode()`.
* Practice using `Iterator` and `ListIterator`.
* Practice using Streams with collections.

## Topics Studied

### 1. Introduction to Collections

* Why collections exist
* Limitations of arrays
* Java Collections Framework
* `Collection` interface

### 2. List

* `List`
* `ArrayList`
* `LinkedList`
* Ordered elements
* Index-based access
* Duplicate elements

### 3. Set

* `Set`
* `HashSet`
* `LinkedHashSet`
* `TreeSet`
* Unique elements
* `equals()`
* `hashCode()`

### 4. Map

* `Map`
* `HashMap`
* `LinkedHashMap`
* `TreeMap`
* Key-value relationships
* Unique keys

### 6. Sorting

* `Comparable`
* `compareTo()`
* `Comparator`
* `compare()`
* Natural ordering
* Custom ordering

### 7. Iterators

* `Iterator`
* `ListIterator`
* Iterating through collections
* `ConcurrentModificationException`
* Fail-fast behavior

### 8. Generics

* Generic collections
* Type safety
* Wildcards
* `? extends`
* `? super`

## 📝 Exercises

The repository contains exercises that I use to practice what I learn.

Some examples include:

* Working with `ArrayList`
* Removing duplicates with `HashSet`
* Sorting elements with `TreeSet`
* Counting word frequencies with `HashMap`
* Comparing `ArrayList` and `LinkedList`
* Sorting objects using `Comparable`
* Sorting objects using `Comparator`
* Using `equals()` and `hashCode()`
* Iterating and modifying collections safely

## What I Am Learning

One of the main things I am learning is that there is **no single collection that is always the best**.

The choice depends on what I need to do.

For example:

```text
Need ordered elements + duplicates
        ↓
      List

Need unique elements
        ↓
       Set

Need FIFO processing
        ↓
      Queue

Need key → value relationships
        ↓
       Map
```

I am also learning to consider:

* Ordering
* Duplicates
* Search
* Insertion
* Removal
* Sorting
* Performance
* Type safety

## 🚀 Goal

My goal is not only to know the syntax of Java Collections, but to understand **why and when to use each collection**.

I will continue adding exercises and projects as I progress in my Java learning journey.

---

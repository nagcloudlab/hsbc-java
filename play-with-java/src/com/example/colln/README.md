




Collection
------------

    - ready-to-use data structures and algorithms in Java
    - group of objects represented as a single unit
  
------------------------------------------------------------
Types of Collection
------------------------------------------------------------

1. List
    
    - index based
    - duplicate elements
    - ordered

2. Set

    - no index
    - no duplicate elements
    - unordered / ordered / sorted
   
3. Map
    
    - key-value pair
    - key is unique
    - value can be duplicate
    - key is used to retrieve the value

------------------------------------------------------------
Collection classes
------------------------------------------------------------


List

    - Vector ( dynamic array ) - synchronized
    - ArrayList ( dynamic array )
    - LinkedList ( doubly linked list )
    - Stack extends Vector ( LIFO )

Queue ( FIFO )

    - PriorityQueue ( heap )
    - ArrayDeque ( resizable array )
    - LinkedList ( doubly linked list )

Set

    - HashSet ( hashtable ) - unordered
    - LinkedHashSet ( hashtable + linked list ) - ordered
    - TreeSet ( Red-Black tree ) - sorted

Map

    - HashMap ( hashtable ) - unordered
    - LinkedHashMap ( hashtable + linked list ) - ordered
    - TreeMap ( Red-Black tree ) - sorted
    - HashTable ( hashtable ) - synchronized
    - Properties ( hashtable ) - key and value are string

------------------------------------------------------------

https://levelup.gitconnected.com/java-collections-framework-class-hierarchy-latest-2024-51f9154f1f57



Comparable and Comparator are both interfaces in Java 
used for sorting objects, 
but they serve different purposes and are used in different scenarios.

Comparable
Purpose: Used to define the natural ordering of objects.
Method: compareTo(T o)
Implementation: The class itself implements the Comparable interface.
Usage: Suitable when you want to define a default sorting order for objects of a class.


Comparator
Purpose: Used to define an external ordering of objects.
Method: compare(T o1, T o2)
Implementation: A separate class implements the Comparator interface.
Usage: Suitable when you want to define multiple sorting orders or when you cannot modify the class whose objects you want to sort.



When to use Which  collection in Java?
------------------------------------------------------------


1. Vector
   
   - dynamic array
   - synchronized list ( thread-safe )
   - slow
 
2. ArrayList
   
   - dynamic array
   - non-synchronized list ( not thread-safe )
   - fast

3. LinkedList

    - doubly linked list
    - non-synchronized list ( not thread-safe )
    - fast for add and remove operations

4. Stack

    - LIFO ( Last In First Out )
    - extends Vector class

5. PriorityQueue

    - heap
    - unbounded queue
    - ordered by the elements' natural ordering or by a Comparator provided at queue construction time

6. ArrayDeque

    - resizable array
    - faster than Stack and LinkedList

7. HashSet

    - hashtable
    - unordered
    - no duplicate elements

8. LinkedHashSet

    - hashtable + linked list
    - ordered
    - no duplicate elements

9. TreeSet

    - Red-Black tree
    - sorted
    - no duplicate elements

10. HashMap

    - hashtable
    - unordered
    - no duplicate keys

11. LinkedHashMap

    - hashtable + linked list
    - ordered
    - no duplicate keys

12. TreeMap

    - Red-Black tree
    - sorted
    - no duplicate keys

13. HashTable

    - hashtable
    - synchronized
    - no null key or value

14. Properties

    - hashtable
    - key and value are string
    - used to store configuration data

------------------------------------------------------------




















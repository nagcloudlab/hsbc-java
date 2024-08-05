




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
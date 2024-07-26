

interface vs abstract class
============================

similarities

1. Both can have methods without implementation.
2. can't be instantiated.

differences

1. Abstract class can have constructors, interfaces can't.
2. Abstract class can have mutable fields, interfaces can have only constants.

recommendation :

top-level - interface
middle-level - abstract class ( if required )
bottom-level - concrete class(s)



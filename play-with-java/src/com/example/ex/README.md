


Why we Exceptions in java?

- to separate error handling code from normal code
- to propagate errors up the call stack
- to provide a way to handle errors that occur in different parts of the program

---

Throwable
    - Error
    - Exception (checked)
        - RuntimeException (unchecked)

---

Error: 
    - OutOfMemoryError
    - StackOverflowError
    - NoClassDefFoundError
    - ...

---

Exception: 
    - IOException
    - SQLException
    - ClassNotFoundException
    - ...

---

RuntimeException: 
    - NullPointerException
    - ArrayIndexOutOfBoundsException
    - ClassCastException
    - ArithmeticException
    - IllegalArgumentException
    - IllegalStateException
    - ...

--- 

when to use 'throw' keyword?
- when you want to throw an exception/error

when to use 'throws' keyword?
- to declare that a method throws  'checked exception'


when to use 'try-catch' block?
- when you want to handle an exception

when to use 'finally' block?
- when you want to execute a block of code regardless of whether an exception is thrown or not


---
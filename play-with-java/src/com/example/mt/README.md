


process vs thread
=================


A process 
    - is an instance of a program running in a computer.    
    - has its own memory space

A thread
    - is a subset of a process.
    - shares the memory space of the process that created it.
    - is a lightweight process.
    - is a basic unit of CPU utilization.
    - is a path of execution within a process.


A process can have multiple threads.

------------------------------------------------------------


Why we need multiple threads in a process?

-> to utilize the CPU efficiently.
-> to perform multiple tasks simultaneously.
-> to perform multiple tasks in parallel.
-> to improve the performance of the application.

------------------------------------------------------------

How to create a thread in Java?

-> create instance of java.lang.Thread class 
-> assign a task to the thread via Runnable interface
-> start the thread using start() method ( stack memory is allocated for the thread and the run() method is called )
-> manage the thread using join(), sleep(), yield() methods
-> terminate the thread using stop() method ( deprecated )

------------------------------------------------------------














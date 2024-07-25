
    design issues

    -> tight-coupling b/w dependent & dependency
        => maintenance issues i.e not able expant with new features easily
    -> unit testing not possible
        => bug fix slow, dev slow

    performance issues

    -> creating dependency obj on each transaction
        => resource use high, responsive to user..

     why these issues?

      -> dependent itself creating its own dependency

     How to fix design issues?

     -> Don't create dependency in dependent's class,
        get from factory, and abstract dependency via interface
     
        problem: dependent should know from which factory,
                 the dependency available
        
    How to fix performance issues?    

    -> Dont't get/find object from factory directly,
       inject by 'some-one' 



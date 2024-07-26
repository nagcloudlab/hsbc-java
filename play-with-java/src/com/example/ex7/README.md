


  proj
  
    - p1 (A, B extends A, C)
    - p2 (D extends A, E)

            
            -----------------------------------------------------------
            same-package                    | other-package
            -----------------------------------------------------------
            same-class sub-class other-class| sub-class  other-class
            -----------------------------------------------------------
     private  Y       N       N             |    N        N
     default  Y       Y       Y             |    N        N
    protected Y       Y       Y             |    Y        N
     public   Y       Y       Y             |    Y        Y
            -----------------------------------------------------------
                
              
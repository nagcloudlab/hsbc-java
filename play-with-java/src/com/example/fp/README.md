

style of programming
--------------------

1. imperative style
    
-> solving any problem by writing a sequence of statements

    intention ( What) & implementation ( How ) are mixed


2. declarative style

    separation of intention ( What) & implementation ( How )    

    - by primitive/obj params
    - by functions ( Function as first class citizen )


--------------------------------------------------

before 1.8
class WeightPredicate implements Predicate {
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
Predicate p = new WeightPredicate();


// from java 1.8

Predicate p = (Apple apple) -> {
return apple.getWeight() > 150;
}

--------------------------------------------------


Why we need LE in Java ?

    -> to write compact/concise code


--------------------------------------------------
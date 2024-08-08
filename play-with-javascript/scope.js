// javascript scope aka execution context

/*

scope


 -> stack-frame with given args and local variables
 -> when we call a function, a new stack-frame is created

 by default jd runtime, has one global scope

 phases:

    1. creation phase

        any variable declared with var keyword 
        is hoisted to the top of the function whit undefined value

        every function invocation creates a new scope,
        which child in which scope that function is defined

*/

//debugger;

// console.log(v); // undefined
// var v = 12;
// console.log(v); // 12

// Quiz1

// var v = 12;

// function f1() {
//   console.log(v);
//   var v = 13;
// }

// f1(); // f1-scope <--- global-scope

// Quiz2

// var v = 12;

// function f1() {
//   function f2() {
//     console.log(v);
//   }
//   f2(); // f2-scope <--- f1-scope
//   var v = 13;
// }

// f1(); // f1-scope <--- global-scope

// var v = 12;
// var v = 13;

// quiz

// var v = 12;
// if (true) {
//   var v = 13;
// }
// console.log(v);

// problems with 'var' keyword

// 1. variable hoisting
// 2. no block-scope
// 3. can re-declare same variable multiple times

// solution: let and const keywords (es6)

// console.log(v);
// let v = 12;

// let v = 12;
// let v = 13;

// let v = 12;
// if (true) {
//   let v = 13;
// }

// console.log(v);

// const PI = 3.14;
// PI = 3.15;

// Quiz

const trainer = {
  name: "Nag",
};

trainer.name = "Nag N";

console.log(trainer.name);

// trainer = null;

// summary

// 1. use 'let' keyword for mutable reference
// 2. use 'const' keyword for immutable reference
// 3. avoid using 'var' keyword

for (let i = 0; i < 2; i++) {
  for (let i = 0; i < 2; i++) {
    console.log("listen.....");
  }
}

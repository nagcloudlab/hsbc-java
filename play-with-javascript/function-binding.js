"use strict";

// function add(a, b) {
//   return a + b;
// }

// console.log(add(2, 3)); // 5

// imp-note : by defaule every function bound to global object
// in browser it is window object ( non strict mode )

// function sayName() {
//   console.log(this);
//   console.log(`My name is ${this.name}`);
// }

// // sayName();

// // function binding
// // 1. static binding
// // 2. dynamic binding

// // 1. static binding

// let p1 = {
//   name: "Riya",
//   sayName: sayName,
// };
// let p2 = {
//   name: "John",
//   sayName: sayName,
// };

// p1.sayName();
// p2.sayName();

// let p3 = {
//   name: "Rohan",
//   sayName: function () {
//     console.log(`My name is ${this.name}`);
//   },
// };

// 2. dynamic binding

//------------------------------------------------------------
// hsbc training
//------------------------------------------------------------
function doTraining(sub, duration) {
  console.log(`
        The trainer , ${this.name} is going to take ${sub} 
        training for ${duration} hours
    `);
}
// doTraining("JS", 2);
//------------------------------------------------------------
//  vendor
//------------------------------------------------------------

const trainer = {
  name: "Nag",
};
Object.preventExtensions(trainer);

//------------------------------------------------------------

// dynamic function binding

// way-1 : call()
// doTraining.call(trainer, "JS", 2);

// way-2 : apply()
// doTraining.apply(trainer, ["JS", 2]);

// way-3 : bind()
// let newF = doTraining.bind(trainer, "JS", 2);
// newF();
// newF();

//------------------------------------------------------------

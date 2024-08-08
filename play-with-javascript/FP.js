/*

function

- function is an object
- function is first-class-citizen

we can create function in 3 ways

1. function declaration
2. function expression
3. arrow function

*/

// 1. function declaration

// console.log(add(10, 20));

// function add(a, b) {
//   return a + b;
// }

// console.log(add(10, 20));

// 2. function expression

// console.log(add(10, 20)); // error

// let add = function (a, b) {
//   return a + b;
// };

// console.log(add(10, 20));

//--------------------------------------------
// function parameters
//--------------------------------------------

// function f1(a, b) {
//   console.log(a, b);
//   console.log([arguments[2]]);
// }

// //f1();
// f1(10);
// f1(10, 20);
// f1(10, 20, 30);
// f1(10, 20, 30, 40);

// e.g

// function sum() {
//   let result = 0;
//   for (let i = 0; i < arguments.length; i++) {
//     result += arguments[i];
//   }
//   return result;
// }

// can we overload function in javascript? no

// function getFood() {
//   return "No Food";
// }

// function getFood(pay) {
//   if (arguments.length === 0) return "No Food";
//   return "Biryani";
// }

// console.log(getFood());

//--------------------------------------------
// function with default parameters
//--------------------------------------------

function f1(a = 1, b = 2) {
  console.log(a, b);
}

f1();
f1(10);
f1(undefined, 20);
f1(10, 20);
f1(10, 20, 30);

//--------------------------------------------
// function with rest parameter
//--------------------------------------------

function f1(a, b, ...rest) {
  console.log(a, b, rest);
}

f1(10, 20);
f1(10, 20, 30);
f1(10, 20, 30, 40);

//--------------------------------------------
// function with return statement
//--------------------------------------------

function f1() {
  //   return undefined;
}

// console.log(f1());

//--------------------------------------------
// function principles
//--------------------------------------------

// 1. function can be assigned to a variable
// 2. function can be passed as an argument
// 3. function can be returned from another function

// 1. function can be assigned to a variable
// function greet() {
//   console.log("Hello");
// }

// let sayHello = greet;
// sayHello();

// 2. function can be passed as an argument

function greet(f) {
  console.log("🌸🌸🌸🌸🌸🌸🌸🌸🌸");
  if (!f) console.log("Hello");
  if (f) f();
  console.log("🌸🌸🌸🌸🌸🌸🌸🌸🌸");
}

// greet();

// time based greeting

function timeBasedGreeting() {
  let hours = new Date().getHours();
  if (hours < 12) console.log("Good Morning");
  else if (hours < 18) console.log("Good Afternoon");
  else console.log("Good Evening");
}

// timeBasedGreeting();
// greet(timeBasedGreeting);

// 3. function can be returned from another function

function teach() {
  console.log("teaching...");
  function learn() {
    console.log("learning...");
  }
  console.log("teaching...ends");
  return learn;
}

// const learnFn = teach();
// learnFn();
// learnFn();

// e.g

let numbers = [1, 3, 5, 7, 9, 2, 4, 6, 8, 10];

numbers.sort((a, b) => a - b);
// console.log(numbers);

//--------------------------------------------
// function with closure
//--------------------------------------------

// function teach(sub) {
//   console.log(`teaching ${sub}`);
//   let notes = `${sub}-notes`;
//   let fun = "bla bla";

//   function learn() {
//     console.log("learning with " + notes);
//   }
//   //   learn();
//   console.log("teaching ends");
//   return learn;
// }

// let learnFn = teach("javascript");
// learnFn();

//--------------------------------------------
// closure example
//--------------------------------------------

// self-executable function
// IIFE - Immediately Invoked Function Expression
// Module Pattern

// const counter = (function init() {
// private
let count = 0;
// public
function increment() {
  count++;
}
// public
function get() {
  return count;
}

//   return {
//     increment: increment,
//     get: get,
//   };

// export { increment, get };

// })();

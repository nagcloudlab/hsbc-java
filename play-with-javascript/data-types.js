"use strict";

// data types

// 1. primitive data types
// 2. reference data types

// 1. primitive data types

// string

var myName = "John Doe";
var company = "Google";
var dynamicString = `Hello, ${myName}! Welcome to ${company}`;
var multiLineString = `
    Hello, ${myName}!
    Welcome to ${company}
`;

// number

var age = 25;
var pi = 3.1416;

// boolean

var isTrue = true;
var isFalse = false;

// imp-note:
// falsy values in javascript
// 0, "", null, undefined, NaN, false

// undefined

var myVar;

// null

// var person1 = null;

//----------------------------------------------------------------

// 2. reference data types

// constructor function

// function Person(name, age) {
//   this.name = name;
//   this.age = age;
// }

// Person.prototype.sayName = function () {
//   console.log(this.name);
// };

// Person.prototype.sayAge = function () {
//   console.log(this.age);
// };

// in 2015, ES6 introduced class syntax

class Person {
  constructor(name, age) {
    this.name = name;
    this.age = age;
  }
  sayName() {
    console.log(`my name is ${this.name}`);
  }
  sayAge() {
    console.log(`my age is ${this.age}`);
  }
}

var person2 = new Person("John Doe", 25);
var person3 = new Person("Jane Doe", 30);

// by default, js objects are extensible, configurable, writable

// Object.preventExtensions(person2);
// Object.seal(person2);
// Object.freeze(person2);

// person2.address = "USA";
// delete person2.age;
// person2.name = "John Smith";

//----------------------------------------------------------------
// literal objects
//----------------------------------------------------------------

// Object

var employee = new Object();
employee.name = "John Doe";
employee.age = 25;
employee.sayName = function () {
  console.log(this.name);
};

// or

var employee = {
  name: "John Doe",
  age: 25,
  sayName: function () {
    console.log(this.name);
  },
};

// Array

var fruits = new Array("apple", "banana", "mango");

// or

var fruits = ["apple", "banana", "mango"];

// Set

let mySet = new Set();
mySet.add(1);
mySet.add(2);
mySet.add(3);
mySet.add(1);

// Map

let myMap = new Map();
myMap.set("name", "John Doe");
myMap.set("age", 25);

// RegExp

// aadhar card number - 12 digits ( 4-4-4 )
var aadharInput = "1234-5678-9012";

var aadharPattern = new RegExp("\\d{4}-\\d{4}-\\d{4}");

// or

var aadharPattern = /\d{4}-\d{4}-\d{4}/;

// Function

var add = new Function("a", "b", "return a + b");

// or

function add(a, b) {
  return a + b;
}

//

// how to access Object's properties

let p = {
  name: "John Doe",
  age: 25,
  "home address": "USA",
};

// dot notation

console.log(p.name);

// bracket notation

console.log(p["name"]);
console.log(p["home address"]);

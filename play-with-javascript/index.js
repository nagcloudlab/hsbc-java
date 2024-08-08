//--------------------------------------------
// enhanced object literals
//--------------------------------------------

// let myName = "John";
// let myAge = 30;

// before

// let obj1 = {
//   myName: myName,
//   myAge: myAge,
//   sayName: function () {
//     console.log(this.myName);
//   },
// };

// after

// let obj2 = {
//   myName,
//   myAge,
//   sayName() {},
//   [1 + 2]: "value",
// };

// let addressType = "home"; // home | office | vacation
// let person = {
//   name: "Nag",
//   [addressType + "-address"]: "chennai",
// };

//--------------------------------------------
// destructuring
//--------------------------------------------

// let person = {
//   name: "Nag",
//   age: 33,
// };

// let myName = person.name;
// let myAge = person.age;

// or

// let { name: myName, age: myAge } = person;

// let { name: name, age: age } = person;
// or
// let { name, age } = person;

// let { name, age, address = "chennai" } = person;

// let numbers = [1, 2, 3, 4, 5, [6, 7], 8, 9, 10];

// let n1 = numbers[0];
// let n2 = numbers[1];

// let [n1, n2, , forth, , [i, j]] = numbers;

//--------------------------------------------
// spread operator
//--------------------------------------------

let arr1 = [1, 2, 3, 4];
let arr2 = [7, 8, 9, 10];

let arr3 = [...arr1, 5, 6, ...arr2];

let person = {
  name: "Nag",
};

let newPerson = {
  ...person,
};

function sum(a, b, c) {
  return a + b + c;
}

let numbers = [1, 2, 3];
// let result = sum(numbers[0], numbers[1], numbers[2]);
// or
let result = sum(...numbers);

//--------------------------------------------
// iterators + for..of
//--------------------------------------------

// array , string , map , set , arguments , dom-collection , custom-iterables

let menu = ["biryani", "meals", "tandoori", "roti"];
// for (let item of menu) {
//   console.log(item);
// }

// custom iterable

let myBox = {
  items: [12, 13, 14, 15, 16],
  [Symbol.iterator]: function () {
    return {
      next: () => {
        return {
          done: this.items.length === 0,
          value: this.items.pop(),
        };
      },
    };
  },
};

// for (let item of myBox) {
//   console.log(item);
// }

//--------------------------------------------
// unicode;
//--------------------------------------------

var smile = "😊";
// console.log(smile.length);

//--------------------------------------------
// Async Progrmming
//--------------------------------------------

// 2 ways

// 1. promise API ( es6 )
// 2. RxJS ( reactive programming )

//--------------------------------------------
// promise API
// --------------------------------------------

//--------------------------------------------
// trainer
//--------------------------------------------

const trainer = {
  getSubject() {
    const promise = new Promise((resolve, reject) => {
      setTimeout(() => {
        const subject = "JS";
        console.log("trainer : resolving promise..");
        resolve(subject);
      }, 5000);
    });
    return promise;
  },
};

//--------------------------------------------
// employee
//--------------------------------------------

const employee = {
  doLearn() {
    console.log("employee : start learning");
    console.log("employee : requesting subject..");
    const promise = trainer.getSubject();
    console.log("employee : received promise..");
    console.log("employee : defer actions to future");
    promise
      .then((subject) => {
        console.log("employee : learning subject " + subject);
      })
      .catch((error) => {
        console.log("employee : learning failed with error " + error);
      });
  },
  doWork() {
    this.doLearn();
    console.log("employee : continue other work");
  },
};

employee.doWork();

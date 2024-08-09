var myFunctions = [];

for (var i = 0; i < 200; i++) {
  var f = function () {
    console.log(i);
  };
  myFunctions.push(f);
}

myFunctions[0]();
myFunctions[100]();

//--------------------------------------------

function getCoffee() {
  return {
    type: "capi",
  };
}

const coffee = getCoffee();
console.log(coffee.type);

//--------------------------------------------------
// using DOM Api + XHR (XMLHttpRequest) / Fetch Api
//-------------------------------------------------

const top5TodosBtn = document.querySelector("#top5-todos-btn");
const todosTableBody = document.querySelector("#todos");

top5TodosBtn.addEventListener("click", (e) => {
  //loadTodosV1();
  // loadTodosV2();
  loadTodosV3();
});

// Using XHR Api
function loadTodosV1() {
  const url = "https://jsonplaceholder.typicode.com/todos?_limit=5";
  const xhr = new XMLHttpRequest();
  xhr.open("GET", url, true); // Async
  xhr.send();

  // xhr readystate
  // 0: request not initialized
  // 1: server connection established
  // 2: request received
  // 3: processing request
  // 4: request finished and response is ready

  xhr.onreadystatechange = function () {
    if (xhr.readyState === 4 && xhr.status === 200) {
      const jsonText = xhr.responseText;
      const todos = JSON.parse(jsonText);
      const todoRows = todos.map((todo) => {
        return `
      <tr>
        <td>${todo.id}</td>
        <td>${todo.title}</td>
        <td>${todo.completed}</td>
      </tr> 
    `;
      });
      todosTableBody.innerHTML = todoRows.join("");
    }
  };
}

// Using Fetch Api
function loadTodosV2() {
  const url = "https://jsonplaceholder.typicode.com/todos?_limit=5";
  fetch(url)
    .then((response) => response.json())
    .then((todos) => {
      const todoRows = todos.map((todo) => {
        return `
      <tr>
        <td>${todo.id}</td>
        <td>${todo.title}</td>
        <td>${todo.completed}</td>
      </tr> 
    `;
      });
      todosTableBody.innerHTML = todoRows.join("");
    });
}

// Using Fetch Api + Async/Await
async function loadTodosV3() {
  const url = "https://jsonplaceholder.typicode.com/todos?_limit=5";
  const response = await fetch(url);
  const todos = await response.json();
  const todoRows = todos.map((todo) => {
    return `
      <tr>
        <td>${todo.id}</td>
        <td>${todo.title}</td>
        <td>${todo.completed}</td>
      </tr> 
    `;
  });
  todosTableBody.innerHTML = todoRows.join("");
}

//--------------------------
// using DOM Api
//--------------------------

const card = document.querySelector(".card");
const cardBody = document.querySelector(".card-body");

const messageBtn = document.querySelector(".btn-primary");
const hidetBtn = document.querySelector(".btn-danger");
const showBtn = document.querySelector(".btn-success");

messageBtn.addEventListener("click", (e) => {
  cardBody.innerHTML = "Hello World!";
});

hidetBtn.addEventListener("click", (e) => {
  card.style.display = "none";
});

showBtn.addEventListener("click", (e) => {
  card.style.display = "block";
});

//-----------------------------------------------
// using DOM Api + Timer Api
//-----------------------------------------------

const images = [
  "./images/1.png",
  "./images/2.webp",
  "./images/3.jpg",
  "./images/4.webp",
  "./images/5.jpeg",
];

const poImgEle = document.querySelector("#po-img");
const startBtn = document.querySelector("#start-btn");
const stopBtn = document.querySelector("#stop-btn");

stopBtn.disabled = true;
let intervalId = null;
startBtn.addEventListener("click", (e) => {
  startBtn.disabled = true;
  stopBtn.disabled = false;
  intervalId = setInterval(() => {
    console.log("tick");
    const randomIndex = Math.floor(Math.random() * images.length);
    poImgEle.src = images[randomIndex];
  }, 1000);
});

stopBtn.addEventListener("click", (e) => {
  clearInterval(intervalId);
  startBtn.disabled = false;
  stopBtn.disabled = true;
  poImgEle.src = "./images/1.png";
});

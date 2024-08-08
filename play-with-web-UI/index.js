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

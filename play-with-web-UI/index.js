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

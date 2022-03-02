function getRandomIntInclusive(min, max) {
  min = Math.ceil(min);
  max = Math.floor(max);
  return Math.floor(Math.random() * (max - min + 1)) + min;
}
async function test() {
  let array = [getRandomIntInclusive(1, 59)];

  let boucle = 0;
  while (boucle == 0) {
    console.log(array);

    await start(getRandomIntInclusive(1, 59), array);
    newarray = [...new Set(array)];
    console.log(newarray);
    if (newarray.length >= 6) {
      boucle = 1;
      console.log("AR");
    }
  }

  console.log(newarray);
  for (i = 0; i <= newarray.length; i++) {
    let li = document.createElement("li");
    li.textContent = "Products";
    menu.appendChild(li);

    li = document.createElement("li");
    li.textContent = "About Us";

    // select the ul menu element
    const menu = document.querySelector("#menu");
    menu.appendChild(li);
  }
}

async function start(chiffre, array) {
  await array.push(chiffre);
}

window.addEventListener("load", (event) => {
  console.log("The page has fully loaded");
});

function fetchData() {
  fetch("https://dummyjson.com/products")
    .then((data) => data.json())
    .then((data) => console.log(data));
}

fetchData();

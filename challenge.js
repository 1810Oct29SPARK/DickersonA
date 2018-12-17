let apiURL = 'https://api.chucknorris.io/jokes/categories';
let joke = {};
var list1 = document.getElementById("list")
let p1 = document.createElement("p");




window.onload = function getList() {
        fetch(apiURL).then((response) => {return response.json();
        }).then ((data)=> {
            joke = data;
            console.log(data);
            console.log(joke.length)
            getJoke(joke);
          })
        }  
function getJoke(joke) {
    console.log(joke);
    for (i = 0; i<joke.length; i++){
      document.getElementById("list").append("<p>" +joke+"</p>");
    }
}

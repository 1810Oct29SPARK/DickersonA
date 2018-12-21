window.onload= function getJoke(joke) {
    console.log(joke);
    for (i = 0; i<joke.length; i++){
      document.getElementById("list").append("<p>" +joke+"</p>");
    }
}
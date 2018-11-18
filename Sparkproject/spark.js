/*let audioElement = document.getElementById("bt").addEventListener("click",function(){
    Audio.play();
}*/

/*let state;

const ignUrl="https://newsapi.org/v2/top-headlines?sources=ign&apiKey=e5f62a58ad3247f7b908b4e71578b8df";

function fetchIGN() {
    var url = 'https://newsapi.org/v2/top-headlines?' +
    'country=us&' +
    'apiKey=e5f62a58ad3247f7b908b4e71578b8df';
var req = new Request(url);
fetch(req)
.then(function(response) {
  console.log(response.json())
  let newsign = JSON.parse(response);
  document.getElementById('IGN').innerHTML = newsign; 
})}
    /*fetch(ignUrl, {method: "GET", headers: {"Accept":"application/json"}})
    .then(res => res.text())
    .then((data) => {
        console.log(data);
      document.getElementById('IGN').innerHTML = data;   
    }
    //return fetch('https://newsapi.org/v2/top-headlines?sources=ign&apiKey=e5f62a58ad3247f7b908b4e71578b8df')
)};*/

/*const getIGN = async post => {
    let options = {
        method: 'POST',
        body: JSON.stringify(post),
        headers: new Headers({
            'Content-Type': 'application/json'
        })
    }
    const res = await fetch("https://newsapi.org/v2/top-headlines?sources=ign&apiKey=e5f62a58ad3247f7b908b4e71578b8df", options);
    const res_1 = await res.json();
    return console.log(res_1);
}*/

let gamenews = {};
let bombstuff= {};
//we want to send a get request to this endpoint to get game stuff
let gameAPIUrl = 'https://newsapi.org/v2/top-headlines?sources=ign&apiKey=e5f62a58ad3247f7b908b4e71578b8df'
let Gstop = 'http://www.gamespot.com/api/articles/?api_key=76f2b60f8c57f17f2eaff683d9a611e35b0449b9'

function getGameNews () {
    fetch(gameAPIUrl).then((response) => {return response.json();
    }).then ((data)=> {
        gamenews = data;
        console.log(gamenews.articles);
        openNews(gamenews);
      })  // updateGame();

}

function getGStop () {
    fetch(Gstop).then((response) => {return response.json();
    }).then ((data)=> {
        bombstuff= data;
        console.log(bombstuff);
      })  // updateGame();

}




/*function displayGameNews (){
    let newFrame = document.createElement("frame");
    newFrame.innerHTML = gamenews.articles;
    document.getElementsByClassName('   displaynews').appendChild(newFrame);

}*/     

function openNews (gamenews){
    console.log(gamenews);

    for (i = 0; i<gamenews.articles.length; i++){
        console.log(gamenews.articles[i]);
        console.log(gamenews.articles[i].descriptions);
        $("#displaynews").append("<p>"+ gamenews.articles[i].title+ "</p>");
        $("#displaynews").append("<p>"+ gamenews.articles[i].description+ "</p>");
        $("#displaynews").append("<a>"+ gamenews.articles[i].url+ "</p>");
        }
}

function mySong () {
    let song = document.getElementById("button").addEventListener("click",function() 
    {
     Audio.play();
    })
}
window.onload=function(){
    getGameNews();
var canvas = document.getElementById("myCanvas");
var ctx = canvas.getContext("2d");
ctx.beginPath();
ctx.rect(20, 40, 50, 50);
ctx.fillStyle = "#FF0000";      //Makes the box that     will hold the game giving it the dimensions we established
ctx.fill();                 
ctx.closePath();
}
ctx.beginPath();
ctx.arc(240, 160, 20, 0, Math.PI*2, false);
ctx.fillStyle = "green";
ctx.fill();
ctx.closePath();

ctx.beginPath();
ctx.rect(160, 10, 100, 40);
ctx.strokeStyle = "rgba(0, 0, 255, 0.5)";
ctx.stroke();
ctx.closePath();
     
/*
/*
function updateGame()
{
    let newPara = document.createElement("p")
    newPara.innerText = "some game thing" + gamenews.article.author;)
    // add new p element as a child of another element
    document.getElementById ('IGN').appendChild(newPara)
}*/


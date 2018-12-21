window.onload=function(){
let div1= document.getElementById("div1");
let p1 = document.createElement("p");
let node = document.createTextNode("This is new");
p1.appendChild(node);
div1.appendChild(p1);
}

let bearJSON = '{"bears":[{"id":4,"name":"Aretha","cave":{"id":56,"name":"Valhalla"}},' +
'{"id":7,"name":"Gandalf","cave":{"id":34,"name":"Isengard"}}]}';
let bearObj = JSON.parse(bearJSON);

function showBears() {
    var bearDiv = document.getElementById("div");
    let bears = bearObj.bears;
    for (let i = 0; i<bears.length; i++){
        let b = bears[i];
        console.log(b); 
    }
}
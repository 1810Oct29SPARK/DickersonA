let cards = {id: ' ', name: ' ', nationalPokedexNumber: ' ',imageUrl: ' ', imageUrlHiRes: "" };

const apiUrl= 'https://api.pokemontcg.io/v1/cards' ; 

let googleFetch = function() 
{
    fetch(apiUrl, {method: "GET", header: {"Accept":"application/json"}})
    .then((response) => {
        return response.json();
    })
    .then((data) => {
        console.log(data);
        let myRes=JSON.parse(name, "");
        cards.name=myRes;
        console.log(cards);
    
        data.length;


    })}

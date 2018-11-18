function factorial (num){
    let finalNum = num;
if (num === 0 || num === 1)

    return num;

while (num>1){
    num--;
    finalNum= finalNum*num;
    }
    return finalNum;
} 

factorial(1);

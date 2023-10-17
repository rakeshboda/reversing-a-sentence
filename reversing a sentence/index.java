let s=prompt().split(" ");
let reversedsectence="";

for (let i of s){
    let reversedword="";
    let len=i.length
    for (let j in i){
        reversedword+=i[len-(parseInt(j)+1)]       
    }
    reversedsectence+=reversedword+" "
}

console.log(reversedsectence)
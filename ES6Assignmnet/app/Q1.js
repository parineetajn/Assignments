let arr=[3,62,234,7,23,74,23,76,92];
let getFilteredNumber=()=>{
    console.log('Q1. Given this array: `[3,62,234,7,23,74,23,76,92]`, Using arrow function, create an array of the numbers greater than `70`');
    let newArr= arr.filter((n)=> n>70);
    console.log(newArr);
}

export{getFilteredNumber};
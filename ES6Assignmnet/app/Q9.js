let numbers=[5,7,4,3,5,7,9];
const getUniqueNumbers=()=>{
    console.log('Q9. Import a module for filtering unique elements in an array');
    let numSet = new Set(numbers);
    console.log(numSet);
}

export{getUniqueNumbers};
const arr = Array.from(document.querySelectorAll('[data-time]'));

let addIntoArray=()=>{
    console.log('Q2.');
    console.log('a. Select all the list items on the page and convert to array');
    for(let element of arr)
    {
    console.log(element);
    }
}

let flexItems;
let findFlexItems=()=>{
    console.log('b. Filter for only the elements that contain the word flexbox');
    flexItems= arr.filter( (item) => item.innerText.includes('Flexbox'));
    for(let element of flexItems)
    {
    console.log(element);
    }
    
}
let timeString;

let mapOfTimeStrings=()=>{
    console.log('c. Map down to a list of time strings');
     timeString= flexItems.map(item=>item.dataset.time);
    console.log(timeString);
    
}
let total=0;
let secondsArray;

let arrayOfSec=()=>{
    console.log('d. Map to an array of seconds');
    secondsArray= timeString.map(time=>{
    const seconds= time.split(':').map(e=> parseInt(e));
    return (seconds[0]*60 + seconds[1]);
    
    });
    console.log(secondsArray);
}

let getTotal=()=>{
    console.log('e. Reduce to get total ');
    for( let element of secondsArray)
    {
    total +=element;
    }
    console.log(total);
}


export{addIntoArray,getTotal,arrayOfSec,findFlexItems,mapOfTimeStrings};

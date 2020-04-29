
const addValueToSet=()=>{
    let set=new Set();

    set.add(1);
    set.add("hello");
    set.add({key:"value"});
    set.add(10);
    console.log(set);
    console.log('Set a has 10? (true/false): ',set.has(10));
}


const addValueToMap=()=>{
    let num=[[1,'one'],[2,'two'],[3,'three']];
    let map=new Map(num);

    for(let [key,value] of map.entries()){
        console.log(`Key: ${key} has a Value: ${value}`);

    }
}

export{addValueToSet,addValueToMap};



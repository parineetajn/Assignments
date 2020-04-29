class Node{
    constructor(data, next=null)
    {
        this.data=data,
        this.next=next;
    }
}

class LinkedList{
    constructor()
    {
        this.head=null;
    }
}

let count=0;

LinkedList.prototype.addFirst = function(data)
{
    let newNode= new Node(data);
    newNode.next=this.head;
    this.head=newNode;
    count++;
    return this.head;
}
LinkedList.prototype.addLast=function(data)
{
    let newNode=new Node(data);

    if(!this.head)
    {
        this.head=newNode;
        count++;
        return this.head;
    }

    else{
        let last= this.head;
        while(last.next!==null)
        {
            last=last.next;
        }

        last.next=newNode;
        count++;
        return this.head;
    }
}

LinkedList.prototype.length= function()
{
   return count;
}

LinkedList.prototype.getFirst= function()
{
    return this.head.data;
}

LinkedList.prototype.getLast= function()
{
    let last= this.head;
        while(last.next!==null)
        {
            last=last.next;
        }

        return last.data;
}

LinkedList.prototype.print = function()
{
    let last = this.head;
    while(last.next!=null)
    {
        console.log(last.data);
        last=last.next;

    }

    console.log(last.data);
}

export {  LinkedList};
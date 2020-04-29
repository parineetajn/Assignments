    //Q1. Given this array: `[3,62,234,7,23,74,23,76,92]`, Using arrow function, create an array of the numbers greater than `70`.
    import{getFilteredNumber} from './Q1';
    getFilteredNumber();

    
    //Q2.
    import{addIntoArray,getTotal,arrayOfSec,findFlexItems,mapOfTimeStrings} from './Q2';

    //a. Select all the list items on the page and convert to array.
    addIntoArray();

    //b. Filter for only the elements that contain the word 'flexbox'
    findFlexItems();

    //c. Map down to a list of time strings
    mapOfTimeStrings();

    //d. Map to an array of seconds
    arrayOfSec();

    //e. Reduce to get total using .filter and .map
    getTotal();

    /*Q3. Create a markup template using string literal
    const song = {
    name: 'Dying to live',
    artist: 'Tupac',
    featuring: 'Biggie Smalls'
    };
    */
    import{fun}from './Q3';
    fun();

    //Q4. Extract all keys inside address object from user object using destructuring ?
    import{getAddress} from './Q4';
    getAddress();
   
    //Q5 . Find the possible combinations of a string and store them in a MAP? 
    import{getAllCombinations} from './Q5';
    console.log('Q5. Find the possible combinations of a string and store them in a MAP');
    console.log(getAllCombinations("ABC"));

    //Q6. Write a program to implement inheritance upto 3 classes.The Class must have public variables and static functions.
    console.log('Q6. Write a program to implement inheritance upto 3 classes.The Class must have public variables and static function');
    import Vehicle from './Q6';

    //Q7. Write a program to implement a class having static functions
    import Greeting from './Q7';
    console.log('Q7. Write a program to implement a class having static functions');
    Greeting.hello();
    Greeting.welcome();

    //Q8 . Import a module containing the constants and method for calculating area of circle, rectangle, cylinder.
    import{areaOfCircle,areaOfRectangle,areaOfCylinder} from './Q8';
    console.log('Q8 . Import a module containing the constants and method for calculating area of circle, rectangle, cylinder');
    console.log('Area of Circle: '+areaOfCircle(5));
    console.log('Area of Rectangle: '+areaOfRectangle(20,30));
    console.log('Area of Cylinder: '+areaOfCylinder(5,10));

    //Q9. Import a module for filtering unique elements in an array.
    import{getUniqueNumbers} from './Q9';
    getUniqueNumbers();

    //Q10. Write a program to flatten a nested array to single level using arrow functions.
    import{flattenArray} from './Q10';
    flattenArray();

    //Q11. Implement a singly linked list in es6 and implement addFirst() addLast(), length(), getFirst(), getLast(). (without using array)
    console.log('Q11. Implement a singly linked list in es6 and implement addFirst() addLast(), length(), getFirst(), getLast(). (without using array');
    import{LinkedList} from './Q11'
    let ll= new LinkedList();
    ll.addFirst(67);
    ll.addFirst(90);
    ll.addLast(89);
    console.log(ll);
    console.log("Length of Linked List",ll.length());
    console.log("First element:",ll.getFirst());
    console.log("Last Element:",ll.getLast());
    console.log("Elements in Linked List:");
    ll.print();

    //Q12. Implement Map and Set using Es6
    import{addValueToSet,addValueToMap} from './Q12';
    console.log('Q12. Implement Map and Set using Es6');
    addValueToSet();
    addValueToMap();

    //Q13. Implementation of stack (using linked list)
    console.log('Q13. Implementation of stack (using linked list)');
    import{stackLL} from './Q13';
    let stack = new stackLL();
    stack.push(56);
    stack.push(78);
    stack.pop();
    stack.push(80);

    console.log("Elememts in stack are: ",stack.toArray());
    console.log("Is stack empty? (true/false) ? ",stack.isEmpty());
    console.log("size of stack is  " + stack.size());
    console.log("Peek Element:",stack.peek());
    

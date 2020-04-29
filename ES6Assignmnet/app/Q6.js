class Vehicle{
    constructor(companyName){
        this.companyName=companyName;
    }

static getDetails(){
    console.log(`Company Name: ${this.companyName}`);
    }

}

class TwoVehicle extends Vehicle{
    constructor(companyName,tyres){
        super(companyName);
        this.tyres=tyres;
    }
    static getDetails(){
        console.log(`Company Name: ${this.companyName}, No Of Tyres: ${this.tyres}`);
    }

}
class FourVehicle extends Vehicle{
    constructor(companyName,tyres){
        super(companyName);
        this.tyres=tyres;
    }
    static getDetails(){
        console.log(`Company Name: ${this.companyName}, No Of Tyres: ${this.tyres}`);
    }
}

class Bike extends TwoVehicle{
    constructor(companyName,tyres,mileage){
        super(companyName,tyres);
        this.mileage=mileage; 
    }
    static getDetails(){
        console.log(`Company Name: ${this.companyName}, No Of Tyres: ${this.tyres}, Mileage: ${this.mileage}`);
    }

}

class Car extends FourVehicle{
    constructor(companyName,tyres,mileage){
        super(companyName,tyres);
        this.mileage=mileage; 
    }
static getDetails(){
    console.log(`Company Name: ${this.companyName}, No Of Tyres: ${this.tyres}, Mileage: ${this.mileage}`);
    }
}

let bikeVehicle = new Bike("Yamaha","2","180cc");
console.log(bikeVehicle);

let carVehicle = new Car("Toyota","4","250cc");
console.log(carVehicle);

export default Vehicle;

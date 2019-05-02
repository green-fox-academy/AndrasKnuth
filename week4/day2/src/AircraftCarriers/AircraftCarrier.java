package AircraftCarriers;

public class AircraftCarrier {

}
/*
Create a class that represents an aircraft-carrier

The carrier should be able to store aircrafts
Each carrier should have a store of ammo represented as number
The inital ammo should be given by a parameter in its constructor
The carrier also has a health point given in its constructor as well
Methods:
add
It should take a new aircraft and add it to its storage
fill
It should fill all the aircraft with ammo and substract the needed ammo from the ammo storage
If there is not enough ammo then it should start to fill the aircrafts with priority first
If there is no ammo when this method is called, it should throw an exception
fight
It should take another carrier as a refrence parameter and fire all the ammo from the aircrafts to it, then substract all the damage from its health points
getStatus
It should return a string about itself and all of its aircrafts' statuses in the following format:

HP: 5000, Aircraft count: 5, Ammo Storage: 2300, Total damage: 2280
Aircrafts:
Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
Type F16, Ammo: 8, Base Damage: 30, All Damage: 240
Type F16, Ammo: 8, Base Damage: 30, All Damage: 240
If the health points are 0 then it should return: It's dead Jim :(
 */
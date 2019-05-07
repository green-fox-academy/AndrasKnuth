package AircraftCarriers;

import java.util.ArrayList;
import java.util.List;

public class AircraftCarrier {
  private int ammoStorage;
  private int hp;
  List<Aircraft> aircrafts = new ArrayList<>();

  public AircraftCarrier(int hp, int ammoStorage) {

  }

  public void addAirplane() {
    aircrafts.add(new Aircraft("F16"));
  }

  public void fill() {
    if (ammoStorage > 0) {
      if (getAmmoNeed() >= ammoStorage) {
        for (int index : getRefillandableAircrafts()) {
          ammoStorage = aircrafts.get(index).refill(ammoStorage);
        }
      } else {
        for (int index : getRefillandableAircrafts()) {
          if (aircrafts.get(index).isPriority()) {
            ammoStorage = aircrafts.get(index).refill(ammoStorage);
          }
        }
      }
    } else {
      throw new java.lang.RuntimeException("The carrier is out of ammo!");
    }
  }

  public int getHp() {
    return hp;
  }

  public List<Integer> getRefillandableAircrafts() {
    List<Integer> mustRefill = new ArrayList<>();
    for (int i = 0; i < aircrafts.size(); i++) {
      if (aircrafts.get(i).getAmmo() == 0) {
        mustRefill.add(i);
      }
    }
    return mustRefill;
  }

  public int getAmmoNeed() {
    int need = 0;
    for (int index : getRefillandableAircrafts()) {
      need += aircrafts.get(index).getMaxAmmo();
    }
    return need;
  }

  public int getAmmoStorage() {
    return ammoStorage;
  }

  public int getTotalDamage() {
    int totalDamage = 0;
    for (Aircraft aircraft : aircrafts) {
      aircraft.fight();
      totalDamage += aircraft.getMaxAmmo() * aircraft.getBaseDmg();
    }
    return totalDamage;
  }

  public String getStatus(){
    String returnString = "";
    if(getHp() > 0){
      String row1 = "HP: " + getHp() + ", Aircraft count: " + aircrafts.size() + ", Ammo Storage: " + getAmmoStorage() +
          ", Total Damage: " + getTotalDamage() + "\n";
    String row2 = "Aircrafts:\n";
    String row3 = "";
    for (Aircraft aircraft : aircrafts) {
      row3 += aircraft.getStatus() + "\n";
    }
    returnString = row1 + row2 + row3;
  } else {
    returnString = "It's dead Jim :(";
  }
    return returnString;
}
  }

/*
fill
It should fill all the aircraft with ammo and substract the needed ammo from the ammo storage
If there is not enough ammo then it should start to fill the aircrafts with priority first
If there is no ammo when this method is called, it should throw an exception
fight
It should take another carrier as a refrence parameter and fire all the ammo from the aircrafts to it, then substract
all the damage from its health points
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
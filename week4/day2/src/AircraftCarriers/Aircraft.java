package AircraftCarriers;

public class Aircraft {
  private String type;
  private int maxAmmo;
  private int baseDmg;
  private int ammo;

  public Aircraft() {
  }

  public Aircraft(String type, int maxAmmo, int baseDmg) {
    this.type = type;
    this.maxAmmo = maxAmmo;
    this.baseDmg = baseDmg;
  }

  /*
  getStatus
  It should return a string like: Type F35, Ammo: 10, Base Damage: 50, All Damage: 500
  isPriority
  It should return if the aircraft is priority in the ammo fill queue. It's true for F35 and false for F16

   */
  public String getStatus() {
    String status;
    status = getType() + ", Ammo: " + getAmmo() + ", Base Damage: " + getBaseDmg() +
        ", All Damage:" + getBaseDmg() * getAmmo();
    return status;
  }

  public boolean isPriority() {
    if (getType().equals("F35")) {
      return true;
    }
    return false;
  }
  //fight
  //    It should use all the ammo (set it to 0) and it should return the damage it deals
  //    The damage dealt is calculated by multiplying the base damage by the ammunition

  public int fight() {
    int damage = getAmmo() * getBaseDmg();
    setAmmo(0);
    return damage;
  }
  /*refill
  It should take a number as parameter and substract as much ammo as possible
  It can't have more ammo than the number or the max ammo (can't get more ammo than what's coming from the parameter
  or the max ammo of the aircraft)
  It should return the remaining ammo
  Eg. Filling an empty F35 with 300 would completely fill the storage of the aircraft and would return the remaining 288
  */

  public int refill(int plusAmmo) {
    int newAmmo = ammo + plusAmmo;
    if (newAmmo > maxAmmo) {
      newAmmo = maxAmmo;
    }
    ammo = newAmmo;
    return plusAmmo - ammo;
  }

  //getters:


  public int getAmmo() {
    return ammo;
  }

  public int getBaseDmg() {
    return baseDmg;
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public String getType() {
    return type;
  }

  //setters


  public void setAmmo(int ammo) {
    this.ammo = ammo;
  }

  public void setBaseDmg(int baseDmg) {
    this.baseDmg = baseDmg;
  }

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public void setType(String type) {
    this.type = type;
  }
}
/*
    Create a class that represents an aircraft
    There are 2 types of aircrafts: F16 and F35
    Both aircrafts should keep track of their ammunition
    F16
    Max ammo: 8
    Base damage: 30
    F35
    Max ammo: 12
    Base damage: 50
    All aircrafts should be created with an empty ammo storage

    Methods:

    refill
    It should take a number as parameter and substract as much ammo as possible
    It can't have more ammo than the number or the max ammo (can't get more ammo than what's coming from the parameter
    or the max ammo of the aircraft)
    It should return the remaining ammo
    Eg. Filling an empty F35 with 300 would completely fill the storage of the aircraft and would return the remaining 288
    getType
    It should return the type of the aircraft as a string
    getStatus
    It should return a string like: Type F35, Ammo: 10, Base Damage: 50, All Damage: 500
    isPriority
    It should return if the aircraft is priority in the ammo fill queue. It's true for F35 and false for F16
    */

package AircraftCarriers;

public class F35 extends Aircraft{
  String type = "F35";

  public F35 (){
    super("F35", 12, 50);
  }

  public F35(int maxAmmo, int baseDmg){
    super.setMaxAmmo(maxAmmo);
    super.setBaseDmg(baseDmg);
    super.setType(type);
  }

}

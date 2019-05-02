package AircraftCarriers;

public class F16 extends Aircraft{
  String type = "F16";

  public F16 (){
    super("F16", 8, 30);
  }

  public F16(int maxAmmo, int baseDmg){
    super.setMaxAmmo(maxAmmo);
    super.setBaseDmg(baseDmg);
    super.setType(type);
  }


}


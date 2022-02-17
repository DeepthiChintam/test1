package Inhiretance;
import java.util.*;
public class Developer extends Manager
{
    String devname;
    String devdesgnation;
    String devdepartment;
  public  Developer(String devname,String devdepartment,String devdesgnation) {
      this.devname = devname;
      this.devdepartment = devdepartment;
      this.devdesgnation = devdesgnation;
  }

  {

  }
  public String getDevdepartment() {
      return devdepartment;
  }

}

package Inhiretance;
import java.util.*;
public class Manager extends President
{
    String mgrname;
List<Developer>developers;
public Manager(String mgrname,List<Developer>developers) {
    this.mgrname = mgrname;
    this.developers = developers;
}
public Manager() {
}
    public List<Developer>getDevelopers()
    {
        return developers;
    }
}

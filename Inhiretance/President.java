package Inhiretance;
import java.util.*;
public class President
{


    List<Manager> managers;

    public President(List<Manager> managers) {
        this.managers = managers;
    }

    public President() {
    }
        public int getManagersFromDepartment ()
        {
            int totalmgrs = 0;
            List<Developer> developers;
            for (Manager manage : managers) {
                developers = manage.getDevelopers();
                {
                    for (Developer develope:developers) {
                        totalmgrs++;
                    }
                }
            }
            return totalmgrs;
        }
    }


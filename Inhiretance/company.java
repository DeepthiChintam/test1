package Inhiretance;
import java.util.*;
public class company {
    public static void main(String args[]) {
        String President = "Purna veer";
        System.out.println("President of company:" + President);
        Developer d = new Developer("Sarayu", "Java", "Manager");
        Developer d1 = new Developer("Vamsi", "Mulesoft", "Manager");
        Developer d2 = new Developer("Deepthi", "Aws", "Manager");
        Developer d3 = new Developer("Smitha", "Servicenow", "Developer");
        Developer d4 = new Developer("Priti", "Azure", "Developer");
        Developer d5 = new Developer("Vijaya", "Servicenow", "Manager");
        Developer d6 = new Developer("Neha", "java", "Manager");
        Developer d7 = new Developer("Karthik", "Mulesoft", "Manager");
        Developer d8 = new Developer("Sejal", "Azure", "Developer");
        System.out.println("");
        List<Developer> Mulesoft = new ArrayList<>();
        Mulesoft.add(d1);
        Mulesoft.add(d7);
        List<Developer> Servicenow = new ArrayList<>();
        Servicenow.add(d3);
        Servicenow.add(d5);
        List<Developer> java = new ArrayList<>();
        java.add(d);
        java.add(d6);
        List<Developer> Aws = new ArrayList<>();
        Aws.add(d2);
        List<Developer> Azure = new ArrayList<>();
        Azure.add(d8);
        Azure.add(d4);
        Manager m1 = new Manager("Vamsi", Mulesoft);
        Manager m2 = new Manager("Saryu", java);
        Manager m3 = new Manager("Vijay", Servicenow);
        List<Manager> managers = new ArrayList<>();
        managers.add(m1);
        managers.add(m2);
        managers.add(m3);
        int size1 = managers.size();
        System.out.println("No of managers:" + size1);
        President p = new President(managers);
        System.out.println("Total no of Department:" + p.getManagersFromDepartment());
        System.out.println("Mulesoft Department:");
        for (Developer D : Mulesoft) {
          //  System.out.println(D.devname + " is " + D.devdesgnation + " of " + D.devdepartment);
        }
        System.out.println("Java Department:");

        for (Developer dev : java) {
            System.out.println(dev.devname + " is" + dev.devdesgnation + "of" + dev.devdepartment);
        }
        System.out.println("Servicenow Department:");
        for (Developer D1 : Servicenow) {
            System.out.println(D1.devname + " is" + D1.devdesgnation + "of" + D1.devdepartment);
        }
        for (Developer D2 : Azure) {
            System.out.println(D2.devname + " is" + D2.devdesgnation + "of" + D2.devdepartment);
            for (Developer D3 : Aws) {
                System.out.println(D3.devname + " is" + D3.devdesgnation + "of" + D3.devdepartment);

            }
            int size2 = Mulesoft.size();
            int size3 = java.size();
            int size4 = Servicenow.size();
            int size5 = Azure.size();
            int size6 = Aws.size();
            System.out.println("Total no of mulesoft Developers : " + size2);
            System.out.println("Total no of java of Developers : " + size3);
            System.out.println("Total no of Servicenow Developers: " + size4);
            System.out.println("Total no of Azure : " + size5);
            System.out.println("Total no of Aws:" + size6);


        }
    }
}
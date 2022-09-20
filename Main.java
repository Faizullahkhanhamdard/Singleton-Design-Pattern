import Beverage.Darkrost;
import Beverage.Milk;
import Coffee.Espress;
import Coffee.McCoffee;
import SingletonDesignPattern.Dashboard;
import SingletonDesignPatternExample.Login;

public class Main {

    public static void main(String[] args) {
        System.out.println("Faizullah Khan Hamdard");

    
        Espress e1 = new EspressoOne();
        Darkrost d1 = new DarkrostOne(e);

        // System.out.println("DarkRost1 Coffee is available : "+d1.cost());

        // McCoffee m1 = new McCoffee();
        // Milk milk1 = new Milk(m1);

        // System.out.println("Milk Coffee is also vailable : "+ milk.cost());

        /// Singleton Design Pattern 

        
        Login log = new Login();
        Dashboard dsh = new Dashboard();
        log.start();
        dsh.boo();


    }
}
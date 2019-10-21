/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradleProjecto;

/**
 *
 * @author Marcelo
 */
public class HelloWorld {

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
        WorldTime w = new WorldTime();
        w.getTimeByCountry("Europe/London");
    }
}

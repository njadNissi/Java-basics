/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdas;

/**
 *
 * @author njad
 */
public class LambdaExpSingleParameter {

    interface Sayable {

        public String say(String name);
    }

    public static void main(String[] args) {

        // Lambda expression with single parameter.  
        Sayable s1 = (name) -> {
            return "Hello, " + name;
        };
        System.out.println(s1.say("Sonoo"));

        // You can omit function parentheses    
        Sayable s2 = name -> {
            return "Hello, " + name;
        };
        System.out.println(s2.say("Sonoo"));
    }
}

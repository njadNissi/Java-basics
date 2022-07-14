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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author njad
 */
public class LambdaExpForEachLoop {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("element1");
        list.add("element2");
        list.add("element3");
        list.add("element4");

        list.forEach((el) -> System.out.println(el));

    }

}

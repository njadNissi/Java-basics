/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algo;

/**
 *
 * @author njad
 */
public class Pointer {

    static class Abc {

        int x;

        public Abc(int x) {
            this.x = x;
        }
        public Abc(Abc abc) {
            this.x = abc.x;
        }
        void set(int x) {
            this.x = x;
        }

        @Override
        public String toString() {
            return this.x + "";
        }
    }

    public static void main(String[] args) {
        Abc x = new Abc(30);
        Abc y = new Abc(x);
        x.set(40);
        y.set(0);
        System.out.println("x = " + x + ", y = " + y);
    }
}

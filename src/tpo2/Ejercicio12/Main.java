/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpo2.Ejercicio12;


import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Kolia
 */
public class Main {

    public static void main(String[] args) {

        List<Thread> hamsters = new ArrayList<>();
        Jaula jaulaComun = new Jaula();

        for (int i = 0; i < 4; i++) {

            hamsters.add(new Thread(new Hamster(jaulaComun), ("Hamster " + (i + 1))));

        }

        hamsters.forEach((Thread hamster) -> {
            hamster.start();
        });

    }

}

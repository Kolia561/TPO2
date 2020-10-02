/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpo2.Ejercicio8;

/**
 *
 * @author Kolia
 */
public class Carrera {

  public static void main(String[] args) {

    Testigo testigo = new Testigo();

    Thread[] Atletas = new Thread[4];

    long tiempoInicioCarrera = System.currentTimeMillis(); // tiempo en el que empieza la carrera

    for (int i = 0; i < 4; i++) {

      Atletas[i] = new Thread(new Atleta(testigo, tiempoInicioCarrera, i), "Atleta " + i);

      Atletas[i].start();
    }
  }
}

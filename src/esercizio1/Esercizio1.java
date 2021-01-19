/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio1;

/**
 *
 * @author pogliani.mattia
 */
public class Esercizio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        processo p1 = new processo('A');
        processo p2 = new processo('B');
        Thread T1 = new Thread(p1);
        Thread T2 = new Thread(p2);
        T1.start();
        T2.start();
    }

}

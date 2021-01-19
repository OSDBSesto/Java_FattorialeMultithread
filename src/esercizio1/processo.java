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
public class processo implements Runnable {

    char ch;
    boolean terminato = false;
    long risultato = 0;
    int i;

    public processo(char c) {
        ch = c;
    }

    public void run() {        
        if (ch == 'A') {
            i = 6;
        } else {
            i = 5;
        }
        risultato = i;        
        while (!terminato) {
            if (ch == 'A') {
                System.out.print("\t\t");
            }            
            System.out.println(risultato + " * " + (i - 1) + "=" + (risultato * (i - 1)));
            risultato = risultato * (i - 1);
            i--;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
            if (i == 1) {
                this.ferma();//terminazione
            }
        }//fine while
    }

    public void ferma() {
        this.terminato = true;
    }
}

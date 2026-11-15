/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lezione_antonio_marrazzo_pio_11_11_2026;

public class Main {
    public static void main(String[] args) {
        // Creazione dell'oggetto Calcolatrice usando 'var'
        var calc = new Calcolatrice();

        // Prima parte: somma tra interi (x = 3, y = 7)
        int x = 3, y = 7;
        var z = calc.somma(x, y); // z viene tipizzata come int (risultato: 10)

        // Seconda parte: somma tra int e double (a = 3.2)
        double a = 3.2;
        var b = calc.somma(x, a); // b viene tipizzata come double (risultato: 6.2)

        // Stampa a schermo i risultati
        System.out.println("Risultato int (z): " + z);
        System.out.println("Risultato double (b): " + b);
    }
}


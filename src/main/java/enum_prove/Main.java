/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enum_prove;
// 1. L'enum deve stare fuori dalla classe (o dentro la classe, ma fuori dal main)
enum StatoSemaforo {
    SPENTO {
        public boolean isAcceso() {
            return false;
        }
    },
    ROSSO,
    GIALLO,
    LAMPEGGIANTE,
    VERDE;

    public boolean isAcceso() {
        return true;
    }
}

// 2. La classe principale che contiene il main
public class Main {

    public static void main(String[] args) {

        // Dichiarazione e assegnazione iniziale
        StatoSemaforo semaforo = StatoSemaforo.SPENTO;

        // Cambio di stato
        semaforo = StatoSemaforo.LAMPEGGIANTE;

        // Controllo condizionale con IF
        if (semaforo == StatoSemaforo.ROSSO) {
            System.out.println("Semaforo Rosso");
        } else {
            System.out.println("Semaforo non Rosso");
        }

        // Controllo condizionale con SWITCH
        switch (semaforo) {
            case VERDE:
                System.out.println("Passa");
                break;
                
            case ROSSO:
                System.out.println("Alt");
                break;
                
            case GIALLO:
                System.out.println("Rallenta");
                break;
                
            default:
                System.out.println("Altro stato");
                break;
        }

        // --- SECONDO ESEMPIO ---

        // Reimpostazione a SPENTO e stampa (stampa false)
        semaforo = StatoSemaforo.SPENTO;
        System.out.println(semaforo.isAcceso());

        // Cambio a LAMPEGGIANTE e stampa (stampa true)
        semaforo = StatoSemaforo.LAMPEGGIANTE;
        System.out.println(semaforo.isAcceso());
        
        int n=100;
        Integer numero=Integer.valueOf("10");
        numero=Integer.valueOf("10");
        n=n*numero.intValue();
        System.out.println("N="+n);
    }
}











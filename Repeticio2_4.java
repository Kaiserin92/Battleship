package Tasca7;

import java.util.random.*;
import java.util.Scanner;
import java.util.Random;
import java.util.Scanner;
public class Repeticio2_4 {
    public static void main (String[] args){
        Scanner read = new Scanner(System.in);
        Random random = new Random();
        int fila = random.nextInt(1,5) , columna = random.nextInt(1,5);
        int columnaJugadorInt=0, filaJugadorInt=0;
        int intents=0;
        char filaJugador, columnaJugador;
        String coordenada;
        boolean filaOk = false, columnaOk=false;
        boolean guanya=false;
        System.out.println(columna + " "+ fila);
        //BUCLE FINS QUE JUGADOR GUANYA
        do {
        	//BUCLE PER MOSTRAR EL TAULELL DE JOC
            for(int i=0; i<5;i++) {
    			if(i==0) {
    				System.out.println("  A  B  C  D");
    			}
        		for(int j=0; j<4;j++) {
        			if(i!=0) {
            			System.out.print(" * ");
        			}
        		}
        		if(i!=0) {
        			System.out.println();
        		}
        		if(i!=4) {
            		System.out.print(i+1);
        		}
        	}
            System.out.println("Entra una coordenada de la taula:");
            //BUCLE DE VERIFICACIO DE L'ENTRADA DEL JUGADOR
            do {
            	coordenada = read.next();
            	columnaJugador = coordenada.charAt(0);
            	filaJugador = coordenada.charAt(1);
            	switch (columnaJugador) {
            		case 'A':
            			columnaOk=true;
            			columnaJugadorInt=1;
        			break;
            		case 'B':
            			columnaOk=true;
            			columnaJugadorInt=2;
        			break;
            		case 'C':
            			columnaOk=true;
            			columnaJugadorInt=3;
        			break;
            		case 'D':
            			columnaOk=true;
            			columnaJugadorInt=4;
        			break;
        			default:
        				columnaOk=false;
        				System.out.println("Valor de la columna fora de rang, torna a introduir la coordenada.");    			
            	}
            	switch (filaJugador) {
        		case '1':
        			filaOk=true;
        			filaJugadorInt=1;
    			break;
        		case '2':
        			filaOk=true;
        			filaJugadorInt=2;
    			break;
        		case '3':
        			filaOk=true;
        			filaJugadorInt=3;
    			break;
        		case '4':
        			filaOk=true;
        			filaJugadorInt=4;
    			break;
    			default:
    				filaOk=false;
            		System.out.println("Valor de la fila fora de rang, torna a introduir la coordenada.");  			
        	}
            }while(!columnaOk || !filaOk);
                //VERIFICACIO DE LA JUGADA, SI ES GUANYADORA O NO
            if(columna==columnaJugadorInt&&fila==filaJugadorInt) {
            	guanya=true;
            }else{
            	System.out.println(columnaJugador+""+filaJugador+" = AIGUA");
            }
            //NOMES SUMA INTENTS SI LES DADES ESTAN DINTRE DEL RANG ACCEPTAT, SI NO, NO.
            intents++;
        }while(!guanya); 
        System.out.println(columnaJugador+""+filaJugador+" = TOCAT I ENFONSAT. ENHORABONA HAS TROBAT EL VAIXELL EN "+intents+" INTENTS.");
        //BUCLE QUE MOSTRA EL TAULELL AMB LA POSICIO DEL VAIXELL.
        for(int i=0; i<5;i++) {
			if(i==0) {
				System.out.println("  A  B  C  D");
			}
    		for(int j=0; j<4;j++) {
    			if(i!=0) {
    				if(columna==j+1&&fila==i) {
    					System.out.print(" V ");
    				}else {
    					System.out.print(" * ");
    				}
    			}
    		}
    		if(i!=0) {
    			System.out.println();
    		}
    		if(i!=4) {
        		System.out.print(i+1);
    		}
    	}
    }
}

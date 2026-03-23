import java.util.Scanner;

public class Juego {
    public static final int files = 6;
    public static final int columnes = 7;
    public static final char buit = ' ';
    public static final char jugador1 = 'X';
    public static final char jugador2 = 'O';

    public static char tablero[][];

    public Juego(){
        tablero= new char[files][columnes];
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                tablero[i][j] = buit;
            }
        }
    }

    public void jugar(){
        Scanner sc = new Scanner(System.in);
        char jugadorActual = jugador1;
        boolean jocFinalitzat = false;

        while(!jocFinalitzat){
            Tablero.imprimirTablero();
            int columna = Columna.demanaColumna(sc, jugadorActual);
            Ficha.colocarFitxa(columna, jugadorActual);

            if(Guanyador.hiHaGuanyador(jugadorActual)){
                Tablero.imprimirTablero();
                System.out.println("Jugador " + jugadorActual + " ha guanyat!");
                jocFinalitzat = true;
            }else if(Empate.esEmpate()){
                System.out.println("És un empate");
                jocFinalitzat = true;
            }else{
                jugadorActual = (jugadorActual == jugador1) ? jugador2 : jugador1;
            }
        }
        sc.close();
    }
}
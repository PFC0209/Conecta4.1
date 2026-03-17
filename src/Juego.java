import static

public class Juego {
    public static final int files = 6;
    public static final int columnes = 7;
    public static final char buit = ' ';
    public static final char jugador1 = 'X';
    public static final char jugador2 = 'O';

    public static char tablero[][] = new char[files][columnes];

    public static void main(String[] args){
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                tablero[i][j] = buit;
            }
        }
        
        Tablero.imprimirTablero();
    }

}

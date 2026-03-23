public class Ficha {
    public static boolean colocarFitxa(int columna, char jugador){
        for (int i = Juego.files - 1; i >=0 ; i--){
            if (Juego.tablero[i][columna] == Juego.buit){
                Juego.tablero[i][columna] = jugador;
                return true;
            }
        }
        return false;
    }
}

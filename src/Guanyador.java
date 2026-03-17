public class Guanyador {
    public static boolean hiHaGuanyador(char jugador){
        //Comprovació horitzontal
        for (int i = 0; i < Juego.files; i++) {
            for (int j = 0; j <= Juego.columnes -4; j++) {
                if (Juego.tablero[i][j] == jugador && Juego.tablero[i][j+1] == jugador && Juego.tablero[i][j+2] == jugador && Juego.tablero[i][j+3] == jugador){
                    return true;
                }
            }
        }
        //Comprovació vertical
        for(int i = 0; i <= Juego.files -4; i++){
            for(int j = 0; j < Juego.columnes; j++){
                if(Juego.tablero[i][j] == jugador && Juego.tablero[i+1][j] == jugador && Juego.tablero[i+2][j] == jugador && Juego.tablero[i+3][j] == jugador){
                    return true;
                }
            }
        }
    }
}

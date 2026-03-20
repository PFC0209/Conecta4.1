public class Empate {
    public static boolean esEmpate(){
        for (int i = 0; i < Juego.columnes; i++) {
            if (Juego.tablero[0][i] == Juego.buit){
                return false;
            }
        }
        return true;
    }
}

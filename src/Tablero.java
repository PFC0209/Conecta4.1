public class Tablero {
    public static void imprimirTablero(){
        System.out.println("\n 0 1 2 3 4 5 6 ");
        for (int i = 0; i < Juego.files; i++) {
            System.out.print("|");
            for (int j = 0; j < Juego.columnes; j++) {
                System.out.print(Juego.tablero[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("-----------------");
    }
}

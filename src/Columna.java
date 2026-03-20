import java.util.Scanner;

public class Columna {
    public static int demanaColumna(Scanner scanner, char jugador){
        int columna;

        do{
            System.out.print("Jugador: " + jugador +", tria una columna (0-6): ");
            while (!scanner.hasNextInt()){
                System.out.println("Per favor escriu un numero.");
                scanner.next();
            }
            columna = scanner.nextInt();
        }while (columna < 0 || columna >= Juego.columnes || Juego.tablero[0][columna] != Juego.buit);
        return columna;
    }

}

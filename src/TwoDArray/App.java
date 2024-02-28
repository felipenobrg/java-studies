package TwoDArray;

public class App {

    public static void main(String[] args) {

        String[][] cars = new String[3][3];
        String[][] cars2 = { { "Camaro", "Fiat", "Arbo" },
                { "Tesla", "Amarok", "Celta" },
                { "Gol", "Lambo", "Toro" } };

        cars[0][0] = "Camaro";
        cars[0][1] = "Fiat";
        cars[0][2] = "Arbo";
        cars[1][0] = "Tesla";
        cars[1][1] = "Amarok";
        cars[1][2] = "Celta";
        cars[2][0] = "Gol";
        cars[2][1] = "Lambo";
        cars[2][2] = "Toro";

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.println(cars[i][j] + " ");
            }
        }

        for (int i = 0; i < cars2.length; i++) {
            System.out.println();
            for (int j = 0; j < cars2[i].length; j++) {
                System.out.println(cars2[i][j] + " ");
            }
        }

    }
}

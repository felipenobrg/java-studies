package ArrayList;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("hambuguer");
        food.add("hotdog");

        food.set(0, "sushi");
        food.remove(1);

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }

    }
}

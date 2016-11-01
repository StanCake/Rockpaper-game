import model.Model;
import model.Paper;
import model.Rock;
import model.Scissors;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        List<Model> models = new ArrayList();

        models.add(new Paper());
        models.add(new Rock());
        models.add(new Scissors());

        Model m1 = models.get(random.nextInt(3));
        Model m2 = models.get(random.nextInt(3));

        System.out.println("Игрок #1 - " + m1.name());
        System.out.println("Игрок #2 - " + m2.name());

        System.out.println("Результат для 1 игрока - " + m1.war(m2));
        System.out.println("Результат для 2 игрока - " + m2.war(m1));
    }
}

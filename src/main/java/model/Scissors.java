package model;

public class Scissors implements Model {
    public Scissors() {
    }

    public String name() {
        return "Scissors";
    }

    public String war(Model m) {
        if (m instanceof Paper) {
            return "Выигрыш!";
        } else if (m instanceof Rock) {
            return "Проигрыш!";
        } else {
            return "Ничья!";
        }
    }
}

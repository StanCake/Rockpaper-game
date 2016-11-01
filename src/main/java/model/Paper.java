package model;

public class Paper implements Model {

    public Paper() {
    }

    public String name() {
        return "Paper";
    }

    public String war(Model m) {
        if (m instanceof Paper) {
            return "Ничья!";
        } else if (m instanceof Rock) {
            return "Победа!";
        } else {
            return "Проигрыш!";
        }
    }

}

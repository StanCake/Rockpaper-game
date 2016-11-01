package model;

public class Rock implements Model {

    public Rock() {
    }

    public String name() {
        return "Rock";
    }

    public String war(Model m) {
        if (m instanceof Paper) {
            return "Проигрыш!";
        } else if (m instanceof Rock) {
            return "Ничья!";
        } else {
            return "Выигрыш!";
        }
    }
}

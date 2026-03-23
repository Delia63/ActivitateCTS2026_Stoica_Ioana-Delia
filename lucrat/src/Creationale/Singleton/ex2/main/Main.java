package Creationale.Singleton.ex2.main;

import Creationale.Singleton.ex2.clase.Logger;

public class Main {
    static void main(String[] args) {
        Logger logger = Logger.getInstance(1);
        System.out.println(logger.getIdNotificare());

        Logger logger1 = Logger.getInstance(2);
        System.out.println(logger1.getIdNotificare());
    }
}

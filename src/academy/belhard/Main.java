package academy.belhard;

import academy.belhard.db.AppInitializator;
import academy.belhard.exception.PupilException;
import academy.belhard.menu.MenuWorker;

public class Main {

    public static void main(String[] args) {
        AppInitializator.init();

        boolean continueLoop = true;

        while (continueLoop) {
            try {
                continueLoop = MenuWorker.doAction();
            } catch (PupilException e) {
                System.out.println("ОШИБКА: " + e.getMessage());
            }

        }

        System.out.println("Программа завершена");
    }

}

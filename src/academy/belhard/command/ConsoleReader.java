package academy.belhard.command;

import academy.belhard.entity.Pupil;

import java.util.Scanner;

public class ConsoleReader {
    private static final Scanner scanner = new Scanner(System.in);

    public static Pupil readPupil() {
        String firstName =  ConsoleReader.readString("Введите имя: ");
        String lastName =  ConsoleReader.readString("Введите фамилию: ");
        int age =  ConsoleReader.readNumber("Введите возраст: ");

        return new Pupil(firstName, lastName, age);
    }

    public static int readNumber(String message) {
        System.out.print(message);

        return Integer.parseInt(scanner.nextLine());
    }

    public static String readString(String message) {
        System.out.print(message);

        return scanner.nextLine();
    }
}

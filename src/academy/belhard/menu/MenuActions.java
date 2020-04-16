package academy.belhard.menu;

import academy.belhard.command.ConsoleReader;
import academy.belhard.db.PupilsStub;
import academy.belhard.entity.Pupil;
import academy.belhard.validation.PupilValidator;

import java.util.ArrayList;
import java.util.List;

public class MenuActions {

    public static void printAllAction() {
        List<Pupil> pupils = PupilsStub.getAll();

        for (int i = 0; i < pupils.size(); i++) {
            System.out.println(i + ". " + pupils.get(i));
        }

        System.out.println();
        System.out.println();
    }

    public static void addAction() {
        Pupil pupil = ConsoleReader.readPupil();

        PupilValidator.validate(pupil);

        PupilsStub.add(pupil);
    }

    public static void updateAction() {
        int index =  ConsoleReader.readNumber("Введите индекс: ");

        Pupil pupil = ConsoleReader.readPupil();

        PupilValidator.validate(pupil);

        PupilsStub.update(index, pupil);
    }

    public static void deleteAction() {
        int index = ConsoleReader.readNumber("Введите индекс: ");
        PupilsStub.delete(index);
    }

}

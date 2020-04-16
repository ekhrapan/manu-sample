package academy.belhard.validation;

import academy.belhard.entity.Pupil;
import academy.belhard.exception.PupilException;

public class PupilValidator {

    public static void validate(Pupil pupil) {
        validateFirstName(pupil.getFirstName());
        validateLastName(pupil.getLastName());
        validateAge(pupil.getAge());
    }

    private static void validateFirstName(String firstName) {
        if (firstName == null || firstName.isEmpty()) {
            throw new PupilException("Имя невалидно");
        }
    }

    private static void validateLastName(String lastName) {
        if (lastName == null || lastName.isEmpty()) {
            throw new PupilException("Фамилия невалидно");
        }
    }

    private static void validateAge(int age) {
        if (age < 5 || age > 18) {
            throw new PupilException("Возраст невалиден");
        }
    }
}

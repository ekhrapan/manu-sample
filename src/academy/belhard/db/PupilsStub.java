package academy.belhard.db;

import academy.belhard.entity.Pupil;

import java.util.ArrayList;
import java.util.List;

public class PupilsStub {

    private static final List<Pupil> pupils;

    static {
        pupils = new ArrayList<>();
    }

    public static void add(Pupil pupil) {
        pupils.add(pupil);
    }

    public static void delete(int index) {
        pupils.remove(index);
    }

    public static void update(int index, Pupil pupil) {
        pupils.set(index, pupil);
    }

    public static List<Pupil> getAll() {
        return new ArrayList<>(pupils);
    }
}

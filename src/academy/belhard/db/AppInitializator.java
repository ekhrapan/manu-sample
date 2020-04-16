package academy.belhard.db;

import academy.belhard.entity.Pupil;

public class AppInitializator {

    public static void init() {
        Pupil p1 = new Pupil("Tom", "Brown", 11);
        Pupil p2 = new Pupil("Tom2", "Brown2", 22);

        PupilsStub.add(p1);
        PupilsStub.add(p2);
    }

}

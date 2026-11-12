package abstraction.ex3;

abstract class Doctor {

    abstract void treatPatient();
}

class Dentist extends Doctor {

    @Override
    void treatPatient() {
        System.out.println("Treating Teeth");
    }
}

class Cardiologist extends Doctor {

    @Override
    void treatPatient() {
        System.out.println("Treating Heart");
    }
}

public class HospitalManagment {

    public static void main(String[] args) {

        Doctor d;

        d = new Dentist();
        d.treatPatient();

        d = new Cardiologist();
        d.treatPatient();
    }
}

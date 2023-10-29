public class Therapist extends Doctor {
    void heal() {
        System.out.println("Therapist prescribes medication");
    }

    void appointDoctor(Patient ob) {
        if (ob.getTreatmentPlan() == 1) {
            ob.setDoctor(new Surgeon());
            ob.getDoctor().heal();
        }
        if (ob.getTreatmentPlan() == 2) {
            ob.setDoctor(new Dantist());
            ob.getDoctor().heal();
        }
        if (ob.getTreatmentPlan() != 1 && ob.getTreatmentPlan() != 2) {
            ob.setDoctor(new Therapist());
            ob.getDoctor().heal();
        }
    }
}


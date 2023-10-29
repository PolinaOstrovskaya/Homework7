import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Patient patient_1 = new Patient(1);
        Patient patient_2 = new Patient(2);
        Patient patient_3 = new Patient(5);
        Therapist therapist = new Therapist();
        therapist.appointDoctor(patient_1);
        therapist.appointDoctor(patient_2);
        therapist.appointDoctor(patient_3);
        Apple apple = new Apple("red");
        System.out.println("Color before: " + apple.getColor());
        try {
            Field field = Apple.class.getDeclaredField("color");
            field.setAccessible(true);
            field.set(apple, "green");
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("Color after: " + apple.getColor());
    }
}


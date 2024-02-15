package Assignment2;

public class Patient implements Comparable<Patient> {
    private String name;
    private int age;
    private int systolic;
    private int diastolic;

    public Patient(String name, int age, int systolic, int diastolic) {
        this.name = name;
        this.age = age;
        this.systolic = systolic;
        this.diastolic = diastolic;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSystolic() {
        return systolic;
    }

    public int getDiastolic() {
        return diastolic;
    }

    @Override
    public String toString() {
        return "Patient{name='" + name + "', age=" + age + ", systolic=" + systolic + ", diastolic=" + diastolic + '}';
    }

    @Override
    public int compareTo(Patient other) {
        return Integer.compare(other.age, this.age);
    }
    // public int compareTo(Patient p){
    // return CharSequence.compare(p.name,this.name);
    // }

    public boolean hasHighOrLowBloodPressure() {
        return systolic > 120 || diastolic < 80;
    }

}

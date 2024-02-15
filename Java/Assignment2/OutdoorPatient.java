package Assignment2;

public class OutdoorPatient extends Patient {
    private String speciality;
    private double consultationFee;

    public OutdoorPatient(String name, int age, int systolic, int diastolic, double consultationFee) {
        super(name, age, systolic, diastolic);
        this.consultationFee = consultationFee;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getInvoice() {
        return "Consultation Fee: $" + consultationFee;
    }

    @Override
    public String toString() {
        return "Outdoor{" + "speciality='" + super.toString() + "\n" + ", consultationFee=" + getInvoice() + '}';
    }
}

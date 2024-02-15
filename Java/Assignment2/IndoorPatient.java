package Assignment2;

public class IndoorPatient extends Patient {
    private String admissionDate;
    private int bedNo;
    private int daysInHospital;
    private double dailyFee;

    public IndoorPatient(String name, int age, int systolic, int diastolic, int daysInHospital, double dailyFee,
            String admissionDate, int bedNo) {
        super(name, age, systolic, diastolic);
        this.daysInHospital = daysInHospital;
        this.dailyFee = dailyFee;
        this.admissionDate = admissionDate;
        this.bedNo = bedNo;
    }

    public int getDaysInHospital() {
        return daysInHospital;
    }

    public double getDailyFee() {
        return dailyFee;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public int getBedNo() {
        return bedNo;
    }

    public String getInvoice() {
        return "Bill: " + (daysInHospital * dailyFee);
    }

    @Override
    public String toString() {
        return "Indoor:" + super.toString() + "{" +
                "admissionDate=" + admissionDate +
                ", bedNo=" + bedNo +
                ", daysInHospital=" + daysInHospital +
                ", dailyFee=" + dailyFee + ", " + getInvoice() +
                '}';
    }
}

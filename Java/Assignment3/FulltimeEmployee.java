package Assignment3;

class FulltimeEmployee extends Employee {
    private double monthlySalary;

    public FulltimeEmployee(String name, String id, int day, int month, int year, double monthlySalary) {
        super(name, id, day, month, year);
        this.monthlySalary = monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double getSalary() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "Fulltime Employee [name=" + getName() + ", id=" + getId() + ", dateOfBirth="
                + getDateOfBirth().getTime() + ", monthlySalary=" + monthlySalary + "]";
    }
}

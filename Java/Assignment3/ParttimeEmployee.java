package Assignment3;

class ParttimeEmployee extends Employee {
    private double hours;
    private double hourlyRate;

    public ParttimeEmployee(String name, String id, int day, int month, int year, double hours, double hourlyRate) {
        super(name, id, day, month, year);
        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getSalary() {
        double negotiatedHourlyRate = Math.max(hourlyRate, 200);
        return hours * negotiatedHourlyRate;
    }

    @Override
    public String toString() {
        return "Parttime Employee [name=" + getName() + ", id=" + getId() + ", dateOfBirth="
                + getDateOfBirth().getTime() + ", hours=" + hours + ", hourlyRate=" + hourlyRate + "]";
    }
}

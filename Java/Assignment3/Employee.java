package Assignment3;

import java.util.Calendar;

class Employee implements Comparable<Employee> {
    private String name;
    private String id;
    private Calendar dateOfBirth;

    public Employee(String name, String id, int day, int month, int year) {
        this.name = name;
        this.id = id;
        this.dateOfBirth = Calendar.getInstance();
        this.dateOfBirth.set(year, month, day);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(other.getSalary(), this.getSalary());
    }

    public double getSalary() {
        return 0;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", dateOfBirth=" + dateOfBirth.getTime() + "]";
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}

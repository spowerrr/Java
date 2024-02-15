package Assignment1;

public class University {
    private String name;
    private int establishedYear;
    private String address;
    private boolean ugcApproved;

    public University(String name, int establishedYear, String address, boolean ugcApproved) {
        this.name = name;
        this.establishedYear = establishedYear;
        this.address = address;
        this.ugcApproved = ugcApproved;
    }

    public String getName() {
        return name;
    }

    public int getEstablishedYear() {
        return establishedYear;
    }

    public String getAddress() {
        return address;
    }

    public boolean isUgcApproved() {
        return ugcApproved;
    }

    @Override
    public String toString() {
        return "University{name='" + name + "', establishedYear=" + establishedYear +
                ", address='" + address + "', ugcApproved=" + ugcApproved + '}';
    }

    public int compareTo(University other) {
        return Integer.compare(other.establishedYear, this.establishedYear);
    }
}

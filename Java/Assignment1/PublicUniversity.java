package Assignment1;

public class PublicUniversity extends University {
    private int numberOfHalls;
    private boolean politicsAllowed;

    public PublicUniversity(String name, int establishedYear, String address, boolean ugcApproved, int numberOfHalls,
            boolean politicsAllowed) {
        super(name, establishedYear, address, ugcApproved);
        this.numberOfHalls = numberOfHalls;
        this.politicsAllowed = politicsAllowed;
    }

    public int getNumberOfHalls() {
        return numberOfHalls;
    }

    public boolean isPoliticsAllowed() {
        return politicsAllowed;
    }

    @Override
    public String toString() {
        return super.toString() + ", numberOfHalls=" + numberOfHalls + ", politicsAllowed=" + politicsAllowed;
    }
}

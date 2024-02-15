package Assignment1;

public class PrivateUniversity extends University {
    private int numberOfTrusteeMember;

    public PrivateUniversity(String name, int establishedYear, String address, boolean ugcApproved,
            int numberOfTrusteeMember) {
        super(name, establishedYear, address, ugcApproved);
        this.numberOfTrusteeMember = numberOfTrusteeMember;
    }

    public int getNumberOfTrusteeMember() {
        return numberOfTrusteeMember;
    }

    @Override
    public String toString() {
        return super.toString() + ", numberOfTrusteeMember=" + numberOfTrusteeMember;
    }
}

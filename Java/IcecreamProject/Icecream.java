
package IcecreamProject;

public class Icecream {
    private String icecreamType;
    private String icecreamCompany;
    private double icecreamPrice;

    public Icecream() {

    }

    public Icecream(String icecreamType, String icecreamCompany, double icecreamPrice) {
        this.icecreamType = icecreamType;
        this.icecreamCompany = icecreamCompany;
        this.icecreamPrice = icecreamPrice;
    }

    public String getIcecreamType() {
        return this.icecreamType;
    }

    public String getIcecreamCompany() {
        return this.icecreamCompany;
    }

    public double getIcecreamPrice() {
        return this.icecreamPrice;
    }

    public void setIcecreamType(String icecreamType) {
        this.icecreamType = icecreamType;
    }

    public void setIcecreamCompany(String icecreamCompany) {
        this.icecreamCompany = icecreamCompany;
    }

    public void setIcecreamPrice(double icecreamPrice) {
        this.icecreamPrice = icecreamPrice;
    }

    public boolean equals(Icecream I) {
        if (this.icecreamType.equals(I.icecreamType)
                && this.icecreamCompany.equals(I.icecreamCompany)
                && this.icecreamPrice == I.icecreamPrice) {
            return true;
        } else {
            return false;
        }
    }

    public int comapareTo(Icecream I) {
        if (this.icecreamPrice > I.icecreamPrice)
            return 1;
        else if (this.icecreamPrice == I.icecreamPrice)
            return 0;
        else
            return -1;
    }

    public String toString() {
        return "IceCream Type:" + this.icecreamType + " " + "IceCream Company:" + this.icecreamCompany + " "
                + "IceCream Price:" + this.icecreamPrice;
    }
}

public class Car {
    private int mileage;
    public Car(){
        mileage=0;
    }
    public void drive(int miles){
        mileage+=miles;
    }
    public int getMileage(){
        return mileage;
    }
    public static void main(String[] args){
        Car M= new Car();
        M.drive(100);
        System.out.println("Mileage: " + M.getMileage());
    }
}

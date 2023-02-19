package person;

public class Driver extends Person {
    public Driver(){
    }
    @Override
    public void working() {
        System.out.println("Drivers drive cars");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

package person;

public class Programmer extends Person {
    public Programmer() {
    }

    @Override
    public void working() {
        System.out.println("Programmers write code");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

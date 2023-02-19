package person;

public class Builder extends Person {
    public Builder() {
    }//Строитель

    @Override
    public void working() {
        System.out.println("Builders are building a house");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

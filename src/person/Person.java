package person;

public abstract class Person {
    private String name="Luisa";
    private static int age;

/*    public Person(int age) {
        Person.age = age;
       // this.name=name;
    }*/


    public String getName() {
        return name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Person.age = age;
    }
    public abstract void working();

    @Override
    public String toString() {
        return "Person:  \n" +
                "name: " + name + '\n' +"age: "+age;
    }

}

import person.Builder;
import person.Driver;
import person.Person;
import person.Programmer;

public class Main {
    public static void main(String[] args) {

        Person.setAge(19);

        Programmer programmer=new Programmer();
        System.out.println(programmer);
        programmer.working();

        Driver driver=new Driver();
        System.out.println(driver);
        driver.working();

        Builder builder=new Builder();
        System.out.println(builder);
        builder.working();


        //InteliJ IDEA'дан жаңы проект ачыңыз.
        //src деген пакеттин ичине жаңы person деген пакет ачыңыз.
        //person пакеттин ичине Person, Programmer, Driver, Builder деген класс түзүңүз.
        //Person класстын ичине private final name, private static age деген поля кошуп,
        // working() деген метод түзүңүз.
        //Баардык класстар Person классын мурастасын.
        //Main класстан бирден объектерин түзүп, аргументтерин берип,
        // Person класстын working() методдун override кылып,
        // өзүнө тиешелүү жумуштарын консольго чыгарыңызSystem.out.println("Hello world!");
    }
}
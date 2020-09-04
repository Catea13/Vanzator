import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Vanzator {

    private String id;//generics
    private String FirstName;
    private String LastName;
    private int age;
    private String expereenta;


    public Vanzator(String id, String FirstName, String LastName, int age, String expereenta) {//am creat constructor
        this.id = id;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.age = age;
        this.expereenta = expereenta;


    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getExpereenta() {
        return expereenta;
    }

    public void setExpereenta(String expereenta) {
        this.expereenta = expereenta;
    }

    @Override
    public String toString() {
        return "Vanzator{" +
                "id=" + id +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age=" + age +
                ", expereenta='" + expereenta + '\'' +
                '}';
    }

    public static void main(String[] args) {

        ArrayList<Vanzator> vanzator = new ArrayList<Vanzator>();//Am pus datele in Collectia ArrayList
        vanzator.add(new Vanzator("0001884125", "Maxim", "Bortinlov", 25, "2 ani"));
        vanzator.add(new Vanzator("041541541", "Anastasia", "Sumanova", 30, "5 ani"));
        vanzator.add(new Vanzator("0895258558", "Grigorii", "Edganov", 24, "1 an"));
        vanzator.add(new Vanzator("000785225552", "Leonid", "Samarov", 21, "3 luni"));
        for (Vanzator vanzator1 : vanzator) {
            System.out.println(vanzator1);//Afiseaza vanzator
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dati varsta");//Introducem varstei

        Integer varsta = scanner.nextInt();

        ;
        for (Vanzator vanzator1 : vanzator) {

            if (varsta <= vanzator1.age)//Afisam vanzatoari care au virsta mai mare sau egala care am dat de la tastatura
                System.out.println(vanzator1);
        }


        vanzator.sort(Comparator.comparing(Vanzator::getAge));//sortam varsta
        for (Vanzator vanzator1 : vanzator) {
            System.out.println("Age dupa sortare" + vanzator1.age);

        }
        vanzator.get(2).setExpereenta("1.5 ani");
        System.out.println("Dupa modificare" + vanzator.get(2));
    }
}




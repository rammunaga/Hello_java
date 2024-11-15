import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hi this is sai krishna...");
        System.out.println("This is sai ram");
        System.out.print("isprine number");

       List<Integer> lst=List.of(1,2,3,4,5,6,7,8,9);
       long count=lst.stream().filter(PrimeChecker::isprime).count();
       System.out.println(count);
       System.out.println(lst);

        System.out.println("This is for checking intellj");
    }
}

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> test = new ArrayList<>();

        for (int i=0; i <10; i++){
            test.add(i);
            System.out.println("The value is: " +i);
        }

        for (int i=0; i < test.size(); i++){

            System.out.println("The value on the list  is: " +test.get(i));
        }
    }
}
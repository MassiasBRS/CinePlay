import java.util.ArrayList;
import java.util.Scanner;

public class testArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        System.out.println("Digite uma palavra composta");
        String inpuString = input.next();
        lista.add(inpuString);
        System.out.println(lista.get(1));
    }
}

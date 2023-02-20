import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random r = new Random();

        ArrayList <Integer> arrayLst = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            arrayLst.add(r.nextInt(500000));
        }
        long end = System.currentTimeMillis();
        System.out.println("Time ArrayList: " + (end - start));

        LinkedList <Integer> linkedLst = new LinkedList<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            linkedLst.add(r.nextInt(500000));
        }
        end = System.currentTimeMillis();
        System.out.println("Time LinkedList: " + (end - start));


        Scanner sc = new Scanner(System.in);
        LinkedList<String> newList = new LinkedList<>();
        while (true) {
            String res = sc.nextLine();
            if (res.equals("revert")) {
                if (newList.size() >= 1) newList.removeFirst();
            } else if (res.equals("print")) {
                System.out.println(newList);
            } else {
                newList.addFirst(res);
            }
        }
    }
}
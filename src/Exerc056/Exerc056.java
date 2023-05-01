package Exerc057;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Exerc057 {

    static Iterator func(ArrayList myList) {
        Iterator it = myList.iterator();
        while (it.hasNext()) {
            Object element = it.next();

            if (element instanceof String) {
                break;
            }
        }
        return it;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList myList = new ArrayList();

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            myList.add(sc.nextInt());
        }

        myList.add("###");
        for (int i = 0; i < m; i++) {
            myList.add(sc.next());
        }

        Iterator it = func(myList);
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println((String) element);
        }

        sc.close();
    }
}

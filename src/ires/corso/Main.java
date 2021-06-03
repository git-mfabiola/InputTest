package ires.corso;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in;
	    in=new Scanner(System.in);

	    //Chiedo inserimento di tre numeri
        System.out.println("Inserisci un numero:");
        int n1 = in.nextInt();
        System.out.println("Hai inserito il numero:" + n1);

        System.out.println("Inserisci un numero:");
        int n2 = in.nextInt();
        System.out.println("Hai inserito il numero:" + n2);

        System.out.println("Inserisci un numero:");
        int n3 = in.nextInt();
        System.out.println("Hai inserito il numero:" + n3);
        if (n1>n2 && n1>n3)
                System.out.println("questo numero è il maggiore: " + n1);
        else
            if (n2>n3)
                System.out.println("questo numero è il maggiore:" +n2);
            else
                System.out.println("questo numero è il maggiore: " +n3);
    }
}

package ba.unsa.etf.rpr;

import java.util.*;

public class Main {

    public static int sumaCifara(int n){
        int suma = 0;
        while(n!=0){
            suma = suma+ n%10;
            n = n/10;
        }
        return  suma;
    }
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        System.out.print("Unesite broj n: ");
        int n = ulaz.nextInt();


        System.out.println("Brojevi koji su djeljivi sa svojom sumom cifara su: ");
        int broj = 0;
        for(int i=1;i<=n;i++){
           if(i % sumaCifara(i) == 0){
               broj = broj+1;
                System.out.print(i + " ");
            }
        }
        System.out.println("\nOd 1 do "+n+" takvih brojava ima: "+broj);

    }
}

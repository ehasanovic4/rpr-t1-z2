package ba.unsa.etf.rpr;


import java.util.Scanner;

public class Main {

    public static int sumaCifara(int n){
        int suma=0;
        while(n!=0){
            suma = n % 10 + suma;
            n=n/10;
        }
        return suma;
    }

    public static void main(String[] args) {
        int n,i;
        Scanner ulaz=new Scanner(System.in);
        System.out.println("Unesite broj n:");
        n=ulaz.nextInt();
        for(i=1;i<=n;i++){
            int suma=sumaCifara(i);

            if(i % suma == 0){
                System.out.println(i);
            }
        }

    }
}

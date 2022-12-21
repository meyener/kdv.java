import java.util.Scanner;

public class kdv{
    public static void main(String[] args) {
        int ana;
        double toplam;
        double ek;
        System.out.println("lütfen fiyatı giriniz : ");
        Scanner scn= new Scanner(System.in);
        ana=scn.nextInt();
        ek =(ana*0.18);
        toplam= ana+ek;

        
        System.out.println("toplam :"+toplam);
    }
}
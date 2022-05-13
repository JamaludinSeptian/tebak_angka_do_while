import java.util.Scanner;
import java.lang.Math;

public class tebakAngka {
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
            int i = 1;
            String pilihan = "y";
            int percobaan = 1;
            int angka;
            int max = 10;
            int min = 1;
            int benar = 0;
            int salah = 0;
            int balanced;
            int total;
            int range = max - min + 1;
            System.out.println("SELAMAT DATANG DI TEBAK ANGKA");
            System.out.println("=================================");
            System.out.print("Masukan angka taruhan minimal 50.000 : "); balanced=sc.nextInt();
            do{
                System.out.println("");
                System.out.println("Ini adalah percobaan ke - "+percobaan); 
                System.out.print("Masukan angka yang anda inginkan: "); angka=sc.nextInt();
                int rand = (int)(Math.random() * range) + min;
                if(angka == rand){
                    System.out.println("Tebakan anda benar, yaitu angka - "+rand);
                    balanced += 10000;
                    benar++;
                }else{
                    System.out.println("Tebakan anda salah, yang benar adalah angka - "+rand);
                    balanced -= 10000;
                    salah++;
                }
                System.out.println("Uang anda adalah "+balanced);
                if(balanced > 0){
                    System.out.print("Apakah anda ingin mencoba lagi (Y/T) ? "); pilihan=sc.next();
                }else{
                    System.out.println("");
                    System.out.print("Maaf uang anda habis tidak bisa melakukan taruhan");
                }
                System.out.println("");
                percobaan++;
            }while(pilihan.equalsIgnoreCase("y") && balanced > 0);
            System.out.println("");
            System.out.println("Tebakan benar adalah "+benar);
            System.out.println("Tebakan salah adalah "+salah);
            System.out.println("Terima kasih");
        }catch(Exception e){
            System.out.println("Error : "+e.getMessage());
        }
    }
}

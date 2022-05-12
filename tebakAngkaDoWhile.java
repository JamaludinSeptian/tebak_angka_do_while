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
            int range = max - min + 1;
            System.out.println("SELAMAT DATANG DI TEBAK ANGKA");
            System.out.println("=================================");
            do{
                System.out.println("");
                System.out.println("Ini adalah percobaan ke - "+percobaan); 
                System.out.print("Masukan angka yang anda inginkan: "); angka=sc.nextInt();
                int rand = (int)(Math.random() * range) + min;
                if(angka == rand){
                    System.out.println("Tebakan anda benar, yaitu angka - "+rand);
                    benar++;
                }else{
                    System.out.println("Tebakan anda salah, yang benar adalah angka - "+rand);
                    salah++;
                }
                
                System.out.print("Apakah anda ingin mencoba lagi (Y/T) ? "); pilihan=sc.next();
                System.out.println("");
                percobaan++;
            }while(pilihan.equalsIgnoreCase("y"));
            System.out.println("Tebakan benar anda adalah "+benar);
            System.out.println("Tebakan salah anda adalah "+salah);
            System.out.println("Terima kasih");
        }catch(Exception e){
            System.out.println("Error : "+e.getMessage());
        }
    }
}

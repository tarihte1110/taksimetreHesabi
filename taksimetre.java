import java.util.Scanner;
public class taksimetre {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int km;
        double perKm=2.20 , total , startPrice=10;

        System.out.print("mesafeyi km cinsinden giriniz:");
        km= input.nextInt();

        total = (km * perKm);
        total +=startPrice;

        total = (total<20) ? 20 : total;

        System.out.println("toplam tutar:"+ total);



    }
}

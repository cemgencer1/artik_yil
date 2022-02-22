import java.util.Scanner;

public class artik_yil {
    public static void main(String[]args){
        Scanner inp=new Scanner(System.in);

        double kalan;
        System.out.print("Hesaplanacak Yılı Giriniz :");
        int yil = inp.nextInt();

        kalan=yil%4;

        if (kalan==0){
            System.out.println("Girdiğiniz yıl artık yıldır.");
        }else {
            System.out.println("Girdiğiniz yıl artık yıl değildir.");
        }
    }
}

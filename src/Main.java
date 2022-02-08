import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input = new Scanner(System.in);

        System.out.print("İlk Sayıyı Giriniz: ");
        n1 = input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz: ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Hangi İşlemi Yapmak İstiyorsunuz?");
        select = input.nextInt();
/*
        if(select==1){
            System.out.println("Toplama İşleminin Sonucu: "+ (n1+n2));
        } else if(select==2){
            System.out.println("Çıkarma İşleminin Sonucu: "+ (n1-n2));
        } else if(select==3){
            System.out.println("Çarpma İşleminin Sonucu: "+ (n1*n2));
        } else if(select==4){
            if(n2!=0) {
                System.out.println("Toplama İşleminin Sonucu: " + (n1 / n2));
            }else{
                System.out.println("Bölen Sayı 0 olamaz");
            }
        } else{
            System.out.println("Yanlış Seçim Yaptınız");
        }
*/
        switch(select){
            case 1:
                System.out.println("Toplama İşleminin Sonucu: "+ (n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma İşleminin Sonucu: "+ (n1-n2));
                break;
            case 3:
                System.out.println("Çarpma İşleminin Sonucu: "+ (n1*n2));
                break;
            case 4:
                if(n2!=0){
                    System.out.println("Bölme İşleminin Sonucu: "+ (n1/n2));
                }else{
                    System.out.println("Bölen 0 olamaz");
                }
                break;
            default:
                System.out.println("Yanlış Seçim Yaptınız");
        }
    }
}

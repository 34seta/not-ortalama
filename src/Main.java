import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double mat, fiz, turk, kim, muzik;

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        if (mat <= 100 && mat > 0) {
            mat = mat;
        } else {
            mat = 0;
        }

        System.out.println("Fizik notunuzu giriniz: ");
        fiz = input.nextInt();

        if (fiz <= 100 && fiz > 0) {
            fiz = fiz;
        } else {
            fiz = 0;
        }

        System.out.println("Turkce notunuzu giriniz : ");
        turk = input.nextInt();

        if (turk <= 100 && turk > 0) {
            turk = turk;
        } else {
            turk = 0;
        }

        System.out.println("Kimya notunuzu giriniz: ");
        kim = input.nextInt();

        if (kim <= 100 && kim > 0) {
            kim = kim;
        } else {
            kim = 0;
        }
        System.out.println("Muzik notunuzu giriniz : ");
        muzik = input.nextInt();
        if (muzik <= 100 && muzik > 0) {
            muzik = muzik;
        } else {
            muzik = 0;
        }

        double avarage = (turk + mat + muzik + kim + fiz) / 5;

        System.out.println("Not ortalamanız: " + avarage);


        if (avarage >= 55) {
            System.out.println("sınıfı geçtiniz");
        } else {
            System.out.println("Kaldınız");
        }


    }


}


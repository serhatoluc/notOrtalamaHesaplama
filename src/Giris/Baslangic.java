import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
    // Değişkenleri oluşturmalıyız. Bunlar;
        int mat, fizik, kimya, turkce, tarih, muzik;

        System.out.println("Merhaba Ders Notlarınızı Hesaplama Programına Hoşgeldiniz...");
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Matematik Notunuzu Giriniz: ");
        mat = input.nextInt();
        System.out.print("Lütfen Fizik Notunuzu Giriniz: ");
        fizik = input.nextInt();
        System.out.print("Lütfen Kimya Notunuzu Giriniz: ");
        kimya = input.nextInt();
        System.out.print("Lütfen Türkçe Notunuzu Giriniz: ");
        turkce = input.nextInt();
        System.out.print("Lütfen Tarih Notunuzu Giriniz: ");
        tarih = input.nextInt();
        System.out.print("Lütfen Müzik Notunuzu Giriniz: ");
        muzik = input.nextInt();
        double A = (mat+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println("Ders Ortalamanız: " + A);
    }
}

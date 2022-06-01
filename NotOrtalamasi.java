package Hesaplamalar;

import java.util.Scanner;

public class NotOrtalamasi {

    public static void main(String[] args) {

        //Degiskenleri Olustur

        int matematik,fizik,kimya,biyoloji,cografya,tarih;

        //Scanner sinifimizi tanimladik

        Scanner input= new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz :");
        matematik = input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz :");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = input.nextInt();

        System.out.print("Biyoloji Notunuzu Giriniz : ");
        biyoloji = input.nextInt();

        System.out.print("Cografya Notunuzu Giriniz : ");
        cografya = input.nextInt();

        System.out.print("Tarih Notunuzu Giriniz : ");
        tarih = input.nextInt();

        double toplam = (matematik+fizik+kimya+biyoloji+cografya+tarih);
        double sonuc = toplam/6;
        System.out.println(" Ortalamaniz " + sonuc);

        System.out.println(sonuc >= 60 ? "Sinifi Gecti" : "Sinifta Kaldi");
    }
}

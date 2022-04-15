package proje2.ogrencıOgrtYonetimi;

import java.util.ArrayList;
import java.util.Scanner;

public class Islemler {

    static ArrayList<Kisi> ogrncListesi = new ArrayList<>();
    static ArrayList<Kisi> ogrtmListesi = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;

    public static void girisPaneli() {
        System.out.println("====================================\n" +
                "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "\t====================================\n" +
                "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\t Q- ÇIKIŞ\n");

        System.out.println("isleminizi seciniz");
        String secim = scan.next().toUpperCase();

        switch (secim) {

            case "1":
                kisiTuru = "OGRENCI";
                islemMenusu();
                break;

            case "2":
                kisiTuru = "OGRETMEN";
                break;

            case "Q":
                cikis();
                break;

            default:
                System.out.println("Hatali giris yaptiniz");
                girisPaneli();//recursive method call
                break;
        }


    }

    private static void cikis() {
        System.out.println("Hoscakal yine bekleriz");
    }

    public static void  islemMenusu() {

        System.out.println("Seçilen Kişi türüne:" + kisiTuru + " göre aşağıdaki işlemleri gösteren bir alt menü daha gösterilsin.\n" +
                "\n" +
                "\t============= İŞLEMLER =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t 0-ANA MENÜ\n");

        System.out.println("islem tercihinizi giriniz : ");

        int secilenIslem=scan.nextInt();
        switch(secilenIslem){
            case 1:
                ekle();
                islemMenusu();
                break;
            case 2:
                islemMenusu();
                break;
            case 3:

                islemMenusu();
                break;

            case 4:
                islemMenusu();
                break;
            case 0:
                girisPaneli();
                break;
            default:
                System.out.println("Lütfen dogru islemi seciniz");
                islemMenusu();
                break;

        }


    }

    private static void ekle() {

        System.out.println("   **** "+kisiTuru+"ekleme sayfasi ***" );
        System.out.println("ad soyad giriniz  : ");
        scan.nextLine();
        String adSoyad=scan.nextLine();
        System.out.println("kimlik No giriniz  : ");
        String kimlikNo=scan.nextLine();
        System.out.println("yas giriniz  : ");
        int yas=scan.nextInt();

        if (kisiTuru.equals("OGRENCI")){
            System.out.println("ogrenci no giriniz");
            String ogrcNo=scan.next();
            System.out.println("sinif giriniz");
            String sinif=scan.next();
            Ogrenci Ogrenci=new Ogrenci(adSoyad,kimlikNo,yas,ogrcNo,sinif);
            ogrncListesi.add(Ogrenci);
        } else {
            System.out.println("sicil no giriniz");
            String sicilNo=scan.nextLine();
            System.out.println("bolum giriniz");
            String bolum=scan.nextLine();
            Ogretmen muhteseOgretmen=new Ogretmen(adSoyad,kimlikNo,yas,sicilNo,bolum);
            ogrtmListesi.add(muhteseOgretmen);

        }

    }


}

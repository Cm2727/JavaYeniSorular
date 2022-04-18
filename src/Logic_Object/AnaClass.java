package Logic_Object;

public class AnaClass {
    public static void main(String[] args) {
        Adres adr = new Adres();
        Ogrenci ogr=new Ogrenci();
        Ogrenci ogr2=new Ogrenci();


        adr.mahalle = "Kibris Mah.";
        adr.sokak = "Dede Efendi sok";
        adr.KapiNo = "44";
        adr.sehir="Ankara";
        ogr.adi="Hasan";
        ogr.soyadi="Kilic";
        ogr.oAdres=adr;
        ogr2.adi="Ahmet";
        ogr2.soyadi="Kar";
        ogr2.oAdres=adr;




        System.out.println("Mahalle: " + adr.mahalle);
        System.out.println(ogr.oAdres.mahalle);
        System.out.println(ogr2.oAdres.sehir);


    }


}

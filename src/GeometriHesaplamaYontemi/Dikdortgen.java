package GeometriHesaplamaYontemi;

public class Dikdortgen extends Sekil{

    public Dikdortgen() {
    }

    public Dikdortgen(double uzunKenar, double kisa) {
        super(uzunKenar, kisa);
    }


    @Override
    public double cevreHesaplama() {
        return super.cevreHesaplama();
    }

    @Override
    public double alanHesaplama() {
        return super.alanHesaplama();
    }

    @Override
    public String toString() {
        return "Dikdortgen; " +
                "\nuzunKenar= " + uzunKenar +
                "\nkisaKenar= " + kisaKenar +
                "\nAlani= "+alanHesaplama()+
                "\nCevresi= "+cevreHesaplama()+
                "";
    }
}

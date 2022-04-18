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
        return "Dikdortgen{" +
                "uzunKenar=" + uzunKenar +
                ", kisaKenar=" + kisaKenar +
                "DikdortgeninAlani="+alanHesaplama()+
                "Dikdortgenincevresi="+cevreHesaplama()+
                '}';
    }
}

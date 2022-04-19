package GeometriHesaplamaYontemi;

public class Kare extends Dikdortgen{
    public Kare() {
    }

    public Kare(double uzunKenar, double kisa) {
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
        return "Kare; " +
                "\nKenar=" + kisaKenar +
                "\nAlan=" +alanHesaplama() +
                "\ncevres=" + cevreHesaplama() +
                "";
    }
}

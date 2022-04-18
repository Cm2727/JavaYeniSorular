package GeometriHesaplamaYontemi;

public class Sekil {

    double uzunKenar;
    double kisaKenar;
    double yariCap;

    public Sekil() {

    }

    public Sekil(double uzunKenar, double kisa) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisa;
    }

    public Sekil(double yariCap) {
        this.yariCap = yariCap;
    }

    public double cevreHesaplama(){
        return (uzunKenar+kisaKenar)*2;
    }

    public double alanHesaplama(){
        return (uzunKenar*kisaKenar);

    }

    public  double cemberAlanHesaplam(){
        return (yariCap*yariCap*3.14);
    }

    public double cemberCevreHesaplam(){
        return 2*3.14*yariCap;

    }



}

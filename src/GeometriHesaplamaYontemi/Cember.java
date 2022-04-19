package GeometriHesaplamaYontemi;

public class Cember extends Sekil {
    public Cember() {
    }

    public Cember(double yariCap) {
        super(yariCap);
    }

    @Override
    public double cemberAlanHesaplam() {
        return super.cemberAlanHesaplam();
    }

    @Override
    public double cemberCevreHesaplam() {
        return super.cemberCevreHesaplam();
    }

    @Override
    public String toString() {
        return "Cember; " +
                " \nyariCap=" + yariCap +
                " \nCemberin Alani=" + cemberAlanHesaplam() +
                " \nCemberin Cevresi=" + cemberCevreHesaplam() +
                "";
    }
}

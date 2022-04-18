package hayvanlarAlemi;

public class Calisma {
    public static void main(String[] args) {

        Memeli om=new Memeli();
        om.beslenme();
        om.su();
        om.yemek();

        System.out.println("****    kuslar   ***");

        Kuslar ok=new Kuslar();

        ok.ucmak();
        ok.su();
        ok.yemek();


    }
}

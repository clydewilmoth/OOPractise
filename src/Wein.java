public class Wein {
    private final double alkoholanteil;
    public int jahrgang;
    public double alkoholmenge;

    public Wein(double alkoholanteil, int jahrgang){
        this.alkoholanteil = alkoholanteil;
        this.jahrgang = jahrgang;
    }

    public void alkoholmenge(double milliLiter){
        this.alkoholmenge = milliLiter * (this.alkoholanteil / 100);
    }

}

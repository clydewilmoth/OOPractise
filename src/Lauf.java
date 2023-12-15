public class Lauf {
    private final double zeitInSekunden;
    private final double streckeInKm;
    public double geschwindigkeitInKmH;
    public Lauf(int zeitInSekunden, double streckeInKm){
        this.zeitInSekunden = zeitInSekunden;
        this.streckeInKm = streckeInKm;
    }
    public void geschwindigkeitInKmH() {
        this.geschwindigkeitInKmH = streckeInKm / ((zeitInSekunden / 60) / 60);
    }
}

public class PKW {
    public int kilometerStand;
    public int pferdestärke;
    public int drehmoment;
    public PKW(int kilometerStand, int pferdestärke, int drehmoment){
        this.kilometerStand = kilometerStand;
        this.pferdestärke = pferdestärke;
        this.drehmoment = drehmoment;
    }

    public void kilometerStandHinzufügen(int kilometerStand){
        this.kilometerStand += kilometerStand;
    }
}

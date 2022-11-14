package ba.unsa.etf.rpr;

public class AutoFactory {
    public Factory fabrika(String gorivo){
        if(gorivo.equals("Dizel")) return new Opel();
        else if(gorivo.equals("Benzin")) return new BMW();
        else if(gorivo.equals("Struja")) return new Tesla();
        return null;
    }
}
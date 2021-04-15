package BangunDatarRuang;

public class Silinder extends BangunRuang {
    double jari, tinggi;

    public Silinder(double jari, double tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }
    
    @Override
    double luas(){
        return Math.PI*jari*jari;
    }
    
    @Override
    double keliling(){
        return 2*Math.PI*jari;
    }
    
    @Override
    double volume(){
        return Math.PI*jari*jari*tinggi;
    }
    
    @Override
    double luasPermukaan(){
        return 2*Math.PI*jari*(jari+tinggi);
    }
    
}

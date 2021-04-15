package BangunDatarRuang;

public class Lingkaran extends BangunDatar {
    double jari;

    public Lingkaran(double jari) {
        this.jari = jari;
    }
    
    @Override
    double luas(){
        return Math.PI*jari*jari;
    }
    
    @Override
    double keliling(){
        return 2*Math.PI*jari;
    }
    
}

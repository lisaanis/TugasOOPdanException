package BangunDatarRuang;

public class Persegi extends BangunDatar {
    double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    
    @Override
    double luas(){
        return sisi*sisi;
    }
    
    @Override
    double keliling(){
        return sisi*4;
    }
    
}

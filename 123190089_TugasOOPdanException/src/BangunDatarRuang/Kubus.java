package BangunDatarRuang;

public class Kubus extends BangunRuang {
    double sisi;

    public Kubus(double sisi) {
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
    
    @Override
    double volume(){
        return sisi*sisi*sisi;
    }
    
    @Override
    double luasPermukaan(){
        return 6*sisi*sisi;
    }  
}

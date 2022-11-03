package Practice;

public class Complex {
    private double realPart;
    private double imaginaryPart;

    public Complex() {
        realPart=0;
        imaginaryPart=0;
    }

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }
    public String toString(){
        if (getImaginaryPart() == 0) return getRealPart() + "";
        if (getRealPart() == 0) return getImaginaryPart() + "i";
        if (getImaginaryPart() < 0) return getRealPart() + " - " + (-getImaginaryPart()) + "i";
        return getRealPart() + "+" + getImaginaryPart() + "i";

    }
    public Complex add(Complex ab){
        double thuc=this.getRealPart()+ab.getRealPart();
        double ao=this.getImaginaryPart()+ab.getImaginaryPart();
        return  new Complex(thuc,ao);
    }
    public Complex subtract(Complex ab){
        double thuc=this.getRealPart()-ab.getRealPart();
        double ao= this.getImaginaryPart()-ab.getImaginaryPart();
        return  new Complex(thuc,ao);
    }
    public Complex multiply(Complex ab){
        Complex a= new Complex();
        a.setRealPart(this.getRealPart()*ab.getRealPart() - this.getImaginaryPart()* ab.getImaginaryPart());
        a.setImaginaryPart(this.getRealPart()*ab.getImaginaryPart()+ this.getImaginaryPart()*ab.getRealPart());
        return a;
    }
    public Complex divide(Complex ab) throws Exception{
        if(ab.getRealPart() == 0 && ab.getImaginaryPart() == 0) throw new Exception("can't be zero!");
        Complex a= new Complex();
        a.setRealPart(this.getRealPart()*ab.getRealPart() + this.getImaginaryPart()*ab.getImaginaryPart()/
                (ab.getRealPart()*ab.getRealPart()+ab.getImaginaryPart()* ab.getImaginaryPart()));
        a.setRealPart((this.getImaginaryPart()*ab.getRealPart() - this.getRealPart()*ab.getImaginaryPart())/
                (ab.getRealPart()*ab.getRealPart() + ab.getImaginaryPart()*ab.getImaginaryPart()));
        return a;
    }
}

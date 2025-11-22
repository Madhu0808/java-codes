package OOPS;

public class Pratice {
    public static void main(String[] args) {
        Complex c1 = new Complex(11, 12);
        Complex c2 = new Complex(12, 11);
        c1.add(c2);
        c1.diff(c2);
        c1.prod(c2);
    }
}
class Complex{
    int real;
    int imag;

    Complex(int real, int imag){
         this.real = real;
         this.imag = imag;
    }

    // void setReal (int real){
    //     this.real = real;
    // }

    // void setImag(int imag){
    //     this.imag = imag;
    // }

    void add(Complex c2){
        int realSum = this.real + c2.real;
        int imagSum = this.imag + c2.imag;
        System.out.println("Sum: " +realSum + " + " + imagSum + "i");
    }

    void diff(Complex c2){
        int realDiff = this.real - c2.real;
        int imagDiff = this.imag - c2.imag;
        System.out.println("Difference: " +realDiff + " + " + imagDiff + "i");
    }
    void prod(Complex c2){
        int realProd = (this.real * c2.real) - (this.imag * c2.imag);
        int imagProd = (this.real * c2.imag) + (this.imag * c2.real) ;
        System.out.println("Product: " +realProd + " + " + imagProd + "i");
    }
}

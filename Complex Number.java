import java.util.*;
 
class Complex {
 
    int real;
    int imaginary;
     Complex() {}
 
 
     Complex(int tempReal, int tempImaginary){
        real = tempReal;
        imaginary = tempImaginary;
    }
 
    Complex addComp(Complex C1, Complex C2){
        Complex temp = new Complex();
        temp.real = C1.real + C2.real;
 
        temp.imaginary = C1.imaginary + C2.imaginary;
 
        return temp;
    }
}
public class TEST05 {

	public static void main(String[] args) {
        Complex obj1 = new Complex(5, 2);
        System.out.println("Complex Number 1 : " + obj1.real+ " + i" + obj1.imaginary);
        Complex obj2 = new Complex(2, 5);
 
        System.out.println("Complex Number 2 : " + obj2.real+ " + i" + obj2.imaginary);
        Complex obj3 = new Complex();
 
        obj3 = obj3.addComp(obj1, obj2);
        System.out.println( );
        System.out.println("Sum of Two Complex Number :"+ obj3.real + " + i"+ obj3.imaginary);
 
	}

}

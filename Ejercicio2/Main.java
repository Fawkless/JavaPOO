package Ejercicio2;



public class Main {
    public static void main(String[] args) {

        int num1 = 2, num2 = 5, num3 = 7, num4 = 10, suma=0,suma2=0,suma3=0, suma4=0,a,total;


        for (int i = 0; i < 79; i++) {
            a=num1;
            num1=num1+10;
            suma=suma+num1+a;

        }
        for (int i = 0; i < 79; i++) {
            a=num2;
            num2 = num2 + 10;
            suma2=suma2+num2+a;

        }
        for (int i = 0; i < 79; i++) {
            a=num3;
            num3= num3 + 10;
            suma3=suma3+num3+a;

        }
        for (int i = 0; i < 79; i++) {
            a=num4;
            num4 = num4 + 10;
            suma4=suma4+num4+a;

        }
        total=suma+suma2+suma3+suma4;
        System.out.println("La suma de todos los elementos de la serie es: " +total);

    }
}
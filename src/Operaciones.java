import java.util.Scanner;

public class Operaciones {
    public static void main(String[]args){
        Scanner dlt= new Scanner(System.in);

        float num1, num2, suma, resta, mult, mod, mod1, div;
        System.out.println("Operaciones Basicas de dos numeros");
        System.out.println("Ingrese dos numeros");
        num1 =dlt.nextFloat();
        num2 = dlt.nextFloat();

        //Operaciones
        suma=num1+num2;
        resta=num1+num2;
        mult=num1*num2;

        div=num1/num2;


        System.out.println("Los resultados de los numeros son"
        + "\nSuma" + suma
        + "\nResta" + resta
        + "\nMultiplicacion " + mult);
        System.out.println("Modulo de ");
        if(num1<0){
            if(num2<0){
                mod=(Math.abs(num1*-1));
                mod1=(Math.abs(num2*-1));
                System.out.println("Primer numero " + mod +"Segundo numero"+ mod1);
            }else{
                mod=(Math.abs(num1*-1));
                mod1=(Math.abs(num2*-1));
                System.out.println("Primer numero " + mod +"Segundo numero"+ mod1);
            }
        }else{
            if (num2>0){
                mod=(Math.abs(num1*-1));
                mod1=(Math.abs(num2*-1));
                System.out.println("Primer numero " + mod +"Segundo numero"+ mod1);
            }else{
                mod=(Math.abs(num1*-1));
                mod1=(Math.abs(num2*-1));
                System.out.println("Primer numero " + mod +"Segundo numero"+ mod1);
            }
            }
        System.out.println("Division" + div);
        }
        }



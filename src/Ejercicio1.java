import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        String cadena;
        int digito, cantidad_digitos, contar_digito;

        Scanner input= new Scanner(System.in);

        System.out.println("Ingresar cadena de números:");
        cadena=input.next();

        System.out.println("Ingresar dígito a buscar: ");
        digito=input.nextInt();

        cantidad_digitos=CantidadDigitos(cadena);
        contar_digito=ContarDigitos(cadena,digito);

        System.out.println("La cadena de números ingresado tiene: "+cantidad_digitos+" digitos.");
        System.out.println("El número "+digito+" se repite: "+contar_digito+ " veces.");
    }

    private static int CantidadDigitos(String cadena){
        return cadena.length(); //Nos permite hallar la cantidad de caracteres que hay en la cadena
    }

    private static int ContarDigitos(String cadena, int digito){
        int contador=0;

        for(int i=0;i<cadena.length();i++){
            if(Character.getNumericValue(cadena.charAt(i))==digito){
                //Se utiliza para comparar un dígito en una cadena de caracteres con un valor número que se está buscando.
                contador++; //Se incrementa el contador si encontramos el dígito buscado
            }
        }
        return contador;
    }
}

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int anios;
        String tipo_trabajador;
        double sueldo, nuevo_sueldo, porcentaje;

        Scanner input=new Scanner(System.in);

        System.out.println("Ingresar número de años: ");
        anios=input.nextInt();

        System.out.println("Ingresar el tipo de trabajador: ");
        tipo_trabajador=input.next();

        System.out.println("Ingresar sueldo: ");
        sueldo=input.nextDouble();

        nuevo_sueldo=Calcular_sueldo_n_anios(anios, tipo_trabajador,sueldo);
        porcentaje=CalculoPorcentajeAumento(anios,tipo_trabajador,sueldo);

        System.out.println("El nuevo sueldo en "+anios+" años, es: "+nuevo_sueldo);
        System.out.println("El porcentaje de aumento es: "+porcentaje);

    }

    private static double Calcular_sueldo_n_anios(int anios, String tipo_trabajador,double sueldo){
        double nuevo_sueldo=sueldo;

        if(tipo_trabajador=="G"){
            for(int i=1;i<=anios;i++){
                if(i%4==0){
                    nuevo_sueldo=nuevo_sueldo*1.18;
                } else {
                    nuevo_sueldo=nuevo_sueldo+nuevo_sueldo*0.14;
                }
            }
        } else {
            for(int i=1;i<=anios;i++){
                if(i%4==0){
                    nuevo_sueldo=nuevo_sueldo*1.12;
                } else {
                    nuevo_sueldo=nuevo_sueldo*1.08;
                }
            }
        }

        return nuevo_sueldo;
    }

    private static double CalculoPorcentajeAumento(int anios, String tipo_trabajador, double sueldo){
        double totalDigitos=Calcular_sueldo_n_anios(anios,tipo_trabajador,sueldo);
        double porInc=((totalDigitos-sueldo)/sueldo)*100;

        return porInc;
    }
}

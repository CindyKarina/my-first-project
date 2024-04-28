import java.util.Scanner;

public class Pregunta4 {
    public static void main(String[] args) {
        int genero, estado_animo, ocupacion;
        double precio;
        String cafe_recomendado;

        Scanner input= new Scanner(System.in);

        System.out.println("\n1=Hombre \n2=Mujer");
        System.out.println("Ingresar el género:");
        genero=input.nextInt();

        System.out.println("\n1=Cansado \n2=Normal \n3=Activo");
        System.out.println("Ingresar el estado de ánimo: ");
        estado_animo=input.nextInt();

        System.out.println("\n1=Trabajador \n2=Estudiante");
        System.out.println("Ingresar la ocupación: ");
        ocupacion=input.nextInt();

        cafe_recomendado=Determinar_cafe_recomendado(genero,estado_animo,ocupacion);
        precio=Calcular_precio(cafe_recomendado);

        System.out.println("Se recomienda tomar un cafe: "+cafe_recomendado);
        System.out.println("El precio a pagar es: S/. "+precio);
    }

    private static String Determinar_cafe_recomendado(int genero, int estado_animo, int ocupacion) {
        String recomendado;

        if (genero == 1) {
            if (estado_animo == 1) {
                if (ocupacion == 1) {
                    recomendado = "expreso";
                } else {
                    recomendado = "expreso";
                }
            } else if (estado_animo == 2) {
                if (ocupacion == 1) {
                    recomendado = "capuchino";
                } else {
                    recomendado = "americano";
                }
            } else{
                if (ocupacion == 1) {
                    recomendado = "latte";
                } else{
                    recomendado = "americano";
                }
            }
        } else {
            if (estado_animo == 1) {
                if (ocupacion == 1) {
                    recomendado = "expreso";
                } else{
                    recomendado = "expreso";
                }
            } else if (estado_animo == 2) {
                if (ocupacion == 1) {
                    recomendado = "capuchino";
                } else{
                    recomendado = "americano";
                }
            } else {
                if (ocupacion == 1) {
                    recomendado = "capuchino";
                } else {
                    recomendado = "latte";
                }
            }

        }

        return recomendado;

    }

    private static double Calcular_precio(String cafe_recomendado){
        double precio;

        if(cafe_recomendado=="expreso"){
            precio=6;
        } else if (cafe_recomendado=="capuchino") {
            precio=9;
        } else if (cafe_recomendado=="latte") {
            precio=10;
        } else{
            precio=8;
        }

        return precio;

    }

}

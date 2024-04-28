public class ejemplo {
    public static void main(String[] args) {
        //WHILE → 1.Se evalúa la condición 2. Se ejecuta el bloque
        //DO WHILE → 1.Se ejecuta el bloque 2. Se evalúa la condición

        //FOR → Nos va a permitir ejecutar un bloque de código de forma repititiva, sabemos la cantidad de iteraciones que se va a realizar.

        for(int numero=9,x=0;x<11;) {
          int resultado=numero*x;
          String mensaje=numero+"*"+x+" = "+ resultado;

            System.out.println(mensaje);
            x++;
        }
    }


}

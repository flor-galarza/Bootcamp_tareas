

public class Main {
    public static void main(String[] args) {


        int resultado;
        resultado = suma(30, 20, 40);

        System.out.println(resultado);

        Coche coche1 = new Coche();
        coche1.PonerPuerta();
        coche1.PonerPuerta();
        System.out.println(coche1.puerta);
    }

    public static int suma(int a, int b, int c){
        return a + b + c;
    }
}
class Coche {
    public int puerta = 0;

    public void PonerPuerta(){
        this.puerta++;
    }
}





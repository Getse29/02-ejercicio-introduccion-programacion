public class App {

    public static void numPositivoONegativo(int numeroIf) {
        System.out.println("Bucle if");

        if (numeroIf == 0)
            System.out.println("El número es 0");
        if (numeroIf > 0)
            System.out.println("El número es positivo");
        if (numeroIf < 0)
            System.out.println("El número es negativo");
    }

    public static void bucleWhile(int numeroWhile) {
        System.out.println("Bucle while");
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }
    }

    public static void bucleDoWhile(int numeroDoWhile) {
        System.out.println("Bucle do while");
        do {
            numeroDoWhile++;
            if (numeroDoWhile == 3)
                System.out.println(numeroDoWhile);
        } while (numeroDoWhile < 3);
    }

    public static void bucleFor(int numeroFor) {
        System.out.println("Bucle for");
        numeroFor = 0;

        for (int i = 0; i <= 3; i++) {
            numeroFor++;
            System.out.println(numeroFor);
        }

    }

    public static void condicionSwitch(String estacion) {
        switch (estacion) {
            case "Primavera":
                System.out.println("Esta en la estación de primavera");
                break;

            case "Verano":
                System.out.println("Esta en la estación de verano");
                break;

            case "Otoño":
                System.out.println("Esta en la estación de otoño");
                break;

            case "Invierno":
                System.out.println("Esta en la estación de invierno");
                break;
            default:
                System.out.println("No es una estación");
                break;
        }
    }

    public static void main(String[] args) throws Exception {

        numPositivoONegativo(-2);
        bucleWhile(-1);
        bucleDoWhile(-1);
        bucleFor(-1);
        condicionSwitch("Primavera");

    }
}

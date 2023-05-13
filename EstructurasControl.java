
public class EstructurasControl {
    public static void main(String[] args) {
    	
    	// if
    	System.out.println("Inicio if");
        int numeroIf = -100;
        if (numeroIf > 0) {
            System.out.println("El número es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es 0");
        }
        System.out.println("Fin if");
        
        // while
        System.out.println("Inicio While");
        int numeroWhile = 0;
        while (numeroWhile < 3) {
        	//numeroWhile = numeroWhile + 1;
            numeroWhile++;
            System.out.println(numeroWhile);            
        }
        System.out.println("Fin While");
        
        // do while
        System.out.println("Inicio do While");
        int numeroDoWhile = 0;
        do {
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        } while (numeroDoWhile < 3);
        System.out.println("Fin do While");
        
        // for
        System.out.println("Inicio for");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
        System.out.println("Fin for");
        
        // switch
        String estacion = "verano";
        switch (estacion) {
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            default:
                System.out.println("No es una estación válida");
        }
    }
}

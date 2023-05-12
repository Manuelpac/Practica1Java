public class SumaEjemplo {
   public static int sumar(int a, int b, int c) {
      return a + b + c;
   }

   public static void main(String[] args) {
      int num1 = 10;
      int num2 = 20;
      int num3 = 30;
      int resultado = sumar(num1, num2, num3);
      
      System.out.println("La suma de " + num1 +" y " + num2 + " y " + num3 + " es el resultado de: " + resultado);
      System.out.println("El resultado de la suma es: " + resultado);
   }
}
   
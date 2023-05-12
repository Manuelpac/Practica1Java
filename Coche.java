
public class Coche {
	   public int numPuertas;

	   public Coche(int numPuertas) {
	      this.numPuertas = numPuertas;
	   }

	   public void aumentarPuertas() {
	      this.numPuertas++;
	   }

	   public int getNumPuertas() {
	      return this.numPuertas;
	   }

	   public static void main(String[] args) {
	      Coche miCoche = new Coche(2);
	      miCoche.aumentarPuertas();
	      System.out.println("Mi coche tiene " + miCoche.getNumPuertas() + " puertas.");
	   }
	}

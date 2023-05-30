
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crear un objeto de la clase Cliente
		Cliente cliente = new Cliente(30, "Juan", "123456789", 5000.0);

		// Mostrar las propiedades del objeto Cliente
		System.out.println(" *** Cliente *** ");
		System.out.println("Edad: " + cliente.edad);
		System.out.println("Nombre: " + cliente.nombre);
		System.out.println("Teléfono: " + cliente.telefono);
		System.out.println("Crédito: " + cliente.getCredito());

		// Crear un objeto de la clase Trabajador
		Trabajador trabajador = new Trabajador(35, "María", "987654321", 3000.0);

		// Mostrar las propiedades del objeto Trabajador
		System.out.println("\n *** Trabajador *** ");
		System.out.println("Edad: " + trabajador.edad);
		System.out.println("Nombre: " + trabajador.nombre);
		System.out.println("Teléfono: " + trabajador.telefono);
		System.out.println("Salario: " + trabajador.getSalario());
	}
}

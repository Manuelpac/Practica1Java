package poo2;

//Clase Main para probar la implementación
public class Main {
	public static void main(String[] args) {
		CocheCRUD cocheCrud = new CocheCRUDImpl();
		cocheCrud.save();
		cocheCrud.findAll();
		cocheCrud.delete();
	}
}
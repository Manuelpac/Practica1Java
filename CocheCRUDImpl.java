package poo2;


//Implementación de la interfaz CocheCRUD
class CocheCRUDImpl implements CocheCRUD {
	@Override
	public void save() {
		System.out.println("Método save() llamado.");
	} 

	@Override
	public void findAll() {
		System.out.println("Método findAll() llamado.");
	}

	@Override
	public void delete() {
		System.out.println("Método delete() llamado.");
	}
}
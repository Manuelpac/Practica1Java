package poo2;

/*
*Definición de la interfaz CocheCRUD
*La interface solo declara metodos no los implementa
*Actua como un contrato, dice lo que hay que ghacer no lo hace
*/
public interface CocheCRUD {

	void save();
	void findAll();
	void delete();
}
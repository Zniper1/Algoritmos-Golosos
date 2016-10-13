package TrabajoPractico;

public class Oferta {
	
	String Nombre;  
	int HorarioInicial;
	int HorarioFinal;
	int Oferta;

	Oferta(String name, int HorarioInic, int HorarioFin, int Dinero)
	{
		this.Nombre = name;
		this.HorarioInicial = HorarioInic;
		this.HorarioFinal = HorarioFin;
		this.Oferta = Dinero;
	}
}

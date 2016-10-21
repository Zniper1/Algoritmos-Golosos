package TrabajoPractico;

public class Oferta {
	
	String Nombre;  
	int HorarioInicial;
	int HorarioFinal;
	int Oferta;

	Oferta(String name, String HorarioInic, String HorarioFin, String Dinero)
	{
		this.Nombre = name;
		this.HorarioInicial = Integer.parseInt(HorarioInic);
		this.HorarioFinal = Integer.parseInt(HorarioFin);
		this.Oferta = Integer.parseInt(Dinero);
	}
	
	public String GetNombre()
	{
		return Nombre;
	}
	
	public int GetHorarioInicial()
	{
		return HorarioInicial;
	}
	
	public int GetHorarioFinal()
	{
		return HorarioFinal;
	}
	
	public int GetOferta()
	{
		return Oferta;
	}
}

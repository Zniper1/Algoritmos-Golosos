package TrabajoPractico;

import java.util.ArrayList;

public class ListaDeOfertas {
	
	ArrayList <Oferta> Licitacion = new ArrayList<Oferta>();
	
	public void AgregarOferta(String nombre, int HorarioInicio, int HorarioFin, int Importe)
	{
		Oferta NuevaOferta = new Oferta(nombre, HorarioInicio, HorarioFin, Importe);
		Licitacion.add(NuevaOferta);
	}

	public void BorrarOferta (int x)
	{
		Licitacion.remove(x);
	}
	
}

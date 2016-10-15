package TrabajoPractico;

import java.util.ArrayList;

public class ListaDeOfertas {
	
	ArrayList <Oferta> Licitacion = new ArrayList<Oferta>();
	
	public void AgregarOferta(String nombre, String HorarioInicio, String HorarioFin, String Importe)
	{
		Oferta NuevaOferta = new Oferta(nombre, HorarioInicio, HorarioFin, Importe);
		Licitacion.add(NuevaOferta);
	}

	public void BorrarOferta (int x)
	{
		Licitacion.remove(x);
	}
	
	public int Tamanio()
	{
		return Licitacion.size();
	}

	public boolean Validaciones(String Nombre,String HorarioInicio, String HorarioFin,String Importe) {
		
		if(HorarioInicio.equals(""))
		{
			return false;
		}
		if(HorarioFin.equals(""))
		{
			return false;
		}
		int Inicio = Integer.parseInt(HorarioInicio);
		int Fin = Integer.parseInt(HorarioFin);
		
		if(Inicio<8 && Inicio>22)
		{
			return false;
		}
		if(Fin<9 && Fin>23)
		{
			return false;
		}
		if(Nombre=="")
		{
			return false;
		}
		if(Importe=="")
		{
			return false;
		}
		
		return true;
	}
	
}

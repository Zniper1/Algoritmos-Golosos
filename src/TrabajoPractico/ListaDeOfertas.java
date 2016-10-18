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
		
		System.out.println("Inicio: " + Inicio);
		System.out.println("Fin: " + Fin);
		if(Inicio<8 || Inicio>22)
		{
			return false;
		}
		if(Fin<9 || Fin>23)
		{
			return false;
		}
		if(Nombre.equals(""))
		{
			return false;
		}
		if(Importe.equals(""))
		{
			return false;
		}
		if(Inicio >=Fin)
		{
			return false;
		}
		if(Fin <=Inicio)
		{
			return false;
		}
		
		
		return true;
	}
	
	public String TipoDeError(String Nombre,String HorarioInicio, String HorarioFin,String Importe)
	{
		if(Nombre.equals(""))
		{
			return "Nombre vacio";
		}
		if(HorarioInicio.equals(""))
		{
			return "Horario Inicio vacio";
		}
		if(HorarioFin.equals(""))
		{
			return "Horario Final vacio";
		}
		int Inicio = Integer.parseInt(HorarioInicio);
		int Fin = Integer.parseInt(HorarioFin);
		
		System.out.println("Inicio: " + Inicio);
		System.out.println("Fin: " + Fin);
		if(Inicio<8 || Inicio>21)
		{
			return "Horario Inicial es de 8 a 21Hs.";
		}
		if(Fin<9 || Fin>22)
		{
			return "Horario Final es de 9 a 22 Hs.";
		}
		if(Importe.equals(""))
		{
			return "Importe Vacio";
		}
		if(Inicio>=Fin)
		{
			return "Horario de Inicio no puede ser mayor o igual que Horario de Finalizacion";
		}
		if(Fin <=Inicio)
		{
			return "Horario de Fin no puede ser menor o igual que Horario de Inicio";
		}
		
		
		return "Error desconocido";
	}
	
	public void EliminarTodo ()
	{
		Licitacion.clear();
	}
	
}

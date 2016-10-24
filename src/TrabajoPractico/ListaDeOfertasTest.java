package TrabajoPractico;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ListaDeOfertasTest {

	@Test
	public void AgregarTest() {
		ListaDeOfertas Listatest = ListadeOferTest();
	}

	@Test
	public void BorrarTest() {
		ListaDeOfertas Listatest = ListadeOferTest();
		Listatest.BorrarOferta(3);
		assertTrue(Listatest.Licitacion.size() == 3);

	}

	@Test
	public void OrdenarArrayTest() {
		ListaDeOfertas Listatest = ListadeOferTest();
		Listatest.OrdenarArray();
		assertTrue(Listatest.Licitacion.get(0).Oferta == 700);
		assertTrue(Listatest.Licitacion.get(3).Oferta == 250);
	}

	@Test
	public void TamañoTest() {
		ListaDeOfertas Listatest = new ListaDeOfertas();
		Listatest.AgregarOferta("Santiago", "10", "15", "300");
		assertTrue(Listatest.Licitacion.size() == 1);
		Listatest.BorrarOferta(0);
		assertTrue(Listatest.Licitacion.size() == 0);

	}
	private ListaDeOfertas ListadeOferTest() {
		ListaDeOfertas Listatest = new ListaDeOfertas();
		Listatest.AgregarOferta("Santiago", "10", "15", "300");
		Listatest.AgregarOferta("Dario", "13", "18", "500");
		Listatest.AgregarOferta("Roberto", "19", "21", "250");
		Listatest.AgregarOferta("Mortadela", "8", "22", "700");
		return Listatest;
	}
}

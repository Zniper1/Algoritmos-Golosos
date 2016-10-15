package TrabajoPractico;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Musica {

	public Clip clip;
	String Archivo; 

	Musica(String Tema)
	{
		Archivo = Tema;
		try{
			clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(getClass().getResource("/Sonidos/" + Archivo + ".wav")));
			clip.start();
		}
		catch (Exception e){
			
		}
	}
	
}

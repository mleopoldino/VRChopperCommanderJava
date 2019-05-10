package tcc.game.engine;

import java.net.URL;

import javax.media.Manager;
import javax.media.MediaLocator;
import javax.media.Player;


public class Sound {
	Player player;
	
   
	
	public Sound(){
		String filename = "assets/sounds/HelicopterSoundEffect.mp3";
		try{
			URL url = this.getClass().getClassLoader().getResource(filename).toURI().toURL();
			MediaLocator locator = new MediaLocator(url);
			player = Manager.createPlayer(locator);
			player.realize();
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public void start(){
		player.start();
	}
	public void stop(){
		player.stop();
	}

}

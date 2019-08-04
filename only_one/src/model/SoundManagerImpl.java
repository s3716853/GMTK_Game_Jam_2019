package model;

import java.io.File;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import model.SoundManager;

public class SoundManagerImpl implements SoundManager{
	
	MediaPlayer mediaPlayer;
	Media media;
	
	public SoundManagerImpl()  {
		new JFXPanel();
		media = null;
		mediaPlayer = null;
	}
	
	public void playEffect(String filename) {
		media = new Media(new File(filename).toURI().toString());
		mediaPlayer = new MediaPlayer(media);
		mediaPlayer.play();
	}
	
	public void playMusic(String filename) {
		stopMusic();
		media = new Media(new File(filename).toURI().toString());
		mediaPlayer = new MediaPlayer(media);
		mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
		mediaPlayer.play();
	}
	
	public void stopMusic() {
		if(mediaPlayer != null && mediaPlayer.getStatus() == MediaPlayer.Status.PLAYING) {
			mediaPlayer.stop();
		}
	}

}

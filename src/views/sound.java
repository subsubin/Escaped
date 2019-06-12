package views;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

class sound_gamestart {

	Clip clip;

	void start(File Sound) {
		try {
			clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();
			clip.loop(5);

			Thread.sleep(clip.getMicrosecondLength() / 1000);
		} catch (Exception e) {
			System.out.println("no file");
		}
	}

	void stop(File Sound) {
		clip.close();
	}
}

class sound_ingame {

	Clip clip;

	void start(File Sound) {
		try {
			clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();
			clip.loop(5);

			Thread.sleep(clip.getMicrosecondLength() / 1000);
		} catch (Exception e) {
			System.out.println("no file");
		}
	}

	void stop(File Sound) {
		clip.close();
	}
}

class game_over {

	Clip clip;

	void start(File Sound) {
		try {
			clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();
			clip.loop(0);

			Thread.sleep(clip.getMicrosecondLength() / 1000);
		} catch (Exception e) {
			System.out.println("no file");
		}
	}

	void stop(File Sound) {
		clip.close();
	}
}
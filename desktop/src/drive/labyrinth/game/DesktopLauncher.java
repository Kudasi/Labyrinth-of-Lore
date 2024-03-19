package drive.labyrinth.game;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import drive.labyrinth.game.Core;

public class DesktopLauncher {

	public static void main (String[] arg) {

		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();

		config.setForegroundFPS(60);
		config.setTitle("Labyrinth of lore");
		config.setWindowedMode(1000, 700);

		new Lwjgl3Application(new Core(), config);

	}

}

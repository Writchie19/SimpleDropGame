package com.mygdx.simpledropgame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.simpledropgame.SimpleDropGame;

public class DesktopLauncher
{
	public static void main (String[] arg)
	{
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Simple Drop Game";
		config.width = 800;
		config.height = 480;
		new LwjglApplication(new SimpleDropGame(), config);
	}
}

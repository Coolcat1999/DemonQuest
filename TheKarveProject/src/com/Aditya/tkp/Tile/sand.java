package com.Aditya.tkp.Tile;

import com.Aditya.tkp.Graphics.Screen;
import com.Aditya.tkp.Graphics.Sprite;

public class sand extends Tile {

	public sand(Sprite sprite) {
		super(sprite);
		// TODO Auto-generated constructor stub
	}
	public void render(int x, int y, Screen screen)
	{
		//Render here
		screen.renderTile(x<<4, y<<4, this);
	}
	

}

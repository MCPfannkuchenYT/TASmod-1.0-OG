package com.minecrafttas.tasmodog;

import java.io.File;

import org.lwjgl.input.Keyboard;

import com.minecrafttas.tasmodog.tools.InfoHud;
import com.minecrafttas.tasmodog.tools.TickrateChanger;

import net.minecraft.client.Minecraft;

/**
 * TASmod main class
 * @author Pancake
 */
public final class TASmod {

	public static final File TAS_DIR = new File("tas");
	
	public static TASmod instance;
	
	private TickrateChanger tickrateChanger;
	private InputContainer inputContainer;
	private InfoHud infoHud;
	private MinecraftWindow minecraftWindow;
	private Minecraft mc;
	
	/**
	 * Initialize TASmod
	 * @param inputContainer Input container
	 * @param minecraftWindow Minecrat window
	 */
	public TASmod(MinecraftWindow minecraftWindow) {
		instance = this;
		this.tickrateChanger = new TickrateChanger();
		this.inputContainer = new InputContainer();
		this.infoHud = new InfoHud();
		this.minecraftWindow = minecraftWindow;
	}
	
	/**
	 * Post Initialize TASmod with Minecraft instance
	 * @param mc Minecraft Instance
	 */
	public void init(Minecraft mc) {
		this.mc = mc;
		
		// initialize input container
		this.inputContainer.init(this);
		
		// initialize info hud
		this.infoHud.init(mc, this);

		// initialize tickrate changer
		this.tickrateChanger.init(mc);
	}
	
	/**
	 * Tick TASmod
	 * @throws Exception TASmod Exception
	 */
	public void tick() {	
		// try to tick input container
		this.inputContainer.tick();
		
		// open info hud on f6 press
		if (KeyboardHelper.isKeyPress(Keyboard.KEY_F6) && this.mc.currentScreen == null)
			this.mc.displayGuiScreen(this.infoHud);
		
		// tick tickrate changer
		this.tickrateChanger.tick();
		
		// fix cursor
		if (this.mc.currentScreen != null)
			this.minecraftWindow.setCursor(MinecraftWindow.DEFAULT_CURSOR);
		else
			this.minecraftWindow.setCursor(MinecraftWindow.BLANK_CURSOR);
	}
	
	/**
	 * Render TASmod
	 */
	public void render() {
		this.tickrateChanger.render();
	}
	
	/**
	 * Get Tickrate Changer instance
	 * @return Tickrate Changer instance
	 */
	public TickrateChanger getTickrateChanger() {
		return this.tickrateChanger;
	}
	
	/**
	 * Get Input Container instance
	 * @return Input Container instance
	 */
	public InputContainer getInputContainer() {
		return this.inputContainer;
	}
	
	/**
	 * Get Info Hud instance
	 * @return Info Hud instance
	 */
	public InfoHud getInfoHud() {
		return this.infoHud;
	}

	/**
	 * Get Minecraft Window instance
	 * @return Minecraft Window instance
	 */
	public MinecraftWindow getMinecraftWindow() {
		return this.minecraftWindow;
	}
	
}
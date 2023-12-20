package gukbapclient.module.render;

import java.awt.Color;

import gukbapclient.Gukbap;
import gukbapclient.clickgui.util.ColorUtil;
import gukbapclient.event.EventTarget;
import gukbapclient.event.events.ClientTickEvent;
import gukbapclient.module.Category;
import gukbapclient.module.Module;

public class RainbowGlint extends Module {
	public static final RainbowGlint INSTANCE = new RainbowGlint();

	private static final Color DEFAULT_COLOR = new Color(128, 64, 204);

	public Color chromaColor = DEFAULT_COLOR;

	public RainbowGlint() {
		super("Rainbow Glint", 0, Category.RENDER);
	}

	public Color getColor() {
		return chromaColor;
	}

	public float hue = 0;

}

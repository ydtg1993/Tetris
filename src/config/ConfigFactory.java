package config;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class ConfigFactory {

	private static GameConfig GAME_CONFIG = null;
	
	static {
		try {
			GAME_CONFIG = new GameConfig();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static GameConfig getGameConfig() {
		return GAME_CONFIG;
	}
}

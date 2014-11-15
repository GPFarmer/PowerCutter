package PowerCutter;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.parabot.environment.api.interfaces.Paintable;
import org.parabot.environment.scripts.Category;
import org.parabot.environment.scripts.Script;
import org.parabot.environment.scripts.ScriptManifest;
import org.parabot.environment.scripts.framework.Strategy;


@ScriptManifest(name = "PowerChopper", 
category = Category.OTHER, 
description = "Will chop any wood and drop it", 
author = "GPFarmer", 
version = 1.0, 
servers = { "Ikov" })

public class PowerChop extends Script implements Paintable{

	 private final ArrayList<Strategy> cookie = new ArrayList<Strategy>();
	

	 public static int tree;
	@Override
	 public boolean onExecute() {	
		tree = Integer.parseInt(JOptionPane.showInputDialog("ENTER TREE ID"));
		cookie.add(new drop());
		cookie.add(new chop());
		cookie.add(new AntiBan());
		provide(cookie);
		return true;
	}


	@Override
	public void paint(Graphics g) {
		g.drawString("Power WoodCutter", 20, 50);
		
	}
	
	
	
}

	
	
	
	


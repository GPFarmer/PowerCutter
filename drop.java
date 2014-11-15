package PowerCutter;

import org.parabot.environment.api.utils.Time;
import org.parabot.environment.input.Keyboard;
import org.parabot.environment.scripts.framework.Strategy;
import org.rev317.min.api.methods.Inventory;

public class drop implements Strategy{
	
	
		@Override
		public boolean activate() {
			return Inventory.isFull();
			
		}

		@Override
		public void execute() {
			Keyboard.getInstance().sendKeys("::empty");
			Time.sleep(100);
			
		}
		
	}


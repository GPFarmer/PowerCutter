package PowerCutter;

import org.parabot.environment.api.utils.Time;
import org.parabot.environment.input.Keyboard;
import org.parabot.environment.scripts.framework.SleepCondition;
import org.parabot.environment.scripts.framework.Strategy;
import org.rev317.min.api.methods.Game;
import org.rev317.min.api.methods.Menu;

public class AntiBan implements Strategy {

	@Override
	public boolean activate() {
        return Game.getOpenBackDialogId() == 368;
    }
	@Override
    public void execute() {
        if (Game.getOpenBackDialogId() == 368) {
    		System.out.println("Anti ban has been activated");
            Menu.sendAction(679, 0, 132, 373);
            Time.sleep(2500, 3500);
            Keyboard.getInstance().sendKeys("10");
            Time.sleep(new SleepCondition() {
            	
                @Override
                public boolean isValid() {
                    return Game.getOpenBackDialogId() == -1;
                }
            }, 3000);
            if (Game.getOpenBackDialogId() == 368) {
            	System.out.println("Anti ban has been activated");
                Menu.sendAction(679, 0, 132, 373);
                Time.sleep(2500, 3500);
                Keyboard.getInstance().sendKeys("15");
                Time.sleep(new SleepCondition() {
                    @Override
                    public boolean isValid() {
                        return Game.getOpenBackDialogId() == -1;
                    }
                }, 3000);
            }
        }
    }
	
	
	
	
}

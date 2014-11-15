package PowerCutter;

import org.parabot.environment.api.utils.Time;
import org.parabot.environment.scripts.framework.Strategy;
import org.rev317.min.api.methods.Inventory;
import org.rev317.min.api.methods.SceneObjects;
import org.rev317.min.api.wrappers.SceneObject;

public class chop implements Strategy{
		
	int tree=PowerChop.tree;
		
		@Override
		public boolean activate() {
			return !Inventory.isFull();
		}

		@Override
		public void execute() {
			

				if (SceneObjects.getNearest(tree) != null)
				{
					
					SceneObject[] get1 = SceneObjects.getNearest(tree);
					
					if(get1!=null)
					{
						get1[0].interact(0);
						 Time.sleep(2000);
					}
				
				}
			}
			
					
			
		}




package pack1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	
	public static void main(String[] args) {
		
		/*
		 * Airtel air = new Airtel(); air.calling(); air.data();
		 */
		
		/*
		 * Vodafone voda = new Vodafone(); voda.calling(); voda.data();
		 */
		
		/*
		 * Sim sim = new Vodafone(); sim.calling(); sim.data();
		 */
		
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("applicationContext.xml"); Airtel air =
		 * context.getBean("air",Airtel.class); air.calling(); air.data();
		 */
		
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("applicationContext.xml"); Vodafone air =
		 * context.getBean("voda",Vodafone.class); air.calling(); air.data();
		 */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Sim sim = context.getBean("sim",Sim.class);
		sim.calling();
		sim.data();
		
		
	}

}

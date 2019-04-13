import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter implements IObservable{


	public static void main(String[] args){
		//THIS IS THE RESUBMITTED VERSION

/*

		ApplicationContext start = new ClassPathXmlApplicationContext("spring-config.xml");
		System.out.println("Spring Config Loaded!");

		UnitStation unitStation = (UnitStation) start.getBean("msg");

		unitStation.postMessage("Hello!!!!!");
*/

		//create subject
		MobileDisplay topic = new MobileDisplay();

		//create observers
		IObserver obj1 = new MobileDisplay("Obj1");
		IObserver obj2 = new MobileDisplay("Obj2");
		IObserver obj3 = new MobileDisplay("Obj3");

		//register observers to the subject
		topic.register(obj1);
		topic.register(obj2);
		topic.register(obj3);

		//attach observer to subject
		((MobileDisplay) obj1).setMobileDisplay(topic);
		((MobileDisplay) obj2).setMobileDisplay(topic);
		((MobileDisplay) obj3).setMobileDisplay(topic);



		//check if any update is available
		obj1.update();

		//now send message to subject
		topic.postMessage("New Message");
	}

	@Override
	public void register(IObserver observer) {

	}

	@Override
	public void unregister(IObserver observer) {

	}

	@Override
	public void notifyObservers() {

	}

	@Override
	public Object getUpdate(IObserver observer) {
		return null;
	}

	public void setStarter(Starter starter) {
		System.out.println("Spring running");
	}
}


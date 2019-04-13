import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter implements IObservable{


	public static void main(String[] args){

		ApplicationContext begin = new ClassPathXmlApplicationContext("spring-config.xml");
		System.out.println("Spring Config Loaded Successfully! Chat Terminated");


		UnitStation unitStation = (UnitStation) begin.getBean("msg");//msg
		unitStation.register(unitStation);
		System.out.println(begin);
		unitStation.notify();
		begin.notify();

		//Test bean which posts a new message and notifies observer
		unitStation.postMessage("Hello!!!!!");
		unitStation.notifyObservers();


		Starter starter = (Starter) begin.getBean("TEST TOPIC");
		starter.register(starter);



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
		//Cast MobileDisplay to obj2
		((MobileDisplay) obj2).postMessage("Hi! This is a new message");

		//now send message to subject
		topic.postMessage("New Message");

		//Creates a Spring AppicationContext
		ApplicationContext start = new ClassPathXmlApplicationContext("spring-config.xml");
		System.out.println("Spring Config Loaded!");

		//Test for another bean instance
		unitStation.postMessage("Hello!!!!!");
		unitStation.notifyObservers();


	}

	@Override
	public void register(IObserver observer) {

	}

	@Override
	public void unregister(IObserver observer) {

	}

	@Override
	public void notifyObservers() {
		System.out.println("notified");

	}

	@Override
	public Object getUpdate(IObserver observer) {
		return null;
	}

	public void setStarter(Starter starter) { //6th message
		System.out.println("Spring running");
	}

	@Override
	public void update() {

	}

	@Override
	public void setIObservable(IObservable iObservable) {

	}
}


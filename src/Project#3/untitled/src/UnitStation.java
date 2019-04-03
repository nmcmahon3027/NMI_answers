import java.util.ArrayList;
import java.util.List;

public class UnitStation implements IObservable {

	private List<IObserver> observers;
	private String message;
	private boolean changed;
	private final Object MUTEX = new Object();

	//A rhetorical station that holds the number of units of obsevers
	public UnitStation(){
		this.observers = new ArrayList<>();
	}

	@Override
	public void register(IObserver iObserver) {
		if(iObserver == null) throw new NullPointerException("Null Observer");
		synchronized (MUTEX) {
			if(!observers.contains(iObserver)) observers.add(iObserver);
		}
	}

	@Override
	public void unregister(IObserver iObserver) {
		synchronized (MUTEX) {
			observers.remove(iObserver);
		}
	}

	@Override
	public void notifyObservers() {
		List<IObserver> observersLocal = null;
		//synchronization is used to make sure any observer registered after message is received is not notified
		synchronized (MUTEX) {
			if (!changed)
				return;
			observersLocal = new ArrayList<>(this.observers);
			this.changed=false;
		}
		for (IObserver iObserver : observersLocal) {
			iObserver.update();
		}

	}

	@Override
	public Object getUpdate(IObserver iObserver) {
		return this.message;
	}

	//method to post message to the topic
	public void postMessage(String msg){
		System.out.println("Message Posted to Topic:"+ msg + " by " + observers);
		this.message=msg;
		this.changed=true;
		notifyObservers();
		System.out.println("Observers have been notified!");
		System.out.println(" Current observers: " + observers.size());

	}

	public void setMessage(UnitStation message) {
		System.out.println("Message Station Loaded: ");
		System.out.println("ID: " + message);
		postMessage("A new message has been posted! ");
	}

	@Override
	public void update() {

	}

	@Override
	public void setIObservable(IObservable iObservable) {

	}
}






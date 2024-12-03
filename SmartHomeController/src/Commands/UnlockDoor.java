package Commands;

import Devices.Lock;

public class UnlockDoor extends Command {
	private Lock lock;
	
	public UnlockDoor(Lock lock) {
		super();
		this.lock = lock;
	}
	@Override
	public void execute() {
		lock.unlock();
		
	}

}

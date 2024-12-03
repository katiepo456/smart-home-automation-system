package Commands;

import Devices.Lock;

public class LockDoor extends Command {
	private Lock lock;
	
	public LockDoor(Lock lock) {
		super();
		this.lock = lock;
	}
	@Override
	public void execute() {
		lock.lock();
		
	}

}

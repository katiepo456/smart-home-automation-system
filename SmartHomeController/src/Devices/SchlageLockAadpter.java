package Devices;

public class SchlageLockAadpter extends Lock{
	SchlageLock lock;

	public SchlageLockAadpter(SchlageLock lock) {
		super();
		this.lock = lock;
	}
	
	public void lock() {
		lock.lock();
		
	}
	
	public void unlock() {
		lock.unlock();
	}
}

package stopwatch;

public class Stopwatch {
private long starttime=0;
private long stoptime=0;
private boolean running;
	public Stopwatch(){
		this.running=false;
	}
	private static final double NANOSECONDS = 1.0E-9;
	/*
	 * start method get time when you start to count.
	 */
	public void start(){
		running = true;
		if(isRunning()==false){
			
		}else{
		starttime = System.nanoTime();
		}
	}
	/*
	 * Stop method is count time when stop.
	 */
	public void stop(){
		if(stoptime==0){
			
		}else{
			stoptime = System.nanoTime();
		}
	}
	/*
	 * @return boolean of running
	 */
	public boolean isRunning(){
		return running;
	}
	/*
	 *Show elapse time.
	 */
	public double getElapsed(){
		if(running=true){
			return (System.nanoTime() - starttime)*NANOSECONDS;	
		}else{
			return (stoptime - starttime)*NANOSECONDS;
		}
	}
		
}

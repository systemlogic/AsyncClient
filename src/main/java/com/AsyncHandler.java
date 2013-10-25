package com;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import com.handler.MyHandler;
import com.systemlogic.Async;
import com.systemlogic.AsyncService;

class MyRunnable implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		AsyncService as = new AsyncService();
		Async async = as.getAsyncPort();

		MyHandler handler = new MyHandler();
		Future<?> resp = async.asyncAddAsync(10, 20,handler);
		try{
		//resp.get(2L, TimeUnit.SECONDS);  //Server Timer > Client Timer
		resp.get(7L, TimeUnit.SECONDS);    //Server Timer < Client Timer
		}catch(Exception e){
			
		}
		int result = handler.getResponse().getReturn();
		System.out.println("Summation of 10+20=" +result);
	}
	
}

public class AsyncHandler {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Thread thread = new Thread(new MyRunnable());
		thread.start();
		System.out.println("Main Thread done with its execution");
		
	}

}

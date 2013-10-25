package com;

import javax.xml.ws.Response;
import com.systemlogic.Async;
import com.systemlogic.AsyncAddResponse;
import com.systemlogic.AsyncService;

public class AsyncTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		AsyncService as = new AsyncService();
		Async async = as.getAsyncPort();
		Response<AsyncAddResponse> response = async.asyncAddAsync(10, 20);
		Thread.sleep(3000);
		AsyncAddResponse asyncResponse = response.get();
		System.out.println(asyncResponse.getReturn());
	}

}

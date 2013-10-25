package com.handler;

import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

import com.systemlogic.AsyncAddResponse;


public class MyHandler implements AsyncHandler<AsyncAddResponse>{
	private AsyncAddResponse output;
	public AsyncAddResponse getResponse(){
		return output;
	}
	public void handleResponse(Response<AsyncAddResponse> res) {
		// TODO Auto-generated method stub
		try{
			output = res.get();
			}catch (Exception e) {
				// TODO: handle exception
			}
	}

}

package com.mian;

import javax.xml.ws.Endpoint;

public class Main {
	public static void main(String[] args) {
		Test test = new Test();
		Endpoint.publish("http://192.168.1.182:1111/test", test);//�����������������ӿ�
		
		UserDao user = new UserDao();
		Endpoint.publish("http://192.168.1.182:2222/user", user);//�����������������ӿ�
	}
}

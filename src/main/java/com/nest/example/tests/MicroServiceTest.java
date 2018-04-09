package com.nest.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.server.HelloResponse;
import com.google.protobuf.Descriptors.Descriptor;
import com.nest.example.client.MyGrpcClient;

public class MicroServiceTest {
	@Test
	public void check() {
		System.out.println("Hey");
		String nombre = "yOU>DS";
		String obj = "greeting: \"Hello"+nombre+"\"\n";
		System.out.println("Hey");
		MyGrpcClient client =  new MyGrpcClient();
		System.out.println("Hey");
		HelloResponse respuesta = client.saludo(nombre);
		String respuestaCast = respuesta.toString();
		Assert.assertEquals(respuestaCast, obj);
		Boolean desc = respuesta.equals(obj);

		//String val = desc.;
		System.out.println(desc);

		//System.out.println(val);
		
	}

}

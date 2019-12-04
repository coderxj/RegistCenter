package com.acme.registcenterserver;

import org.apache.thrift.TException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class RegistCenterServerApplication {

	public static void main(String[] args) throws TException {
		SpringApplication.run(RegistCenterServerApplication.class, args);
	}
}

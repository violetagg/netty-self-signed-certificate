package org.example;

import io.netty.handler.ssl.util.SelfSignedCertificate;

public class Application {
	public static void main(String[] args) throws Exception {
		new SelfSignedCertificate();
	}
}

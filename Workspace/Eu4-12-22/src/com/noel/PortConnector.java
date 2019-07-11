package com.noel;

import java.io.IOException;

public class PortConnector {
	/*
	 * a constructor can throw a Exception
	 */
	public PortConnector(int port)throws IOException{
		if (Math.random() > 0.5) {
			throw new IOException();
			}
		throw new RuntimeException();
		}

}

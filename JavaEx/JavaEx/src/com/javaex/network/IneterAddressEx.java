package com.javaex.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IneterAddressEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 내 ip
		
		
		try {
			InetAddress ip = InetAddress.getLocalHost();
			System.out.println(ip.getHostAddress());
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
		printServerIp("www.google.com");
		printServerIp("www.naver.com");
	}
	private static void printServerIp(String hostName) {
		
		try {
			InetAddress[] remotes = InetAddress.getAllByName(hostName);
			for(InetAddress remote:remotes)
			{
				System.out.println(hostName+" "+remote.getHostAddress());
			}
		}catch (UnknownHostException e) {
			// TODO: handle exception
		}
	}

}

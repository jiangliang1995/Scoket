package com.sxt.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerQQ {
	private ServerSocket serverSocket = null ;
	private Socket socket = null;
	private BufferedReader in = null;
/*	private PrintWriter out = null;*/
	@SuppressWarnings("unused")
	private void mian() throws IOException {
		
	}
	public static void main(String[] args) throws IOException {
		ServerQQ qq = new ServerQQ();
		qq.server();
	}
	public void server() throws IOException{
		 try {
			serverSocket = new ServerSocket(10000);
			socket = serverSocket.accept();
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		/*	out = new PrintWriter(socket.getOutputStream(),true);*/
			String line = in.readLine();
			System.out.println("ƒ˙ ‰»Îµƒ «£∫"+line);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			/*out.close();*/
			in.close();
			socket.close();
		}
		
	}
}

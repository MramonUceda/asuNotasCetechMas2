package mx.com.cetech.encriptar;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import javax.swing.JFrame;

public class Encriptar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cosa = "mario";
		Base64.Encoder encoder = Base64.getEncoder();
		String palabraB = encoder.encodeToString(cosa.getBytes(StandardCharsets.UTF_8));
//
//		System.out.println(palabraB);
//
		Base64.Decoder decoder = Base64.getDecoder();
		byte[] decodeByte = decoder.decode(palabraB);
		System.out.println(decodeByte);
		
		
		
	
		
		
		
		
	}

}
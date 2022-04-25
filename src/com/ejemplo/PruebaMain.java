package com.ejemplo;

public class PruebaMain {
	public static void main(String[] args) {
		int a = 4;
		int b= 6;
		Prueba p = new Prueba();
		String res = queryUserInfo(5,6);
		
		p.sumar(a,b );
		System.out.println("fin del programa");
		}
	
	public static String queryUserInfo(int uId, int age) {
		Prueba p2 = new Prueba();
	    p2.sumar(2, age);
		return "salir del query user info";
	}
	
	public static String noentres() {
		return "aca no debes entrar";
	}
	
}

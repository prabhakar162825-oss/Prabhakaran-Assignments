package com.index.pack;

public class Phone {
	String Modal;
	int Price;


Phone(){
	Modal="Samsung";
	Price=20000;
	
}
void Display() {
	System.out.println("Modal Name: "+Modal);
	System.out.println("Price of the Mobile: "+Price);
}
public static void main(String[] args) {
	Phone P=new Phone();
	P.Display();
}
}

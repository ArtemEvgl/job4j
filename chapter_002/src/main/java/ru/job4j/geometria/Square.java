package ru.job4j.geometria;

/*
  @version $Id$
 * @since 0.1
 */
 
 public class Square implements Shape {
	 @Override
	 public String draw() {
		 String strb = "++++" +
				 "+     +" +
				 "+     +" +
				 "++++";
		 return strb;
	 }
 }
		 
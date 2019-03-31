package ru.job4j.geometria;

/*
  @version $Id$
 * @since 0.1
 */
 
 public class Square implements Shape {
	 @Override
	 public String draw() {
		 StringBuilder strb = new StringBuilder();
		 strb.append("++++");
		 strb.append("+     +");
		 strb.append("+     +");
		 strb.append("++++");
		 return strb.toString();
	 }
 }
		 
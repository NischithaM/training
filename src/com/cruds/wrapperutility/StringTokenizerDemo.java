package com.cruds.wrapperutility;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	static String str = "title=Java: The Complete Reference;" + "author=Schildt;" + "publisher=Osborne/McGraw-Hill;"; 

	public static void main(String[] args) {
	StringTokenizer st = new StringTokenizer(str, "=;");
	while(st.hasMoreTokens()) {
	String s = st.nextToken();
	System.out.println(s);
	}
 }
}



package com.vlad.sort;


public class StringRevers {

	public static void main(String[] args) {
		
		
		String str = "My name is Vladislav";
		System.out.println("Reverse by words:");
		String arr[] = str.split(" ");
		String str1 = "";
		
		int len = str.length();
		
		char[] ch = str.toCharArray();
		int begin = 0;
		int end = ch.length-1;
		char temp;


//***************************************************
//*************Reverse by words**********************
//***************************************************		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
// ******** First way ***************************	
		System.out.println("");
		
		for (int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+ " ");	
		}
		System.out.println("");
		
// ******** The second one *************************					
		for (int i=arr.length-1; i>=0; i--) {
			str1 = str1 + arr[i] + " ";	
		}		
		System.out.println(str1);
		str1 = "";
		
//***************************************************
//*************Reverse by characters*****************
//***************************************************
		
		System.out.println("Reverse by characters:");
		
		for (int i = len-1; i >=0 ; i--) {
			str1 = str1 + str.charAt(i);
		}
		
		System.out.println(str1);
		str1 = "";
		
//****************************************************		
		while(end>begin){
		     temp = ch[begin];
		     ch[begin]=ch[end];
		     ch[end]=temp;
		     end--;
		     begin++;
		}
		str = new String(ch);
		System.out.println(str);
		str = "My name is Vladislav";
		
//**************Using predefined method*************
		
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		
		
	}

}

package com.ticket;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String d1="08/28/2016";
String d2="09/28/2016";
String[] s1=d1.split("/");
String[] s2=d2.split("/");
System.out.println(s1[2].compareTo(s2[2]));
System.out.println(s1[1].compareTo(s2[1]));
for(int i=2;i<s1.length;)
	{
	int count=s1[i].compareTo(s2[i]);
	if(count>=0)
	{	i=i-2;
		count=s1[i].compareTo(s2[i]);
		if(count>=0)
		{
			i++;
			count=s1[i].compareTo(s2[i]);
			if(count>1)
				System.out.println("not expired");
			break;
		}
		else
			{System.out.println("expired");break;}
		}
	else
		System.out.println("expired");
	break;
	}
	}

}

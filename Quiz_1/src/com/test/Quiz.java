package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Quiz {
Scanner sc=new Scanner(System.in);
int correctAnsCount=0;
int wrongAnsCount=0;

	public void logic() {
	Questions q1=new Questions("question:Who invented Java Programming?:",
			"option1:A.Guido van Rossum" ,
			"option2:B.James Gosling", 
			"option3:C.Dennis Ritchie",
			"option4:D.Bjarne Stroustrup");
	
	Questions q2=new Questions("question:Which component is used to compile, debug and execute the java programs?",
			"option1: A.JRE",
			"option2:B. JIT",
			"option3:C.JDK",
			"option4:D.JVM");
	
	Questions q3=new Questions("question:Which of the following is not a Java features?",
			"option1:A.Dynamic",
			"option2:B.Architecture Neutral",
			"option3:C.Use of pointers",
			"option4:D.Object-oriented");
Questions q4=new Questions("question: _____ is used to find and fix bugs in the Java programs.",
		"option1:A.JVM",
		"option2:B.JRE",
		"option3:C.JDK",
		"option4:D.JDB");
	
	Questions q5=new Questions("question:Which method of the Class.class is used to determine the name of a class represented by the class object as a String?",
			"option1:A.getClass()",
			"option2:B.intern()",
			"option3:C.getName()",
			"option4:D.toString()");
	
	
	Map<Questions,Character> hmap=new HashMap<>();
	hmap.put(q1,'B');
	hmap.put(q2, 'C');
	hmap.put(q3, 'C');
	hmap.put(q4, 'D');
	hmap.put(q5, 'C');
	
	
	for(Map.Entry<Questions,Character> map:hmap.entrySet()){
		System.out.println(map.getKey().getQuestion());
		System.out.println(map.getKey().getOption1());
		System.out.println(map.getKey().getOption2());
		System.out.println(map.getKey().getOption3());
		System.out.println(map.getKey().getOption4());
		
		System.out.println("Enter your answer:");
		Character ans=sc.next().charAt(0);
		
		System.out.println();
		System.out.println(".........Result........");
		System.out.println("Total Question:"+hmap.size());
		System.out.println("Correct answered:"+correctAnsCount);
		System.out.println("Wrong answered:"+wrongAnsCount);
		int Percentage=(100*correctAnsCount)/hmap.size();
		System.out.println("Percentage:"+Percentage);
		if(Percentage>95) {
			System.out.println("Performance:Very Good ");
		}else if(Percentage<35){
			System.out.println("Performance:Very low");
		}else {
			System.out.println("Performance:Medium");
		}
		
		
		
		int cans=Character.compare(ans,map.getValue());
		if(cans==0) {
			System.out.println("Correct answer");
			correctAnsCount++;
			
		}else {
			System.out.println("Wrong answer");
			wrongAnsCount++;
		}
		
		
		
	}
	



}
}

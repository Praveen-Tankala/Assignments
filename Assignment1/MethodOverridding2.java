//Problem Statement for the Java Method Overridding 2
/*
When a method in a subclass overrides a method in superclass, it is still possible to call the overridden method using super keyword. If you write super.func() to call the function func(), it will call the method that was defined in the superclass.

You are given a partially completed code in the editor. Modify the code so that the code prints the following text:

Hello I am a motorcycle, I am a cycle with an engine.
My ancestor is a cycle who is a vehicle with pedals.
*/
//solution: From the problem statement we need to use the super to fix the code
import java.util.*;
import java.io.*;


class BiCycle{
	String define_me(){
		return "a vehicle with pedals.";
	}
}

class MotorCycle extends BiCycle{
	String define_me(){
		return "a cycle with an engine.";
	}
	
	MotorCycle(){
		System.out.println("Hello I am a motorcycle, I am "+ define_me());

		String temp=super.define_me(); //add super before define_me
        //it going to invoke immediate parent class method.
        //Then temp will hold "a vechile with pedals in its address"
        
        //This state statement will print the reuired statement to the console 
		System.out.println("My ancestor is a cycle who is "+ temp );
	}
	
}
class MethodOverridding2{
	public static void main(String []args){
		MotorCycle M=new MotorCycle();
	}
}

package com.facebook.view;

import java.util.Scanner;

import com.facebook.controller.FacebookController;
import com.facebook.controller.FacebookControllerInterface;

public class FacebookView {

	public static void main(String[] args) {
		System.out.println("****************MAIN MENU*************");
		System.out.println("press 1 to Sign Up");
		System.out.println("press 2 to Sign In");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice");
		
		int choice=sc.nextInt();
		
		FacebookControllerInterface fc=new FacebookController();
		
		switch(choice) {
		case 1 : fc.createProfileController();
			break;
		case 2 : fc.loginController();
			break;
			default : System.out.println("wrong choice");
		}

	}

}

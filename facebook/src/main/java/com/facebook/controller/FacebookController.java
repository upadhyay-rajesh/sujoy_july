package com.facebook.controller;

import java.util.Scanner;

import com.facebook.entity.FacebookUser;
import com.facebook.service.FacebookService;
import com.facebook.service.FacebookServiceInterface;

public class FacebookController implements FacebookControllerInterface {

	public void createProfileController() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Name");
		String name=sc.next();
		
		System.out.println("Enter Password");
		String password=sc.next();
		
		System.out.println("Enter Email");
		String email=sc.next();
		
		System.out.println("Enter Address");
		String address=sc.next();
		
		//how to transfer data from one layer to other layer?
		//using DTO (data transfer object) design pattern
		//which class Object?
		//entity class object
		
		FacebookUser fuser=new FacebookUser();
		fuser.setName(name);
		fuser.setPassword(password);
		fuser.setEmail(email);
		fuser.setAddress(address);
		
		FacebookServiceInterface fservice=new FacebookService();
		
		int i=fservice.createProfileService(fuser);
		
		if(i>0) {
			System.out.println("Profile created successfully");
		}
		else {
			System.out.println("could not create profile");
		}
		
		
		

	}

	public void loginController() {
		// TODO Auto-generated method stub

	}

}

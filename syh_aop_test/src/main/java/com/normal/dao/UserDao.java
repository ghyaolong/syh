package com.normal.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	public void addUser(){
		System.out.println("addUser");
	}
	public void delUser(){
		System.out.println("delUser");
	}
	public void updateUser(){
		System.out.println("updateUser");
	}
	public void queryUser(){
		System.out.println("queryUser");
	}
}

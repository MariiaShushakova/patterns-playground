package com.epam.byta.patterns.staticfactory;

public class Test {


	public static void main(String[] args) {
		User user = UserFactory.createSimpleUser();
		System.out.println(user.getLastName());

		User user1 = UserFactory.createUserFromLastName("KapaNagendra");
		System.out.println(user1.getLastName());
	}

}

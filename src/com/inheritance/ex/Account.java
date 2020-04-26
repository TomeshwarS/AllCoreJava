package com.inheritance.ex;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Account {

	public Account() {
		// TODO Auto-generated constructor stub
	}

	private Integer id;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + "]";
	}

	public Account(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {

		Account acc1 = new Account(10, "AAA");
		Account acc2 = new Account(20, "BBB");
		Account acc3 = new Account(30, "CCC");

		Comparator<Account> comp = new Comparator<Account>() {
			@Override
			public int compare(Account o1, Account o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};

		List<Account> listAcc = Arrays.asList(acc1, acc2, acc3);

		Collections.sort(listAcc, comp);
		System.out.println(listAcc);

		List<Account> listAcc222 = listAcc.stream().sorted((a1, a2) -> a2.getName().compareTo(a1.getName()))
				.collect(Collectors.toList());
		
		  System.out.printf("listAcc222"+listAcc222);

	}

}

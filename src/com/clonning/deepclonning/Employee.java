package com.clonning.deepclonning;

public class Employee extends Object implements Cloneable {

	private Integer id;
	private String name;

	private Address adreess;

	public Employee() {
		System.out.println("Employee");
	}

	public Employee(Integer id, String name, Address ad) {
		super();
		this.adreess = ad;
		this.id = id;
		this.name = name;
	}

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

	public Address getAdreess() {
		return adreess;
	}

	public void setAdreess(Address adreess) {
		this.adreess = adreess;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee empClone = (Employee) super.clone();
		Address empAddressClone = new Address(this.adreess.pa, this.adreess.pa);
		empClone.setAdreess(empAddressClone);
		return empClone;
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		Address ad = new Address();
		ad.pa = "Kandiwali 11";
		ad.ta = "pune 11 ";
		Employee e1 = new Employee(10, "Tomeshwar 111", ad);

		Employee e2 = (Employee) e1.clone();

		e2.setId(100000);
		System.out.println("e1" + e1 + "add" + e1.adreess);
		
		e2.getAdreess().setPa("PPPPPPPPPPPPPPPPPPPPPPPPPP");
		System.out.println("e2" + e2 + "add" + e2.adreess);

	}
}

package javanew;

public class Pet {
	private String name;
	private int age;
	private int type;


public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getType() {
		return type;
	}


	public void setType(int type) {
		this.type = type;
	}


public  void pet(String name,int age,int type) {
	this.name=name;
	this.age=age;
	this.type=type;
}

}

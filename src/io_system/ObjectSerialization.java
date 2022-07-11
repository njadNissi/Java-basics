package io_system;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectSerialization {
    
    
    public static void main(String[] args) {

	try {
	    Worker worker = new Worker("Anjie", 'M', 23);
	    
	    FileOutputStream fout = new FileOutputStream("src/io_system/worker.dat");
	    ObjectOutputStream oops = new ObjectOutputStream(fout);
	    oops.writeObject(worker);
	} catch (Exception e) {
	    System.out.println("Serialization Failed!");
	    e.printStackTrace();
	}
	    try {
		FileInputStream fis = new FileInputStream("src/io_system/worker.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Worker worker = (Worker) ois.readObject();
		System.out.println(worker);
	    } catch (IOException | ClassNotFoundException e) {
		System.out.println("Deserialization Failed!");
		e.printStackTrace();
	    }
    }

}

class Worker implements Serializable{
	
	private String name;
	private char sex;
	private int age;
	
	Worker(String name, char sex, int age) {
	    super();
	    this.name = name;
	    this.sex = sex;
	    this.age = age;
	}

	public String getName() {
	    return this.name;
	}

	public void setName(String name) {
	    this.name = name;
	}

	public char getSex() {
	    return this.sex;
	}

	public void setSex(char sex) {
	    this.sex = sex;
	}

	public int getAge() {
	    return this.age;
	}

	public void setAge(int age) {
	    this.age = age;
	}

	@Override
	public String toString() {
	    return "Worker [name=" + this.name + ", sex=" + this.sex + ", age=" + this.age + "]";
	}
	
}

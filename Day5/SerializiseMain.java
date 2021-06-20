package com.serialization.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializiseMain {
	public static void main(String[] args) {
		int i;
		Employee[] emp = new Employee[2];

		//SerializiseMain c = new SerializiseMain();
		for (i = 0; i < emp.length; i++) {

			emp[i] = new Employee(); // create array
		}
		for (i = 0; i < emp.length; i++) {
			emp[i].getData();
		}

		System.out.println("Employee Details.....");
		for (i = 0; i < emp.length; i++) {
			emp[i].display();
		}
		List<Employee> obj;
		obj = new ArrayList<Employee>();

		for (i = 0; i < emp.length; i++) {
			obj.add(emp[i]);
		}
		// Let's serialize an Object
		try {
			FileOutputStream fileOut = new FileOutputStream("employeeSerial.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(obj);
			out.close();
			fileOut.close();
			System.out.println("\nSerialization Successful... Checkout your specified output file..\n");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

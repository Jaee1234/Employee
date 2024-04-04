package com.example.demo;

import com.example.demo.model.Employee;
import com.google.gson.Gson;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(1L, "Jaai", "Java Developer");

        // Using Gson to convert User object to JSON string
        Gson gson = new Gson();
        String jsonString = gson.toJson(emp);

        // Printing the JSON string
        System.out.println(jsonString);
		
	}

}

package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department obj = new Department(1, "Books");
		System.out.println(obj);

		Seller seller = new Seller(21, "Flávio", "fgl@xmail.com", 3000.0, new Date(), obj);
		System.out.println(seller);

	}

}

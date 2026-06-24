package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class ProgramDep {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		System.out.println(" * * * TEST 1: department findById * * * ");
		Department dep = departmentDao.findById(3);
		System.out.println(dep);
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		System.out.println("\n * * * TEST 2: seller findAll * * * ");
		List<Department> list = departmentDao.findAll();
		for (Department dp : list) {
			System.out.println(dp);
		}
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		System.out.println("\n * * * TEST 3: department insert * * * ");
		/*
		 * Department dpNew = new Department(null, "Music");
		 * departmentDao.insert(dpNew); System.out.println("Inserted! New id = " +
		 * dpNew.getId());
		 */
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		System.out.println("\n * * * TEST 4: department updade * * * ");
		Department dptUpdade = departmentDao.findById(1);
		dptUpdade.setName("Food");
		departmentDao.update(dptUpdade);
		System.out.println("Update completed");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		System.out.println("\n * * * TEST 5: department delete * * * ");
		System.out.print("Enter id for delete test: ");
		int id = scan.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");

		scan.close();

	}

}

package com.doctorapp.client;

import java.util.Scanner;
import java.util.List;

import com.doctorapp.dao.IDoctorDao;
import com.doctorapp.model.Doctor;
import com.doctorapp.service.DoctorServiceImpl;
import com.doctorapp.service.IDoctorService;

public class Demo {

	public static void main(String[] args) {
		String doctorName;
		int doctorId;
		String speciality;
		int experience;
		double fees;
		IDoctorService doctorService = new DoctorServiceImpl();
		Scanner scanner = new Scanner(System.in);
		try {
			while (true) {
				System.out.println("enter the choice:" + "1.addDoctor" + "2.updateDoctor" + "3.deleteDoctor"
						+ "4.findallDoctors" + "5.findById" + "6.findBySpeciality" + "7.findbyspecialityandexp"
						+ "8.find by speciality and fees" + "9.exit");

				int choice = scanner.nextInt();
				scanner.nextLine();
				switch (choice) {
				case 1:

					System.out.println("enter the Name of the doctor");
					doctorName = scanner.nextLine();
					System.out.println("enter the speciality");
					speciality = scanner.nextLine();
					scanner.nextLine();
					System.out.println("enter the experience ");
					experience = scanner.nextInt();
					System.out.println("enter the fees");
					fees = scanner.nextDouble();
					doctorService.addDoctor(new Doctor(doctorName, speciality, fees, experience));
					System.out.println();
					break;
				case 2:
					System.out.println("enter the doctorId");
					doctorId = scanner.nextInt();
					System.out.println("enter the fees");
					fees = scanner.nextDouble();
					doctorService.updateDoctor(doctorId, fees);
					break;
				case 3:
					System.out.println("ente the doctorId to delete");
					doctorId = scanner.nextInt();
					doctorService.deleteDoctor(doctorId);
					break;
				case 4:
					List<Doctor> doctors = doctorService.getAllDoctors();
					System.out.println("doctors available in libaray");
					doctors.forEach(System.out::println);
					break;
				case 5:
					System.out.println("enter the id");
					doctorId = scanner.nextInt();
					try {
						System.out.println(doctorService.getById(doctorId));
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println();
					break;
				case 6:
					System.out.println("find by speciality");
					speciality = scanner.nextLine();
					try {
						System.out.println(doctorService.getBySpeciality(speciality));
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println();
					break;
				case 7:
					System.out.println("find by speciality and experience");
					System.out.println("enter the speciality");
					speciality = scanner.nextLine();
					System.out.println("enter the experience");
					experience = scanner.nextInt();
					try {
						System.out.println(doctorService.getBySpecialityAndExp(speciality, experience));

					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println();
					break;
				case 8:
					System.out.println("find by speciality and experience");
					System.out.println("enter the speciality");
					speciality = scanner.nextLine();
					System.out.println("enter the fees");
					fees = scanner.nextDouble();
					try {
						System.out.println(doctorService.getBySpecialityAndFees(speciality, fees));
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println();
					break;
				case 9:
					System.exit(0);
					break;
				default:
					break;

				}

			}
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			scanner.close();
		}

	}

}

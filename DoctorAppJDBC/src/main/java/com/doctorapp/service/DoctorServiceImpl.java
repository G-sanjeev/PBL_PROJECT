package com.doctorapp.service;

import java.util.List;
import java.util.stream.Collectors;

import com.doctorapp.dao.DoctorDaoImpl;
import com.doctorapp.dao.IDoctorDao;
import com.doctorapp.exceptions.DoctorNotFoundException;
import com.doctorapp.model.Doctor;

public class DoctorServiceImpl implements IDoctorService {
IDoctorDao doctorDao = new DoctorDaoImpl();
	@Override
	public void addDoctor(Doctor doctor) {
doctorDao.addDoctor(doctor);		
	}

	@Override
	public int updateDoctor(int doctorId, double fees) {
		int result = doctorDao.updateDoctor(doctorId, fees);
		if(result == 0)
			throw new DoctorNotFoundException("there is no doctor exists with"+doctorId);
		return result;
	}

	@Override
	public Doctor getById(int doctorId) {
		Doctor doctor = doctorDao.findById(doctorId);
		if(doctor == null)
			return null;
		return doctor;
	}

	@Override
	public void deleteDoctor(int doctorId) {
		try {
			doctorDao.deleteDoctor(doctorId);
		} catch (Exception e) {
e.printStackTrace();		}
	}

	@Override
	public List<Doctor> getAllDoctors() {
		List<Doctor> doctorList = doctorDao.findAllDoctors()	;
		return doctorList;
		
	}

	@Override
	public List<Doctor> getBySpeciality(String speciality) throws DoctorNotFoundException {
		List<Doctor> doctorList = doctorDao.findBySpeciality(speciality)	;
		if (doctorList.isEmpty())
			throw new DoctorNotFoundException("doctor not found by speciality");
		return doctorList.stream().sorted((o1,o2)->o1.getSpeciality().compareTo(o2.getSpeciality())).collect(Collectors.toList());
	}

	@Override
	public List<Doctor> getBySpecialityAndExp(String speciality, int experience) throws DoctorNotFoundException {
		List<Doctor> doctorList = doctorDao.findBySpecialityAndExp(speciality,experience)	;
		if (doctorList.isEmpty())
			throw new DoctorNotFoundException("doctor not found by speciality and category");
		return doctorList.stream().sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.toList());
	
	}

	@Override
	public List<Doctor> getBySpecialityAndFees(String speciality, double fees) throws DoctorNotFoundException {
		List<Doctor> doctorList = doctorDao.findBySpecialityAndFees(speciality,fees)	;
		if (doctorList.isEmpty())
			throw new DoctorNotFoundException("doctor not found by speciality and fees");
		return doctorList.stream().sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.toList());
	
	}

}

package com.doctorapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.doctorapp.exceptions.DoctorNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.util.DBConnection;
import com.doctorapp.util.Queries;

public class DoctorDaoImpl  implements IDoctorDao{

	@Override
	public void addDoctor(Doctor doctor) {
		try(Connection connection=DBConnection.openConnection();
				PreparedStatement statement = connection.prepareStatement(Queries.INSERTQUERY);) {
			statement.setString(1, doctor.getDoctorName());
			statement.setInt(3, doctor.getExperience());
			statement.setString(2, doctor.getSpeciality());
			statement.setDouble(4, doctor.getFees());
			statement.execute();
		} catch(SQLException e) {
e.printStackTrace();		}
	}

	@Override
	public int updateDoctor(int doctorId, double fees) {
		try (Connection connection=DBConnection.openConnection();
				PreparedStatement statement = connection.prepareStatement(Queries.UPDATEQUERY);){
			statement.setInt(2, doctorId);
			statement.setDouble(1, fees);
			if(statement.execute())
				return 1;
			
		} catch (Exception e) {
		e.printStackTrace();}
		return 0;
	}

	@Override
	public Doctor findById(int doctorId) {
		Doctor doctor = new Doctor();
		try{Connection connection=DBConnection.openConnection();
				PreparedStatement statement = connection.prepareStatement(Queries.DOCTORIDQUERY);
				statement.setInt(1,doctorId);
				ResultSet resultSet = statement.executeQuery();
			
			while(resultSet.next()) {
				String name = resultSet.getString("doctorName");
				int doctorId1 = resultSet.getInt("doctorId");
				String speciality = resultSet.getString("speciality");
				int experience  = resultSet.getInt("experience");
				double fees = resultSet.getDouble("fees");
				doctor.setDoctorName(name);
				doctor.setDoctorId(doctorId1);
				doctor.setSpeciality(speciality);
				doctor.setExperience(experience);
				doctor.setFees(fees);
				return doctor;
			}
		} catch(SQLException e) {
e.printStackTrace();		}
		return null;
		}

	@Override
	public void deleteDoctor(int doctorId) {
		try(Connection connection=DBConnection.openConnection();
				PreparedStatement statement = connection.prepareStatement(Queries.DELETEQUERY);){
			statement.setInt(1, doctorId);
			statement.execute();
		}catch(SQLException e) {
			e.printStackTrace();		}
	}

	@Override
	public List<Doctor> findAllDoctors() {
		List<Doctor> doctorList = new ArrayList<Doctor>();
		try {Connection connection=DBConnection.openConnection();
				PreparedStatement statement = connection.prepareStatement(Queries.GETQUERY);
				ResultSet resultSet = statement.executeQuery();
			while(resultSet.next()) {
				Doctor doctorDao = new Doctor();
				String name = resultSet.getString("doctorName");
				int doctorId1 = resultSet.getInt("doctorId");
				String speciality = resultSet.getString("speciality");
				int experience  = resultSet.getInt("experience");
				double fees = resultSet.getDouble("fees");
				doctorDao.setDoctorName(name);
				doctorDao.setDoctorId(doctorId1);
				doctorDao.setSpeciality(speciality);
				doctorDao.setExperience(experience);
				doctorDao.setFees(fees);
				doctorList.add(doctorDao);
				  
				}
		} catch(SQLException e) {
e.printStackTrace();		}
		return doctorList;
	}

	@Override
	public List<Doctor> findBySpeciality(String speciality) throws DoctorNotFoundException {
		List<Doctor> doctorList = new ArrayList<Doctor>();
		try{Connection connection=DBConnection.openConnection();
				PreparedStatement statement = connection.prepareStatement(Queries.SPECIALITYQUERY);
				statement.setString(1,"%"+speciality+"%");
				ResultSet resultSet = statement.executeQuery();
			while(resultSet.next()) {
				Doctor doctorDao = new Doctor();
				String name = resultSet.getString("doctorName");
				int doctorId1 = resultSet.getInt("doctorId");
				String speciality1 = resultSet.getString("speciality");
				int experience  = resultSet.getInt("experience");
				double fees = resultSet.getDouble("fees");
				doctorDao.setDoctorName(name);
				doctorDao.setDoctorId(doctorId1);
				doctorDao.setSpeciality(speciality1);
				doctorDao.setExperience(experience);
				doctorDao.setFees(fees);
				doctorList.add(doctorDao);			}
		} catch(SQLException e) {
e.printStackTrace();		}
		return doctorList;
	}

	@Override
	public List<Doctor> findBySpecialityAndExp(String speciality, int experience) throws DoctorNotFoundException {
		List<Doctor> doctorList = new ArrayList<Doctor>();
		try{Connection connection=DBConnection.openConnection();
				PreparedStatement statement = connection.prepareStatement(Queries.SPECIALITYANDEXPQUERY);
			statement.setString(1,"%"+ speciality+"%");
			statement.setString(2,"%"+ experience+"%");
			ResultSet resultSet = statement.executeQuery();
			while(resultSet.next()) {
				String name = resultSet.getString("doctorName");
				int doctorId1 = resultSet.getInt("doctorId");
				String speciality1 = resultSet.getString("speciality");
				int experience1  = resultSet.getInt("experience");
				double fees = resultSet.getDouble("fees");
				Doctor doctorDao = new Doctor();
				doctorDao.setDoctorName(name);
				doctorDao.setDoctorId(doctorId1);
				doctorDao.setSpeciality(speciality1);
				doctorDao.setExperience(experience1);
				doctorDao.setFees(fees);
				doctorList.add(doctorDao);	
				}
		} catch(SQLException e) {
e.printStackTrace();		}
		return doctorList;
	}

	@Override
	public List<Doctor> findBySpecialityAndFees(String speciality, double fees) throws DoctorNotFoundException {
		List<Doctor> doctorList = new ArrayList<Doctor>();
		try{Connection connection=DBConnection.openConnection();
				PreparedStatement statement = connection.prepareStatement(Queries.SPECIALITYANDFEES);
			statement.setString(1,"%"+ speciality+"%");
			statement.setDouble(2,fees);
			ResultSet resultSet = statement.executeQuery();
			while(resultSet.next()) {
				Doctor doctorDao = new Doctor();
				String name = resultSet.getString("doctorName");
				int doctorId1 = resultSet.getInt("doctorId");
				String speciality1 = resultSet.getString("speciality");
				int experience1  = resultSet.getInt("experience");
				double fees1 = resultSet.getDouble("fees");
				doctorDao.setDoctorName(name);
				doctorDao.setDoctorId(doctorId1);
				doctorDao.setSpeciality(speciality1);
				doctorDao.setExperience(experience1);
				doctorDao.setFees(fees1);
				doctorList.add(doctorDao);				}
		} catch(SQLException e) {
e.printStackTrace();		}
		return doctorList;
	}

}

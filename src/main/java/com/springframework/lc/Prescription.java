package com.springframework.lc;

import java.util.List;

public class Prescription {

	private Patient3 patient;
	private List<String> medicines;

	public Patient3 getPatient() {
		return patient;
	}

	public void setPatient(Patient3 patient) {
		this.patient = patient;
	}

	public List<String> getMedicines() {
		return medicines;
	}

	public void setMedicines(List<String> medicines) {
		this.medicines = medicines;
	}

	@Override
	public String toString() {
		return "Prescription [patient=" + patient + ", medicines=" + medicines + "]";
	}	
}

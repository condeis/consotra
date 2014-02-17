package com.consotra.dao.model.shared;

import java.util.List;

public class InfoDAO implements Comparable<InfoDAO> {

	private static String nc = "NC";
	private String identifier;
	private String password;
	private String name;
	private String surname;
	private String phoneNumber;
	private String emailAdress;

	@Override
	public int compareTo(InfoDAO info) {

		// TODO Auto-generated method stub
		if (info.identifier.equals(this.identifier)
				&& info.password.equals(this.password))

			return 1;

		return 0;
	}

	public String getIdentifier() {
		return identifier;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

}

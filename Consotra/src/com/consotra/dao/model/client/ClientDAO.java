package com.consotra.dao.model.client;

import java.util.List;
import java.util.Map;

public class ClientDAO {

	private String identifier;
	private String password;
	private String name;
	private String surname;
	private String phoneNumber;
	private List<String> accounts;
	private String emailAdress;

	/**
	 * @param identifier
	 * @param password
	 * @param name
	 * @param surname
	 * @param phoneNumber
	 * @param accounts
	 * @param emailAdress
	 */
	public ClientDAO(String identifier, String password, String name,
			String surname, String phoneNumber, List<String> accounts,
			String emailAdress) {
		super();
		this.identifier = identifier;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.phoneNumber = phoneNumber;
		this.accounts = accounts;
		this.emailAdress = emailAdress;
	}

	/**
	 * @param identifier
	 * @param password
	 * @param name
	 * @param surname
	 * @param phoneNumber
	 * @param accounts
	 */
	public ClientDAO(String identifier, String password, String name,
			String surname, String phoneNumber, List<String> accounts) {
		super();
		this.identifier = identifier;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.phoneNumber = phoneNumber;
		this.accounts = accounts;
	}

	/**
	 * @param identifier
	 * @param password
	 * @param name
	 * @param surname
	 * @param accounts
	 */
	public ClientDAO(String identifier, String password, String name,
			String surname, List<String> accounts) {
		super();
		this.identifier = identifier;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.accounts = accounts;
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

	public List<String> getAccounts() {
		return accounts;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	

}

package com.consotra.dao.model.client;

import java.util.List;

public class AccountDAO {
	
	private long accountNumber;
	private List <OperationDAO> operations;
	private double creditBalance;
	/**
	 * @param accountNumber
	 * @param operations
	 * @param creditBalance
	 */
	public AccountDAO(long accountNumber, List<OperationDAO> operations,
			double creditBalance) {
		super();
		this.accountNumber = accountNumber;
		this.operations = operations;
		this.creditBalance = creditBalance;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public List<OperationDAO> getOperations() {
		return operations;
	}
	public double getCreditBalance() {
		return creditBalance;
	}
	
	

}

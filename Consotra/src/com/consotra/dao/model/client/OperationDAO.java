package com.consotra.dao.model.client;

import java.sql.Date;

/**
 * 
 * @author Ibrahima Sory CONDE
 *
 */
public class OperationDAO {
	public enum OperationType{INCOME,WITHDRAW};
	
	private OperationType operationType; //define if it's an income or withdraw of money
	
	private double amount;
	
	private Date date;

	/**
	 * @param operationType income or withdraw
	 * @param amount 
	 * @param date when operation has been done
	 */
	public OperationDAO(OperationType operationType, double amount, Date date) {
		super();
		this.operationType = operationType;
		this.amount = amount;
		this.date = date;
	}

	public OperationType getOperationType() {
		return operationType;
	}

	public double getAmount() {
		return amount;
	}

	public Date getDate() {
		return date;
	} 
	
	
	
	
}

package com.cg.banking.beans;

public class Transactions {
	private int transactionId,timeStamp,amount;
	private String transactionType,transactionLocation,modeOfTransaction,transactionStatus;
	public Transactions() {}
	public Transactions(int transactionId, int timeStamp, int amount, String transactionType,
			String transactionLocation, String modeOfTransaction, String transactionStatus) {
		super();
		this.transactionId = transactionId;
		this.timeStamp = timeStamp;
		this.amount = amount;
		this.transactionType = transactionType;
		this.transactionLocation = transactionLocation;
		this.modeOfTransaction = modeOfTransaction;
		this.transactionStatus = transactionStatus;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public int getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(int timeStamp) {
		this.timeStamp = timeStamp;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getTransactionLocation() {
		return transactionLocation;
	}
	public void setTransactionLocation(String transactionLocation) {
		this.transactionLocation = transactionLocation;
	}
	public String getModeOfTransaction() {
		return modeOfTransaction;
	}
	public void setModeOfTransaction(String modeOfTransaction) {
		this.modeOfTransaction = modeOfTransaction;
	}
	public String getTransactionStatus() {
		return transactionStatus;
	}
	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}
	
		
	

}

package com.myspace.bank_non_delivered_debit;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Transaction implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String type;
	private java.lang.Integer value;

	private java.lang.Boolean existsInAccount;

	private java.lang.Boolean existsInLog;

	private java.lang.Boolean matchesValue;

	public Transaction() {
	}

	public java.lang.String getType() {
		return this.type;
	}

	public void setType(java.lang.String type) {
		this.type = type;
	}

	public java.lang.Integer getValue() {
		return this.value;
	}

	public void setValue(java.lang.Integer value) {
		this.value = value;
	}

	public java.lang.Boolean getExistsInAccount() {
		return this.existsInAccount;
	}

	public void setExistsInAccount(java.lang.Boolean existsInAccount) {
		this.existsInAccount = existsInAccount;
	}

	public java.lang.Boolean getExistsInLog() {
		return this.existsInLog;
	}

	public void setExistsInLog(java.lang.Boolean existsInLog) {
		this.existsInLog = existsInLog;
	}

	public java.lang.Boolean getMatchesValue() {
		return this.matchesValue;
	}

	public void setMatchesValue(java.lang.Boolean matchesValue) {
		this.matchesValue = matchesValue;
	}

	public Transaction(java.lang.String type, java.lang.Integer value,
			java.lang.Boolean existsInAccount, java.lang.Boolean existsInLog,
			java.lang.Boolean matchesValue) {
		this.type = type;
		this.value = value;
		this.existsInAccount = existsInAccount;
		this.existsInLog = existsInLog;
		this.matchesValue = matchesValue;
	}

}
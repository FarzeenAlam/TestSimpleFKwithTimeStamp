package com.example.demo.model;


import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.jdbc.core.BatchUpdateUtils;

@Entity
@Table(name="fee_log")
public class FeeLog {
	
	@Id
	@Column(name="fee_id")
	private int FeeId;
	
	@Column(name="date_time")
	private Timestamp DateTime;
	
	public Timestamp getDateTime() {
		return DateTime;
	}

	public void setDateTime(Timestamp datetime) {
		DateTime = datetime;
	}

	@Column(name="amount")
	private double amount;
	
	@Column(name="transaction_type")
	private String TransactionType;
	
	@OneToOne
	@JoinColumn(name="student_id", referencedColumnName = "student_id")
	private Student student;
	
	public FeeLog() {
		super();
	}

	public int getFeeId() {
		return FeeId;
	}

	public void setFeeId(int feeId) {
		FeeId = feeId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getTransactionType() {
		return TransactionType;
	}

	public void setTransactionType(String transactionType) {
		TransactionType = transactionType;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "FeeLog [FeeId=" + FeeId +  ", amount=" + amount + ", TransactionType="
				+ TransactionType + ", student=" + student + "]";
	}

	
}

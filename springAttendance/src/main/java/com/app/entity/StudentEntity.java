package com.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="regid")
    private int Regid;

    private String full_name;

    @Column
    private int course_id;

    @Column
    private String course_name;

    @Column
    private int total_course_fees;

    @Column
    private String payment_option;

    @Column
    private int installment_count;

    @Column
    private int amount_pay;

    @Column
    private int pending_amount;

    @Column
    private String payment_type;
    
    @ManyToOne
    @JoinColumn(name = "course_id", referencedColumnName = "course_id",insertable=false, updatable=false)
    private CourseEntity course;

	public int getRegid() {
		return Regid;
	}

	public void setRegid(int regid) {
		Regid = regid;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public int getTotal_course_fees() {
		return total_course_fees;
	}

	public void setTotal_course_fees(int total_course_fees) {
		this.total_course_fees = total_course_fees;
	}

	public String getPayment_option() {
		return payment_option;
	}

	public void setPayment_option(String payment_option) {
		this.payment_option = payment_option;
	}

	public int getInstallment_count() {
		return installment_count;
	}

	public void setInstallment_count(int installment_count) {
		this.installment_count = installment_count;
	}

	public int getAmount_pay() {
		return amount_pay;
	}

	public void setAmount_pay(int amount_pay) {
		this.amount_pay = amount_pay;
	}

	public int getPending_amount() {
		return pending_amount;
	}

	public void setPending_amount(int pending_amount) {
		this.pending_amount = pending_amount;
	}

	public String getPayment_type() {
		return payment_type;
	}

	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}

    // getters and setters
    
    
    
}


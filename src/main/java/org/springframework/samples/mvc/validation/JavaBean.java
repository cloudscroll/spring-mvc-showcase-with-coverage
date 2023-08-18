package org.springframework.samples.mvc.validation;

import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class JavaBean {
	
	@NotNull
	@Max(5)
	private Integer number;

	@NotNull
	@Future
	@DateTimeFormat(iso=ISO.DATE)
	private Date date;

	public Integer getNumber() {
		int a = 0;
		return number;
	}

	public void setNumber(Integer number) {
		int a = 0;
		this.number = number;
	}

	public Date getDate() {
		int a = 0;
		return date;
	}

	public void setDate(Date date) {
		int a = 0;
		this.date = date;
	}

}

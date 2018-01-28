package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {

	private Date date;

	public void setDate(Date date) {
		this.date = date;
	}
	public String generateMessage(String name)
	{
		int hour=0;
		hour=date.getHours();
		if(hour<=12)
			return "GM "+name;
		else if(hour<=16)
			return "GA "+name;
		else if(hour<=20)
		return "GE "+name;
		else
			return "GN "+name;
	}
}

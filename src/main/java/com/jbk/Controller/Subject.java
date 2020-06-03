package com.jbk.Controller;

import org.springframework.stereotype.Component;

@Component
public class Subject {

	private int subId;
	private String subName;
	public Subject() {
		super();
	}
	public Subject(int subId, String subName) {
		super();
		this.subId = subId;
		this.subName = subName;
	}
	public int getSubId() {
		return subId;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + subId;
		result = prime * result + ((subName == null) ? 0 : subName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subject other = (Subject) obj;
		if (subId != other.subId)
			return false;
		if (subName == null) {
			if (other.subName != null)
				return false;
		} else if (!subName.equals(other.subName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Subject [subId=" + subId + ", subName=" + subName + "]";
	}
	
	
}

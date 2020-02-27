package com.cts;

public class Engineer {
String uName;
int regId;

public Engineer(String uName,int regId) {
	this.uName=uName;
	this.regId=regId;
}
void work() {
	System.out.println("Engineer Details : \n Name:" + this.getuName() + ",Id : "+ this.getRedId());

}
public String getuName() {
	return uName;
}
public void setuName(String uName) {
	this.uName = uName;
}
public int getRegId() {
	return regId;
}
public void setRegId(int regId) {
	this.regId = regId;
}

}

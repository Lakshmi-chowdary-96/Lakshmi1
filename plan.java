package com.cg.mobilebilling.beans;

public class plan {
	private float planID,monthlyRental,freeLocalCalls,freeLocalSMS,free StdCalls,freeLocalSMS,freeStdSMS,freeInternetDataUsageUnits,localCallRate,stdCallRate,localSMSRate,stdSMSRate,internetDataUsageRate,planCircle;
	private String planName;
	public plan() {}
	public plan(float planID, float monthlyRental, float freeLocalCalls, float freeLocalSMS, float free,
			String planName) {
		super();
		this.planID = planID;
		this.monthlyRental = monthlyRental;
		this.freeLocalCalls = freeLocalCalls;
		this.freeLocalSMS = freeLocalSMS;
		this.free = free;
		this.planName = planName;
	}
	public float getPlanID() {
		return planID;
	}
	public void setPlanID(float planID) {
		this.planID = planID;
	}
	public float getMonthlyRental() {
		return monthlyRental;
	}
	public void setMonthlyRental(float monthlyRental) {
		this.monthlyRental = monthlyRental;
	}
	public float getFreeLocalCalls() {
		return freeLocalCalls;
	}
	public void setFreeLocalCalls(float freeLocalCalls) {
		this.freeLocalCalls = freeLocalCalls;
	}
	public float getFreeLocalSMS() {
		return freeLocalSMS;
	}
	public void setFreeLocalSMS(float freeLocalSMS) {
		this.freeLocalSMS = freeLocalSMS;
	}
	public float getFree() {
		return free;
	}
	public void setFree(float free) {
		this.free = free;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
		
	
    
}

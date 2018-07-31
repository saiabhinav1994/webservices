package com.HospitalServices.beans;

public class DoctorServices {

	
	private String serviceId;
	private String serviceName;
	private String serviceDescription;
	
	
	public DoctorServices() {
		
	}
	public DoctorServices(String serviceId, String serviceName, String serviceDescription) {
		super();
		this.serviceId = serviceId;
		this.serviceName = serviceName;
		this.serviceDescription = serviceDescription;
	}
	public String getServiceId() {
		return serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getServiceDescription() {
		return serviceDescription;
	}
	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}
	
	
	
	
}

package com.HospitalServices.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.HospitalServices.beans.DoctorServices;

@RestController
public class HospitalControllers {

	@Autowired
	ServiceMethodsForController serviceMethodsForController;

	@RequestMapping("/services")
	public List<DoctorServices> getAllServices() {
		return serviceMethodsForController.getAllServices();
	}

	@RequestMapping("/services/{serviceId}")
	public DoctorServices getService(@PathVariable String serviceId) {
		return serviceMethodsForController.getService(serviceId);
	}

	@RequestMapping(value = "/services", method = RequestMethod.POST)
	public void addNewService(@RequestBody DoctorServices doctorServices) {
		serviceMethodsForController.addNewService(doctorServices);
	}
	@RequestMapping(value = "/services/{serviceId}", method = RequestMethod.PUT)
	public void updateServiceRequired(@RequestBody DoctorServices doctorServices, @PathVariable String serviceId) {
		serviceMethodsForController.updateServiceRequired(serviceId, doctorServices);
	}
	@RequestMapping(value = "/services/{serviceId}", method = RequestMethod.DELETE)
	public void deleteServiceRequired(@PathVariable String serviceId) {
		serviceMethodsForController.deleteServiceRequired(serviceId);
	}
	
	
	
	
	
	
}

package com.HospitalServices.Controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.HospitalServices.beans.DoctorServices;
@Service
public class ServiceMethodsForController {

	//static initialisation of services
	List<DoctorServices> serviceMethods=new ArrayList<>(Arrays.asList(
			new DoctorServices("fever", "varsha", "genral doctor"),
			new DoctorServices("heart specialist", "naveen", "heart specialist")
			));
	
	public List<DoctorServices> getAllServices(){
		return serviceMethods;
	}
	
	public DoctorServices getService(String serviceId) {
		return serviceMethods.stream()
				.filter(s->s.getServiceId()
						.equals(serviceId))
				.findFirst().get();
	}
	
	public void addNewService(DoctorServices doctorServices) {
		serviceMethods.add(doctorServices);
	}

	public void updateServiceRequired(String serviceId, DoctorServices doctorServices) {
		for(int i=0;i<serviceMethods.size();i++) {
			DoctorServices d=serviceMethods.get(i);
			if(d.getServiceId().equals(serviceId)) {
				serviceMethods.set(i, doctorServices);
				return;
		    }
		}	
	}

	public void deleteServiceRequired(String Id) {
		serviceMethods.removeIf(s->s.getServiceId().equals(Id));
			}
	}


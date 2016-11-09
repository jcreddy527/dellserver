package org.arpit.java2blog.bean;

import java.util.*;
import javax.xml.bind.annotation.*;

//@XmlRootElement
@XmlRootElement(name="customer")
@XmlAccessorType(XmlAccessType.FIELD)
public class CustomertMap {

	private Map<String, Student> addressMap; // = new HashMap<String, Student>();

	public Map<String, Student> getAddressMap() {
		return addressMap;
	}

	public void setAddressMap(Map<String, Student> addressMap) {
		this.addressMap = addressMap;
	}

}

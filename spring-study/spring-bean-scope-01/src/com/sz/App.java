package com.sz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sz.service.ParentInterface;


@Service
public class App {
	
	@Autowired
	@Qualifier("parent")
	private ParentInterface parentInterface;
	
	public void proc(){
		parentInterface.service();
	}

	public ParentInterface getParentInterface() {
		return parentInterface;
	}

	public void setParentInterface(ParentInterface parentInterface) {
		this.parentInterface = parentInterface;
	}

	
	
}

package com.yyt.jee;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class HelloBean
 */
@Stateless
@LocalBean
public class HelloBean {

    /**
     * Default constructor. 
     */
	public String from() {
		return "EJB";
	}
//    public HelloBean() {
//        // TODO Auto-generated constructor stub
//    }

}

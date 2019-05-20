package com.truongtd.Util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CountryUntil {

	private static SessionFactory factory;
	public  static final Session session = factory.getCurrentSession();
}

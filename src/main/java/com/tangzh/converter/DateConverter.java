package com.tangzh.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConverter implements Converter<String, Date>{

	@Override
	public Date convert(String arg0) {
		SimpleDateFormat dateFormat =new SimpleDateFormat("yy-MM-dd HH:mm:ss");
		try{
			return dateFormat.parse(arg0);
		}catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

}

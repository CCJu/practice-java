package com.ruanko.bms.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Tools {
	public static String formateDate(Date date){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(date);
	}
}

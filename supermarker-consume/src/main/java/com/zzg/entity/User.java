package com.zzg.entity;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
	private Integer useId;
	
	private String useName;
	
	private String useSex;
	
	private Integer useAge;
	
	private String useIdNo;
	
	private String usePhoneNum;
	
	private String useEmail;
	
	private Date createTime;
	
	private Date modifyTime;
	
	private String useState;
}

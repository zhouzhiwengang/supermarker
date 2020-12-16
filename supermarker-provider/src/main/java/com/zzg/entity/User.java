package com.zzg.entity;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 自增长策略
	private Integer useId;
	
	@Column
	private String useName;
	
	@Column
	private String useSex;
	
	@Column
	private Integer useAge;
	
	@Column
	private String useIdNo;
	
	@Column
	private String usePhoneNum;
	
	@Column
	private String useEmail;
	
	@Column
	private Date createTime;
	
	@Column
	private Date modifyTime;
	
	@Column
	private String useState;
}

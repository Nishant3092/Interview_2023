package com.nishant.model;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class StaffPojo {

 @Id
 private String id;
 
 private String name;
 private String dob;
 private String aadahar;
 private String pan;
 private String collegeName;                                                    
 private String mobileNo;
 private String emailId;
 
 
}

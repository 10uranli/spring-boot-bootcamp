package com.example.hr.domain;

//Entity Class --> Identity 
public class Employee {
	/*domaindeki kavrama kar��l�k gelmiyor, yanl�� model asl�nda.String, double vs..Eksik bir
	  model.Domainde bir �eye kar��l�k gelmiyor.
	  */
//	private String identity;
//	private String fullname;
//	private double salary;
//	private String iban;
//	private int birthYear;
//	private String department;
//	private String jobType;
//	private byte[] photo;
//sub domain kavramlar� �zerinden olusturuyoruz
//domain driven design yoluna giriyoruz.
	private TcKimlikNo identity;
	private FullName fullname;
	private Money salary;
	private Iban iban;
	private BirthYear birthYear;
	private Department department;
	private JobType jobType;
	private Photo photo;
}

package org.zerock.mapper.lecture;

import java.time.LocalDate;
import java.util.Date;

import org.apache.ibatis.annotations.Select;

public interface Mapper01 {
	@Select("SELECT NOW()")
	public String getCurrentTime();
	
	@Select("SELECT CustomerName FROM w3schools.Customers WHERE CustomerId =77")
	public String getCustomerName();
	
	public String getEmployeeName();
	
	public String getProductName();
	
	public double getPrice();
	
	public int getQuantity();
	
	/* public Date getBirthDate(); */
	//java.util.Date 나 java.sql.Date import해서 쓰기보다는 LocalDate 타입 이용해서 하는게 편리
	public LocalDate getBirthDate();
	
}

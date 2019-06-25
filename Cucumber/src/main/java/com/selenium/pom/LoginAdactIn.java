package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAdactIn {
	public WebDriver driver;
	
	public LoginAdactIn(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id=\"username\"]")
	private WebElement userName;
	
	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}
	
	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getLocationOption() {
		return locationOption;
	}

	public WebElement getHotelOption() {
		return hotelOption;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}
	public WebElement getCheckInDateGrtThanCheckOut() {
		return checkInDateGrtThanCheckOut;
	}

	public WebElement getHotelCreekValidate() {
		return hotelCreekValidate;
	}

	public WebElement getChkInDateValidate() {
		return chkInDateValidate;
	}
	public WebElement getRoomValidate() {
		return roomValidate;
	}
	public WebElement getRoomTypeValidate() {
		return roomTypeValidate;
	}
	public WebElement getChkOutDateValidate() {
		return chkOutDateValidate;
	}
	@FindBy(xpath="//input[@id=\"password\"]")
	private WebElement passWord;   
	
	@FindBy(xpath="//input[@id=\"login\"]")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//select[@id=\"location\"]")
	private WebElement locationOption;
	
	@FindBy(xpath="//select[@id=\"hotels\"]")
	private WebElement hotelOption;
	
	@FindBy(xpath="//select[@id=\"room_type\"]")
	private WebElement roomType;
	
	@FindBy(xpath="//select[@id=\"room_nos\"]")
	private WebElement noOfRooms;
	
	@FindBy(xpath="//input[@id=\"datepick_in\"]")
	private WebElement checkInDate;
	
	@FindBy(xpath="//input[@id=\"datepick_out\"]")
	private WebElement checkOutDate;
	
	@FindBy(xpath="//select[@id=\"adult_room\"]")
	private WebElement adultsPerRoom;
	
	@FindBy(xpath="//input[@id=\"Submit\"]")
	private WebElement searchBtn;
	
	
	@FindBy(xpath="//span[text()=\"Check-In Date shall be before than Check-Out Date\"]")
	private WebElement checkInDateGrtThanCheckOut;
	
	@FindBy(xpath="//input[@id=\"hotel_name_0\"]")
	private WebElement hotelCreekValidate;
	
	@FindBy(id="location_0")
	private WebElement locationValidate;
	
	public WebElement getLocationValidate() {
		return locationValidate;
	}
	@FindBy(xpath="//input[@id=\"arr_date_0\"]")
	private WebElement chkInDateValidate;
	
	@FindBy(xpath="//input[@id=\"dep_date_0\"]")
	private WebElement chkOutDateValidate;
	
	@FindBy(id="rooms_0")
	private WebElement roomValidate;
	
	@FindBy(id="room_type_0")
	private WebElement roomTypeValidate;
	
	@FindBy(id="radiobutton_0")
	private WebElement radioButton;

	public WebElement getRadioButton() {
		return radioButton;
	}
		@FindBy(id="total_price_0")
		private WebElement totelPriceValidate;

		public WebElement getTotelPriceValidate() {
			return totelPriceValidate;
		}
		@FindBy(id="no_days_0")
		private WebElement noOfDays;

		public WebElement getNoOfDays() {
			return noOfDays;
		}
		@FindBy(id="total_price_0")
		private WebElement totalPriceGST;

		public WebElement getTotalPriceGST() {
			return totalPriceGST;
		}
		@FindBy(id="continue")
		private WebElement contBtn;

		public WebElement getContBtn() {
			return contBtn;
		}
		@FindBy(id="price_night_0")
		private WebElement pricePerNyt;

		public WebElement getPricePerNyt() {
			return pricePerNyt;
		}
		@FindBy(id="rooms_0")
		private WebElement totalRooms;

		public WebElement getTotalRooms() {
			return totalRooms;
		}
		@FindBy(id="first_name")
		private WebElement frstNameField;

		public WebElement getFrstNameField() {
			return frstNameField;
		}
		@FindBy(id="last_name")
		private WebElement lastNameField;

		public WebElement getLastNameField() {
			return lastNameField;
		}
		@FindBy(id="address")
		private WebElement billAddressField;

		public WebElement getBillAddressField() {
			return billAddressField;
		}
		@FindBy(id="cc_num")
		private WebElement ccNoField;

		public WebElement getCcNoField() {
			return ccNoField;
		}
		@FindBy(xpath="//select[@id=\"cc_type\"]")
		private WebElement ccTypeField;

		public WebElement getCcTypeField() {
			return ccTypeField;
		}
		@FindBy(xpath="//select[@id=\"cc_exp_month\"]")
		private WebElement expryMonth;

		public WebElement getExpryMonth() {
			return expryMonth;
		}
		@FindBy(xpath="//select[@id=\"cc_exp_year\"]")
		private WebElement expryYear;

		public WebElement getExpryYear() {
			return expryYear;
		}
		@FindBy(id="cc_cvv")
		private WebElement ccvNo;

		public WebElement getCcvNo() {
			return ccvNo;
		}
		@FindBy(id="book_now")
		private WebElement bookNowBtn;

		public WebElement getBookNowBtn() {
			return bookNowBtn;
		}
		@FindBy(id="logout")
		private WebElement logoutBtn;

		public WebElement getLogoutBtn() {
			return logoutBtn;
		}
		@FindBy(id="total_rooms")
		private WebElement totalRoomsValid;

		public WebElement getTotalRoomsValid() {
			return totalRoomsValid;
		}
		@FindBy(id="price_night")
		private WebElement pricePerNightValid;

		public WebElement getPricePerNightValid() {
			return pricePerNightValid;
		}
		@FindBy(id="total_price")
		private WebElement totalPriceValid;

		public WebElement getTotalPriceValid() {
			return totalPriceValid;
		}
		@FindBy(id="gst")
		private WebElement gstValid;

		public WebElement getGstValid() {
			return gstValid;
		}
		@FindBy(id="final_price")
		private WebElement finalBilledPriceValid;

		public WebElement getFinalBilledPriceValid() {
			return finalBilledPriceValid;
		}
		@FindBy(id="hotel_name_dis")
		private WebElement hotelNameValidateInBookPage;

		public WebElement getHotelNameValidateInBookPage() {
			return hotelNameValidateInBookPage;
		}
		@FindBy(id="location_dis")
		private WebElement locaValidateInBookPage;

		public WebElement getLocaValidateInBookPage() {
			return locaValidateInBookPage;
		}
		@FindBy(id="room_type_dis")
		private WebElement roomTypeValidInBookPage;

		public WebElement getRoomTypeValidInBookPage() {
			return roomTypeValidInBookPage;
		}
		@FindBy(id="total_days_dis")
		private WebElement totalDayInBookPage;

		public WebElement getTotalDayInBookPage() {
			return totalDayInBookPage;
		}
		@FindBy(id="price_night_dis")
		private WebElement pricePerNightInBookPage;

		public WebElement getPricePerNightInBookPage() {
			return pricePerNightInBookPage;
		}
		@FindBy(id="total_price_dis")
		private WebElement totalPriceInBookPage;

		public WebElement getTotalPriceInBookPage() {
			return totalPriceInBookPage;
		}
		@FindBy(id="room_num_dis")
		private WebElement noOfRoomBookHotel;

		public WebElement getNoOfRoomBookHotel() {
			return noOfRoomBookHotel;
		}
		@FindBy(id="final_price_dis")
		private WebElement finalBillInBookHotel;

		public WebElement getFinalBillInBookHotel() {
			return finalBillInBookHotel;
		}
		@FindBy(id="gst_dis")
		private WebElement gstInBookHotel;

		public WebElement getGstInBookHotel() {
			return gstInBookHotel;
		}
		@FindBy(id="room_num_dis")
		private WebElement twoRoomBookHotel;

		public WebElement gettwoRoomBookHotel() {
			return twoRoomBookHotel;
		}
		@FindBy(xpath="//input[@value=\"Hotel Creek\"]")
		private WebElement hotelBookConfirm;

		public WebElement getHotelBookConfirm() {
			return hotelBookConfirm;
		}
		@FindBy(id="location")
		private WebElement locationBookConfirm;

		public WebElement getLocationBookConfirm() {
			return locationBookConfirm;
		}
		@FindBy(id="room_type")
		private WebElement roomTypeBookConfirm;

		public WebElement getRoomTypeBookConfirm() {
			return roomTypeBookConfirm;
		}
		@FindBy(id="adults_room")
		private WebElement adultBookConfirm;

		public WebElement getAdultBookConfirm() {
			return adultBookConfirm;
		}
		@FindBy(id="children_room")
		private WebElement childrenBookConfirm;

		public WebElement getChildrenBookConfirm() {
			return childrenBookConfirm;
		}
		@FindBy(id="arrival_date")	
		private WebElement checkInBookConfirm;

		public WebElement getCheckInBookConfirm() {
			return checkInBookConfirm;
		}
		@FindBy(id="departure_text")
		private WebElement checkOutBookConfirm;

		public WebElement getCheckOutBookConfirm() {
			return checkOutBookConfirm;
		}
		@FindBy(id="total_rooms")
		private WebElement totalRoomBookConfirm;

		public WebElement getTotalRoomBookConfirm() {
			return totalRoomBookConfirm;
		}
		@FindBy(id="order_no")
		private WebElement orderNoBookConfirm;

		public WebElement getOrderNoBookConfirm() {
			return orderNoBookConfirm;
		}
		
		@FindBy(id="logout")
		private WebElement logoutBookConfirm;

		public WebElement getLogoutBookConfirm() {
			return logoutBookConfirm;
		}
		
		@FindBy(id="my_itinerary")
		private WebElement myItinaryBookConfirm;

		public WebElement getMyItinaryBookConfirm() {
			return myItinaryBookConfirm;
		}
		@FindBy(id="order_id_303625")
		private WebElement orderIdBItinaryPage;

		public WebElement getOrderIdBItinaryPage() {
			return orderIdBItinaryPage;
		}
	}
	

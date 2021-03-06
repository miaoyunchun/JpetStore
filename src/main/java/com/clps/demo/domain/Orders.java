package com.clps.demo.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Orders entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Orders implements java.io.Serializable {

	// Fields

	private Long orderid;
	private Account account;
	private Date orderdate;
	private String shipaddr1;
	private String shipcity;
	private String shipstate;
	private String shipzip;
	private String shipcountry;
	private String billaddr1;
	private String billcity;
	private String billstate;
	private String billzip;
	private String billcountry;
	private String courier;
	private Double totalprice;
	private String billtofirstname;
	private String shiptofirstname;
	private String creditcard;
	private String exprdate;
	private String cardtype;
	private Set lineitems = new HashSet(0);
	private Set orderstatuses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Orders() {
	}

	/** minimal constructor */
	public Orders(Long orderid, Account account, Date orderdate,
			String shipaddr1, String shipcity, String shipstate,
			String shipzip, String shipcountry, String billaddr1,
			String billcity, String billstate, String billzip,
			String billcountry, String courier, Double totalprice,
			String billtofirstname, String shiptofirstname, String creditcard,
			String exprdate, String cardtype) {
		this.orderid = orderid;
		this.account = account;
		this.orderdate = orderdate;
		this.shipaddr1 = shipaddr1;
		this.shipcity = shipcity;
		this.shipstate = shipstate;
		this.shipzip = shipzip;
		this.shipcountry = shipcountry;
		this.billaddr1 = billaddr1;
		this.billcity = billcity;
		this.billstate = billstate;
		this.billzip = billzip;
		this.billcountry = billcountry;
		this.courier = courier;
		this.totalprice = totalprice;
		this.billtofirstname = billtofirstname;
		this.shiptofirstname = shiptofirstname;
		this.creditcard = creditcard;
		this.exprdate = exprdate;
		this.cardtype = cardtype;
	}

	/** full constructor */
	public Orders(Long orderid, Account account, Date orderdate,
			String shipaddr1, String shipcity, String shipstate,
			String shipzip, String shipcountry, String billaddr1,
			String billcity, String billstate, String billzip,
			String billcountry, String courier, Double totalprice,
			String billtofirstname, String shiptofirstname, String creditcard,
			String exprdate, String cardtype, Set lineitems, Set orderstatuses) {
		this.orderid = orderid;
		this.account = account;
		this.orderdate = orderdate;
		this.shipaddr1 = shipaddr1;
		this.shipcity = shipcity;
		this.shipstate = shipstate;
		this.shipzip = shipzip;
		this.shipcountry = shipcountry;
		this.billaddr1 = billaddr1;
		this.billcity = billcity;
		this.billstate = billstate;
		this.billzip = billzip;
		this.billcountry = billcountry;
		this.courier = courier;
		this.totalprice = totalprice;
		this.billtofirstname = billtofirstname;
		this.shiptofirstname = shiptofirstname;
		this.creditcard = creditcard;
		this.exprdate = exprdate;
		this.cardtype = cardtype;
		this.lineitems = lineitems;
		this.orderstatuses = orderstatuses;
	}

	// Property accessors

	public Long getOrderid() {
		return this.orderid;
	}

	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Date getOrderdate() {
		return this.orderdate;
	}

	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}

	public String getShipaddr1() {
		return this.shipaddr1;
	}

	public void setShipaddr1(String shipaddr1) {
		this.shipaddr1 = shipaddr1;
	}

	public String getShipcity() {
		return this.shipcity;
	}

	public void setShipcity(String shipcity) {
		this.shipcity = shipcity;
	}

	public String getShipstate() {
		return this.shipstate;
	}

	public void setShipstate(String shipstate) {
		this.shipstate = shipstate;
	}

	public String getShipzip() {
		return this.shipzip;
	}

	public void setShipzip(String shipzip) {
		this.shipzip = shipzip;
	}

	public String getShipcountry() {
		return this.shipcountry;
	}

	public void setShipcountry(String shipcountry) {
		this.shipcountry = shipcountry;
	}

	public String getBilladdr1() {
		return this.billaddr1;
	}

	public void setBilladdr1(String billaddr1) {
		this.billaddr1 = billaddr1;
	}

	public String getBillcity() {
		return this.billcity;
	}

	public void setBillcity(String billcity) {
		this.billcity = billcity;
	}

	public String getBillstate() {
		return this.billstate;
	}

	public void setBillstate(String billstate) {
		this.billstate = billstate;
	}

	public String getBillzip() {
		return this.billzip;
	}

	public void setBillzip(String billzip) {
		this.billzip = billzip;
	}

	public String getBillcountry() {
		return this.billcountry;
	}

	public void setBillcountry(String billcountry) {
		this.billcountry = billcountry;
	}

	public String getCourier() {
		return this.courier;
	}

	public void setCourier(String courier) {
		this.courier = courier;
	}

	public Double getTotalprice() {
		return this.totalprice;
	}

	public void setTotalprice(Double totalprice) {
		this.totalprice = totalprice;
	}

	public String getBilltofirstname() {
		return this.billtofirstname;
	}

	public void setBilltofirstname(String billtofirstname) {
		this.billtofirstname = billtofirstname;
	}

	public String getShiptofirstname() {
		return this.shiptofirstname;
	}

	public void setShiptofirstname(String shiptofirstname) {
		this.shiptofirstname = shiptofirstname;
	}

	public String getCreditcard() {
		return this.creditcard;
	}

	public void setCreditcard(String creditcard) {
		this.creditcard = creditcard;
	}

	public String getExprdate() {
		return this.exprdate;
	}

	public void setExprdate(String exprdate) {
		this.exprdate = exprdate;
	}

	public String getCardtype() {
		return this.cardtype;
	}

	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}

	public Set getLineitems() {
		return this.lineitems;
	}

	public void setLineitems(Set lineitems) {
		this.lineitems = lineitems;
	}

	public Set getOrderstatuses() {
		return this.orderstatuses;
	}

	public void setOrderstatuses(Set orderstatuses) {
		this.orderstatuses = orderstatuses;
	}

}
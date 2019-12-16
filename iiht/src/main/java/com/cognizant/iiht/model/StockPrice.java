package com.cognizant.iiht.model;
import java.sql.Time;
import java.util.Date;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="StockPrice")
public class StockPrice implements Serializable {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="stock_id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name ="company_id")
	private Company company;
	
	@ManyToOne
	@JoinColumn(name ="stock_exchange_name")
	private StockExchange stockExchange;
	
	@Column(name="stock_price")
	private double stockPrice;
	
	@Column(name="stock_date")
	private Date date;
	
	@Column(name="stock_time")
	private Time time;

	public StockPrice(int id, Company company, StockExchange stockExchange, double stockPrice, Date date, Time time) {
		super();
		this.id = id;
		this.company = company;
		this.stockExchange = stockExchange;
		this.stockPrice = stockPrice;
		this.date = date;
		this.time = time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public StockExchange getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(StockExchange stockExchange) {
		this.stockExchange = stockExchange;
	}

	public double getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + id;
		result = prime * result + ((stockExchange == null) ? 0 : stockExchange.hashCode());
		long temp;
		temp = Double.doubleToLongBits(stockPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StockPrice other = (StockPrice) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (id != other.id)
			return false;
		if (stockExchange == null) {
			if (other.stockExchange != null)
				return false;
		} else if (!stockExchange.equals(other.stockExchange))
			return false;
		if (Double.doubleToLongBits(stockPrice) != Double.doubleToLongBits(other.stockPrice))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}
	
	
	
}

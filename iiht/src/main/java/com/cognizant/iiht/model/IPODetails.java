package com.cognizant.iiht.model;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.*;
import javax.print.attribute.standard.DateTimeAtCompleted;

@Entity
@Table(name="IPO_details")
public class IPODetails {

	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="stock_exchange_name")
	private String stockExchange;
	
	@Column(name="price_per_share")
	private int pricePerShare;
	
	@Column(name="total_shares")
	private int totalNumberOfShares;
	
	@Column(name="open_date")
	private LocalDateTime openDateTime;
	

	
	@Column(name="remarks")
	private String remarks;

	public IPODetails(int id, String companyName, String stockExchange, int pricePerShare, int totalNumberOfShares,
			Date openDate, Time openTime, String remarks) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.stockExchange = stockExchange;
		this.pricePerShare = pricePerShare;
		this.totalNumberOfShares = totalNumberOfShares;
		this.openDate = openDate;
		this.openTime = openTime;
		this.remarks = remarks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}

	public int getPricePerShare() {
		return pricePerShare;
	}

	public void setPricePerShare(int pricePerShare) {
		this.pricePerShare = pricePerShare;
	}

	public int getTotalNumberOfShares() {
		return totalNumberOfShares;
	}

	public void setTotalNumberOfShares(int totalNumberOfShares) {
		this.totalNumberOfShares = totalNumberOfShares;
	}

	public Date getOpenDate() {
		return openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public Time getOpenTime() {
		return openTime;
	}

	public void setOpenTime(Time openTime) {
		this.openTime = openTime;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		result = prime * result + id;
		result = prime * result + ((openDate == null) ? 0 : openDate.hashCode());
		result = prime * result + ((openTime == null) ? 0 : openTime.hashCode());
		result = prime * result + pricePerShare;
		result = prime * result + ((remarks == null) ? 0 : remarks.hashCode());
		result = prime * result + ((stockExchange == null) ? 0 : stockExchange.hashCode());
		result = prime * result + totalNumberOfShares;
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
		IPODetails other = (IPODetails) obj;
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
			return false;
		if (id != other.id)
			return false;
		if (openDate == null) {
			if (other.openDate != null)
				return false;
		} else if (!openDate.equals(other.openDate))
			return false;
		if (openTime == null) {
			if (other.openTime != null)
				return false;
		} else if (!openTime.equals(other.openTime))
			return false;
		if (pricePerShare != other.pricePerShare)
			return false;
		if (remarks == null) {
			if (other.remarks != null)
				return false;
		} else if (!remarks.equals(other.remarks))
			return false;
		if (stockExchange == null) {
			if (other.stockExchange != null)
				return false;
		} else if (!stockExchange.equals(other.stockExchange))
			return false;
		if (totalNumberOfShares != other.totalNumberOfShares)
			return false;
		return true;
	}
	
}

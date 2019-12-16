package com.cognizant.iiht.model;

import  javax.persistence.*;

@Entity
@Table(name="stock_exchange")
public class StockExchange {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="stock_exchange_id")
	private long stockExchangeId;
	
	@Column(name="stock_exchange_name")
	private String stockExchangeName;
	
	@Column(name="brief")
	private String brief;
	
	@Column(name="contact_address")
	private String contactAddress;
	
	@Column(name="remarks")
	private String remarks;
	
	public StockExchange(long stockExchangeId, String stockExchangeName, String brief, String contactAddress,
			String remarks) {
		super();
		this.stockExchangeId = stockExchangeId;
		this.stockExchangeName = stockExchangeName;
		this.brief = brief;
		this.contactAddress = contactAddress;
		this.remarks = remarks;
	}

	public long getStockExchangeId() {
		return stockExchangeId;
	}

	public void setStockExchangeId(long stockExchangeId) {
		this.stockExchangeId = stockExchangeId;
	}

	public String getStockExchangeName() {
		return stockExchangeName;
	}

	public void setStockExchangeName(String stockExchangeName) {
		this.stockExchangeName = stockExchangeName;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getContactAddress() {
		return contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
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
		result = prime * result + ((brief == null) ? 0 : brief.hashCode());
		result = prime * result + ((contactAddress == null) ? 0 : contactAddress.hashCode());
		result = prime * result + ((remarks == null) ? 0 : remarks.hashCode());
		result = prime * result + (int) (stockExchangeId ^ (stockExchangeId >>> 32));
		result = prime * result + ((stockExchangeName == null) ? 0 : stockExchangeName.hashCode());
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
		StockExchange other = (StockExchange) obj;
		if (brief == null) {
			if (other.brief != null)
				return false;
		} else if (!brief.equals(other.brief))
			return false;
		if (contactAddress == null) {
			if (other.contactAddress != null)
				return false;
		} else if (!contactAddress.equals(other.contactAddress))
			return false;
		if (remarks == null) {
			if (other.remarks != null)
				return false;
		} else if (!remarks.equals(other.remarks))
			return false;
		if (stockExchangeId != other.stockExchangeId)
			return false;
		if (stockExchangeName == null) {
			if (other.stockExchangeName != null)
				return false;
		} else if (!stockExchangeName.equals(other.stockExchangeName))
			return false;
		return true;
	}


}

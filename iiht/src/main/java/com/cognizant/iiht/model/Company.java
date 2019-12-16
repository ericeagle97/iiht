package com.cognizant.iiht.model;

import javax.persistence.*;

@Entity
@Table(name="company")
public class Company {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="company_id")
	private int id;

	@Column(name="company_name")
	private String name;
	
	@Column(name="turnOver")
	private long turnOver;
	
	@Column(name="ceo")
	private  String ceo;
	
	@Column(name="board_of_directors")
	private String boardOfDirectors;
	
	@Column(name="listed_in_stock_exchange")
	private boolean listedInStockExchnage;
	
	@Column(name="sector")
	private String sector;
	
	@Column(name="brief_write_up")
	private String briefWriteUp;
	
	@Column(name ="stock_exchange_code")
	private long stockExchangeCode;

	
	public Company(int id, String name, long turnOver, String ceo, String boardOfDirectors,
			boolean listedInStockExchnage, String sector, String briefWriteUp, long stockExchangeCode) {
		super();
		this.id = id;
		this.name = name;
		this.turnOver = turnOver;
		this.ceo = ceo;
		this.boardOfDirectors = boardOfDirectors;
		this.listedInStockExchnage = listedInStockExchnage;
		this.sector = sector;
		this.briefWriteUp = briefWriteUp;
		this.stockExchangeCode = stockExchangeCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getTurnOver() {
		return turnOver;
	}

	public void setTurnOver(long turnOver) {
		this.turnOver = turnOver;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}

	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}

	public boolean isListedInStockExchnage() {
		return listedInStockExchnage;
	}

	public void setListedInStockExchnage(boolean listedInStockExchnage) {
		this.listedInStockExchnage = listedInStockExchnage;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getBriefWriteUp() {
		return briefWriteUp;
	}

	public void setBriefWriteUp(String briefWriteUp) {
		this.briefWriteUp = briefWriteUp;
	}

	public long getStockExchangeCode() {
		return stockExchangeCode;
	}

	public void setStockExchangeCode(long stockExchangeCode) {
		this.stockExchangeCode = stockExchangeCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((boardOfDirectors == null) ? 0 : boardOfDirectors.hashCode());
		result = prime * result + ((briefWriteUp == null) ? 0 : briefWriteUp.hashCode());
		result = prime * result + ((ceo == null) ? 0 : ceo.hashCode());
		result = prime * result + id;
		result = prime * result + (listedInStockExchnage ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sector == null) ? 0 : sector.hashCode());
		result = prime * result + (int) (stockExchangeCode ^ (stockExchangeCode >>> 32));
		result = prime * result + (int) (turnOver ^ (turnOver >>> 32));
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
		Company other = (Company) obj;
		if (boardOfDirectors == null) {
			if (other.boardOfDirectors != null)
				return false;
		} else if (!boardOfDirectors.equals(other.boardOfDirectors))
			return false;
		if (briefWriteUp == null) {
			if (other.briefWriteUp != null)
				return false;
		} else if (!briefWriteUp.equals(other.briefWriteUp))
			return false;
		if (ceo == null) {
			if (other.ceo != null)
				return false;
		} else if (!ceo.equals(other.ceo))
			return false;
		if (id != other.id)
			return false;
		if (listedInStockExchnage != other.listedInStockExchnage)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sector == null) {
			if (other.sector != null)
				return false;
		} else if (!sector.equals(other.sector))
			return false;
		if (stockExchangeCode != other.stockExchangeCode)
			return false;
		if (turnOver != other.turnOver)
			return false;
		return true;
	}

}


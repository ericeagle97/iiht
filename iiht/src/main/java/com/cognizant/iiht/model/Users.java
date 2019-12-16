package com.cognizant.iiht.model;


	import java.io.Serializable;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name = "Users")
	public class Users implements Serializable {
		

		private static final long serialVersionUID = 4599265314096086983L;
		@Id
		@Column(name="user_id")
		private long userId;
		
		@Column(name="user_name")
		private String userName;
		
		@Column(name="password")
		private String password;
		
		@Column(name="email")
		private String email;
		
		@Column(name="user_type")
		private String userType;
		
		@Column(name="mobile")
		private long mobile;
		
		@Column(name="is_blocked")
		private boolean isBlocked;

		public Users(long userId, String userName, String password, String email, String userType, long mobile,
				boolean isBlocked) {
			super();
			this.userId = userId;
			this.userName = userName;
			this.password = password;
			this.email = email;
			this.userType = userType;
			this.mobile = mobile;
			this.isBlocked = isBlocked;
		}

		public long getUserId() {
			return userId;
		}

		public void setUserId(long userId) {
			this.userId = userId;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getUserType() {
			return userType;
		}

		public void setUserType(String userType) {
			this.userType = userType;
		}

		public long getMobile() {
			return mobile;
		}

		public void setMobile(long mobile) {
			this.mobile = mobile;
		}

		public boolean isBlocked() {
			return isBlocked;
		}

		public void setBlocked(boolean isBlocked) {
			this.isBlocked = isBlocked;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((email == null) ? 0 : email.hashCode());
			result = prime * result + (isBlocked ? 1231 : 1237);
			result = prime * result + (int) (mobile ^ (mobile >>> 32));
			result = prime * result + ((password == null) ? 0 : password.hashCode());
			result = prime * result + (int) (userId ^ (userId >>> 32));
			result = prime * result + ((userName == null) ? 0 : userName.hashCode());
			result = prime * result + ((userType == null) ? 0 : userType.hashCode());
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
			Users other = (Users) obj;
			if (email == null) {
				if (other.email != null)
					return false;
			} else if (!email.equals(other.email))
				return false;
			if (isBlocked != other.isBlocked)
				return false;
			if (mobile != other.mobile)
				return false;
			if (password == null) {
				if (other.password != null)
					return false;
			} else if (!password.equals(other.password))
				return false;
			if (userId != other.userId)
				return false;
			if (userName == null) {
				if (other.userName != null)
					return false;
			} else if (!userName.equals(other.userName))
				return false;
			if (userType == null) {
				if (other.userType != null)
					return false;
			} else if (!userType.equals(other.userType))
				return false;
			return true;
		}
		
		

}

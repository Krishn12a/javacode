package org.studyeasy.entity;

public class User {
	
		private int uid;
		private String uname;
		private String gmail;
		
		public User(String uname, String gmail) {
			super();
			
			this.uname = uname;
			this.gmail = gmail;
		}
		
		public int getUid() {
			return uid;
		}
		public void setUid(int uid) {
			this.uid = uid;
		}
		public String getUname() {
			return uname;
		}
		public void setUname(String uname) {
			this.uname = uname;
		}
		public String getGmail() {
			return gmail;
		}
		public void setGmail(String gmail) {
			this.gmail = gmail;
		}

	}


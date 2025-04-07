package com.mbc.pdi_05_01.resultmapscore;

public class ScoreinfoDTO {

		String num;
		String name;
		String phone;
		ResultScoreDTO sdto;
		public ScoreinfoDTO() {
			super();
			// TODO Auto-generated constructor stub
		}
		public ScoreinfoDTO(String num, String name, String phone, ResultScoreDTO sdto) {
			super();
			this.num = num;
			this.name = name;
			this.phone = phone;
			this.sdto = sdto;
		}
		public String getNum() {
			return num;
		}
		public void setNum(String num) {
			this.num = num;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public ResultScoreDTO getSdto() {
			return sdto;
		}
		public void setSdto(ResultScoreDTO sdto) {
			this.sdto = sdto;
		}
		
		
}

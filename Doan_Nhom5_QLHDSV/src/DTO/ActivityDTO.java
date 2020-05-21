package DTO;

import java.sql.Date;

public class ActivityDTO {
	private String actID;
	private String actName;
	private String urlContent;
	private int mark;
	private Date beginDate;
	private Date endDate;
	private String status;
	public ActivityDTO(String actID, String actName, String urlContent, int mark, Date beginDate,
			Date endDate,String status) {
		this.actID = actID;
		this.actName = actName;
		this.urlContent = urlContent;
		this.mark = mark;
		this.beginDate = beginDate;
		this.endDate = endDate;
		this.status =status;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getActID() {
		return actID;
	}
	public void setActID(String actID) {
		this.actID = actID;
	}
	public String getActName() {
		return actName;
	}
	public void setActName(String actName) {
		this.actName = actName;
	}
	public String getUrlContent() {
		return urlContent;
	}
	public void setUrlContent(String urlContent) {
		this.urlContent = urlContent;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public Date getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
}

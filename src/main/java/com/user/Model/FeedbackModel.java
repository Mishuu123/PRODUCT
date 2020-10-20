package com.user.Model;

import com.user.Entity.User;

public class FeedbackModel extends BaseModel {

	
	private String feedback_message;
	private User user;
	public String getFeedback_message() {
		return feedback_message;
	}
	public void setFeedback_message(String feedback_message) {
		this.feedback_message = feedback_message;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	

}

package test;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import model.People;

public class login extends ActionSupport implements ModelDriven<People> {
	private People p=new People();
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(p.getUsername());
		return SUCCESS;
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		if(p.getUsername().equals(""))
			this.addFieldError("username", "name不能为空");
	}

	@Override
	public People getModel() {
		// TODO Auto-generated method stub
		return p;
	}
	
}

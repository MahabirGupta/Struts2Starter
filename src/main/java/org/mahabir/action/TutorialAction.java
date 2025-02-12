package org.mahabir.action;

public class TutorialAction {
	
//	create the execute method
	public String execute(){
		System.out.println("Hello from execute method");
		return "success";
		
	}

}
//
//import com.opensymphony.xwork2.ActionSupport;
//
//public class TutorialAction extends ActionSupport {
//
//    @Override
//    public String execute() {
//        System.out.println("Hello from execute method");
////        return "success";
//        return SUCCESS;
//    }
//}
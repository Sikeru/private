package sec04.ex02;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class Loginlmpl implements HttpSessionListener {
	String user_id;
	String user_pw;
	static int total_user = 0;
	
    public Loginlmpl() {
    }
    
    public Loginlmpl(String user_id, String user_pw) {
		super();
		this.user_id = user_id;
		this.user_pw = user_pw;
	}

	public void sessionCreated(HttpSessionEvent arg0)  { 
         System.out.println("���� ����");
         ++total_user;
    }

    public void sessionDestroyed(HttpSessionEvent arg0)  { 
    	System.out.println("���� �Ҹ�");
        --total_user;
    }
	
}
/**
 * 
 */
package loginservlets.loginbean;

import java.io.Serializable;
import com.netmind.models.LoginBean;


/**
 * @author Cheny
 *
 */
public class loginbean implements Serializable {

	/**
	 * 
	 */
	public loginbean() {
		// TODO Auto-generated constructor stub
		
	
		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
				String name = request.getParameter("name");
				String password = request.getParameter("password");


	
		
		
	}

}

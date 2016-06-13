package dao;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
 
@Path("/hello")
public class CustomerDao {
 
	@GET
	@Path("/{param}")
	public String getMsg(@PathParam("param") String msg) {
 
//		String output = "Jersey say : " + msg;
		Map<String,Integer> m=new HashMap<String,Integer>();
		m.put(msg, 1);
		return msg;
 
	}
 
}

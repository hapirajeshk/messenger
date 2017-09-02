package com.nt.webservice.Messenger;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/par")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class MyParam {
	
	@GET
	@Path("anno")
	public String testParam(@MatrixParam("year")String year,@HeaderParam("custom")String num){
		return year+" "+num;
	}

}

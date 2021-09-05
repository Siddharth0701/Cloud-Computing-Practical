<%-- 
    Document   : index
    Created on : Sep 5, 2021, 11:16:35 AM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello Siddharth Singh!</h1>
            <%-- start web service invocation --%><hr/>
    <%
    try {
	com.unique.CalculatorSer_Service service = new com.unique.CalculatorSer_Service();
	com.unique.CalculatorSer port = service.getCalculatorSerPort();
	 // TODO initialize WS operation arguments here
	int i = 200;
	int j =  100;
	// TODO process result here
	int result = port.add(i, j);
	out.println("Addition of "+i+" and "+j+" number using WebServices = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	com.unique.CalculatorSer_Service service = new com.unique.CalculatorSer_Service();
	com.unique.CalculatorSer port = service.getCalculatorSerPort();
	 // TODO initialize WS operation arguments here
	int i = 200;
	int j = 100;
	// TODO process result here
	int result = port.sub(i, j);
	out.println("Subtraction  of "+i+" and "+j+" number using WebServices = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

        
    </body>
</html>

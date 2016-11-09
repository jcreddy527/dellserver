<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h2>Add Student</h2>
 
<form:form action="employees.html" method="post" commandName="employee">

	<table>
	<%-- <tr>
		<td><form:label path="sid">SID</form:label></td>
		<td><form:input path="sid" class="form-control"/></td> 
	</tr> --%>
	<tr>
		<td><form:label path="name">employee Name</form:label></td>
		<td><form:input path="name" /></td>
		
	</tr>
	<tr>
		<td><form:label path="email">Email</form:label></td>
		<td><form:input path="email" /></td>
		
	<tr>
		<td><form:label path="password">Password</form:label></td>
		<td><form:input path="password" /></td>
	
	</tr>
	<tr>
		<td><form:label path="phone">phone</form:label></td>
		<td><form:input path="phone" /></td>
	
	</tr>
	<tr>
		<td><form:label path="doj">doj</form:label></td>
		<td><form:input path="doj" /></td>
	
	</tr>
	<tr>
		<td><form:label path="deptname">deptname</form:label></td>
		<td><form:input path="deptname" /></td>
	
	</tr>
	<tr>
		<td><form:label path="city">city</form:label></td>
		<td><form:input path="city" /></td>
	
	</tr>
		<tr>
		<td><form:label path="state">state</form:label></td>
		<td><form:input path="state" /></td>
	
	</tr>
		<tr>
		<td><form:label path="pincode">pincode</form:label></td>
		<td><form:input path="pincode" /></td>
	
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="Add employeee"/>
		</td>
	</tr>
</table>	
	
</form:form>


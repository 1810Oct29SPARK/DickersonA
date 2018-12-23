/**
 * 
 */
let employee = {};
window.onload = function(){
	populateUser();
	
}

function populateUser(){
	//send a GET request to localhost:7001/SessionMgmtDemo/session
	fetch("http://localhost:7001/Project1/session").then(function(response){
		console.log(response.json);
		return response.json();
		
	}).then(function(data){
		console.log(data);
		//check whether there was a valid session returned
		//define behavior for no user returned
		if(data.session === null){
			console.log(data);
			
		
			
		}else{
			//define behavior for user is returned
			employee = data;
			document.getElementById("Employeeid").innerText = "Employeeid: " + employee.empid;
			document.getElementById("FirstName").innerText = "First Name: " + employee.firstname;
			document.getElementById("LastName").innerText = "Last Name: " + employee.lastname;
			document.getElementById("CompanyPosition").innerText = "Position: "+ employee.pos
			document.getElementById("EmployeeManager").innerText = "Reportsto: " + employee.repto;
		}
	});
	
}
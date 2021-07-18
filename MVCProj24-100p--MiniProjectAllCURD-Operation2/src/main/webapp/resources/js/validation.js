function validate(frm){
	  
	//empty the previous errorm message
	document.getElementById("nameErr").innerHTML="";
	document.getElementById("addrsErr").innerHTML="";
	document.getElementById("aadharNoErr").innerHTML="";
	document.getElementById("ageErr").innerHTML="";
	document.getElementById("vaccineNameErr").innerHTML="";
	document.getElementById("incomeErr").innerHTML="";
	
	//read form data
	let  name=frm.name.value;
	let  addrs=frm.addrs.value;
	let  aadharNo=frm.aadharNo.value;
	let  age=frm.age.value;
	let  vaccineName=frm.vaccineName.value;
	let  income=frm.income.value;
	let  flag=true;
	
	 //change  hidden box value "yes" indicating the client side JS validations are performed
      frm.vflag.value="yes";
	
	//write form validation logic (client side)
	if(name==""||name==null||name.length==0){
		document.getElementById("nameErr").innerHTML="<b>name is required</b>";
		frm.name.focus();
		flag=false;
	}
	else if(name.length<5){
		document.getElementById("nameErr").innerHTML="<b>name must have  minimun of 5 chars</b>";
		frm.name.focus();
		flag=false;
	}
	
	if(addrs==""||addrs==null||addrs.length==0){
		document.getElementById("addrsErr").innerHTML="<b>addrs is required</b>";
		frm.addrs.focus();
		flag=false;
	}
	else if(addrs.length<5){
		document.getElementById("addrsErr").innerHTML="<b>addrs must have  minimun of 5 chars</b>";
		frm.addrs.focus();
		flag=false;
	}
	
	
	if(aadharNo==""||aadharNo==null||aadharNo.length==0){
		document.getElementById("aadharNoErr").innerHTML="<b>adharNo is required</b>";
		frm.aadharNo.focus();
		flag=false;
	}
	else if(isNaN(aadharNo)){
		document.getElementById("aadharNoErr").innerHTML="<b>aadharNo must be numeric value </b>";
		frm.aadharNo.focus();
		flag=false;
	}
	else if(aadharNo.length!=12){
		document.getElementById("aadharNoErr").innerHTML="<b>aadharNo must have  exact 12 digits</b>";
		frm.aadharNo.focus();
		flag=false;
	}
	if(age==""||age==null||age.length==0){
		document.getElementById("ageErr").innerHTML="<b>age required</b>";
		frm.age.focus();
		flag=false;
	}
	else if(isNaN(age)){
		document.getElementById("ageErr").innerHTML="<b>age must be inter value</b>";
		frm.age.focus();
		flag=false;
	}
	
	if(vaccineName==""||vaccineName==null||vaccineName.length==0){
		document.getElementById("vaccineNameErr").innerHTML="<b>vaccinne name must be selected</b>";
		frm.vaccineName.focus();
		flag=false;
	}
	
	if(income==""||income==null||income.length==0){
		document.getElementById("incomeErr").innerHTML="<b>income is required</b>";
		frm.income.focus();
		flag=false;
	}
	else if(isNaN(income)){
		document.getElementById("incomeErr").innerHTML="<b>income must be numeric value </b>";
		frm.income.focus();
		flag=false;
	}
	else if(income<1000 || income>1000000){
		document.getElementById("incomeErr").innerHTML="<b>income must be there in the range 1 through 100000</b>";
		frm.income.focus();
		flag=false;
	}
	
  return flag;
}//function
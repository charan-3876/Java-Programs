function validateMobileNumber()
{
	var mobile=document.sir.mnum.value
	var mobileLen=mobile.length
	if(mobileLen==10)
	{
		document.sir.mnum.style.borderColor="green"
		document.sir.pwd.focus()
	}
	else
	{
		document.sir.mnum.style.borderColor="red"
		document.sir.mnum.focus()
    }
}
function validatePassword()
{
	var password=document.sir.pwd.value
	var passwordLen=password.length
	if(passwordLen<4)
	{
		document.getElmentById("qwerty").innerHTML="Password is weak"
	}
	else if(passwordLen>=4 && passwordLen<=6)
	{
		document.getElmentById("qwerty").innerHTML="Password is medium"
	}
	else
	{
		document.getElmentById("qwerty").innerHTML="Password is strong"
	}
}
	
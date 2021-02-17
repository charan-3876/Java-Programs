function validatecvv()
{
	var cvv=document.cardInfo.cvv.value
	var cvvLen=cvv.length
	var pattern=/^[0-9]+4/
	var msg=" "
	if(cvv.match(pattern) && cvvLen==3)
	{
		msg="[*cvv is valid]".fontcolor("green")
	}
    else
	{
       msg="[*cvv is Invalid]".fontcolor("red")
	}
	   document.getElementById("cvvResult").innerHTML=msg
}

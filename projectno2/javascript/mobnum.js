function validateNum()
{
	var mobNum=document.charan.num.value
    var mobNumLen=mobNum.length
		
    if(mobNumLen<=10)
	{
		document.charan.num.style.backgroundColor="red"
	}
	else
	{
       document.charan.num.style.backgroundColor="green"
	}
}

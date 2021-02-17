function add()
{
	var num1=document.charan.number1.value
	var num2=document.charan.number2.value
	var sum=num1*1+num2*1
	document.getElementById("result").innerHTML="sum of "+num1+","+num2+"is:"+sum
}
function sub()
{
	var num1=document.charan.number1.value
	var num2=document.charan.number2.value
	var sub=(num1-num2)
	document.getElementById("result").innerHTML="subtraction of "+num1+","+num2+"is:"+sub
}
function mul()
{
	var num1=document.charan.number1.value
	var num2=document.charan.number2.value
	var mul=(num1*num2)
	document.getElementById("result").innerHTML="Multiplication is "+num1+","+num2+"is:"+mul
}
	function div()
{
	var num1=document.charan.number1.value
	var num2=document.charan.number2.value
	var div=num1/num2
	document.getElementById("result").innerHTML="Division of "+num1+","+num2+"is:"+div
}

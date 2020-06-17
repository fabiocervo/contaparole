<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="sceltaAzione" method="post">

		<input type="radio" value="contaParole" id="scelta" name="scelta">
		<label for="contaParole">Conta le parole</label> <br> 
		<input type="radio" value="contaVocali" id="scelta" name="scelta">
		<label for="contaVocali">Conta le Vocali</label> <br> 
		<input type="radio" value="contaConsonanti" id="scelta" name="scelta">  
		<label for="contaConsonanti">Conta le Consonanti</label> <br> 
		<input type="submit" value="Scegli operazione">
		<input type="hidden" name="frase" value= "${frase}"/>
	</form>
</body>
</html>
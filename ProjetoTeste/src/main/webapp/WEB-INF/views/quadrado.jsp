<!DOCTYPE html>
<html>
<head>
    <link href="https://fonts.googleapis.com/css?family=Iceland&display=swap" rel="stylesheet">
    <style type="text/css">
        body{ 
            background: rgb(0,77,154); 
            text-align: center; 
            font-family: 'Iceland', cursive;
            font-size: 20px;
        }

        h1{
            color:rgb(239,205,0);     
        }
        h2{
        	color:rgb(62,215,62);
        }
        p{
            color: white;
        }
        .button3 {
  			background-color: white; 
  			color: black; 
  			border: 2px solid #f44336;
		}

		.button3:hover {
 		 background-color: #f44336;
  		 color: white;
		}

    </style>
    <meta charset="utf-8">
    <title>C.S Calcula</title>
</head>
	<body>
	<h1>Quadrado de um número</h1>		
	<form>
    <p>Informe um número: <input type="number" name="numA" value="${numA}" /></p>
    
   <input type="hidden" name="enviando" value="1" />
    <p>
    <input class="button button3" style="font-size: 20px; font-family: 'Iceland', cursive;" type="submit" value="Calcular..."/></p>
</form>
<div> <h2> Resultado: ${resultado}</h2> </div>	
<br><br><br>		
<a href="http://localhost:8080/ProjetoTeste"><h1>Página Inicial</h1></a>
	</body>
	
</html>
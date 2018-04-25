window.onload = function(){
	div1 = document.getElementById("lancamento");
	div1.classList.add("escondido");

	var bntAdicionar = document.getElementById("btAdicionar");
	bntAdicionar.onclick = mostradiv;


}

function mostradiv(){
div1.classList.remove("escondido");


}
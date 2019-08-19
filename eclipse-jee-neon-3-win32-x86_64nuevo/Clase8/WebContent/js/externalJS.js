function helloWorld(){
	console.log("Hola Mundo");
}
function select(id){
	var element;
	
	element = document.getElementById(id);
	console.log('El valor es: '+element.value)
}

function seleccion(valor){
	
	console.log('Valor: '+valor);
}

function llenarInfo(){
	var element;
	element=document.getElementById('info');
	element.setAttribute('stye','background-color: black; color: white');
	element.innerHTML="Debes llenar el campo para buscar por incidencias.";
}

function llenarSelect(){
	var element;
	element = document.getElementById('info');
	element.setAttribute('style','background-color: pink;');
	element.innerHTML="Deberias seleccionar una opcion";
	
}
function clearInfo(){
	
	var element;
	element=document.getElementById('info');
	element.removeAttribute('style');
	element.innerHTML="";
}


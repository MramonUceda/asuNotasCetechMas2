<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge; charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1"> 
		<title>Registro Alumnos</title>
		<meta name="description" content="Formulario de registro de nuevos alumnos" />
		<meta name="keywords" content="registro, alumnos, nuevos, cetech" />
		<meta name="author" content="Cetech" />
		<link rel="shortcut icon" href="../favicon.ico">
		<link rel="stylesheet" type="text/css" href="css/normalize.css" />
		<link rel="stylesheet" type="text/css" href="css/demo.css" />
		<link rel="stylesheet" type="text/css" href="css/component.css" />
		<link rel="stylesheet" type="text/css" href="css/cs-select.css" />
		<link rel="stylesheet" type="text/css" href="css/cs-skin-boxes.css" />
		<script src="js/modernizr.custom.js"></script>
</head>
<body>
<div class="container">

			<div class="fs-form-wrap" id="fs-form-wrap">
				<div class="fs-title">
					<h1>CETECH - REGISTRO de ALUMNOS</h1>
					     <%
	if(request.getAttribute("correcto")!=null && request.getAttribute("correcto").equals("Si"))
	{
		%>
<!-- 		<div class="divAlertaCorrecto"> -->
			<h1><%=request.getAttribute("mensajeGeneral")%></h1>
<!-- 		</div> -->
		<%
	}
	if(request.getAttribute("correcto")!=null && request.getAttribute("correcto").equals("No"))
	{
		%>
<!-- 		<div class="divAlertaError"> -->
			<h1><%=request.getAttribute("mensajeGeneral")%></h1>
<!-- 		</div> -->
		<%
	}
	%>
					<div class="codrops-top">
						<a class="codrops-icon codrops-icon-prev" href="#"><span>Anterior</span></a>
						<a class="codrops-icon codrops-icon-drop" href="http://cetech.com.mx"><span>Ir a Cetech</span></a>
						<a class="codrops-icon codrops-icon-info" href="#"><span>Toda esta informacion es confidencial</span></a>
					</div>
				</div>
				<form action="validandoFormulario" method="post" id="myform" class="fs-form fs-form-full" autocomplete="off">
					<ol class="fs-fields">
						<li>
							<label class="fs-field-label fs-anim-upper" for="nombre">Nombre</label>
							<input class="fs-anim-lower" id="nombre" name="nombre" type="text" placeholder="Solo Tu Nombre!" required/>
						</li>
						
						<li>
							<label class="fs-field-label fs-anim-upper" for="paterno">Apellido Paterno</label>
							<input class="fs-anim-lower" id="paterno" name="paterno" type="text" placeholder="Sanchez" required/>
						</li>
						<li>
							<label class="fs-field-label fs-anim-upper" for="materno">Apellido Materno</label>
							<input class="fs-anim-lower" id="materno" name="materno" type="text" placeholder="Cruz" required/>
						</li>
						<li>
							<label class="fs-field-label fs-anim-upper" for="correo" data-info="Se enviara informacion importante a esta direccion">E-mail?</label>
							<input class="fs-anim-lower" id="correo" name="correo" type="email" placeholder="usuario@dominio.com" required/>
						</li>
						<li data-input-trigger>
							<label class="fs-field-label fs-anim-upper" for="curso">Tu curso es: </label>
							<div class="fs-radio-group fs-radio-custom clearfix fs-anim-lower">
								<span><input id="cursob" name="curso" type="radio" value="JavaBasico(JSE)"/><label for="curso" class="radio-conversion">Java Basico(JSE)</label></span>
								<span><input id="cursoc" name="curso" type="radio" value="JavaWeb(JEE)"/><label for="curso" class="radio-social">Java Web (JEE)</label></span>
								<span><input id="cursob" name="curso" type="radio" value="BasedeDatosOracle(Basico)"/><label for="curso" class="radio-conversion">Base de Datos Oracle(Basico)</label></span>
								<span><input id="cursoc" name="curso" type="radio" value=".NET"/><label for="curso" class="radio-social">.NET</label></span>
								<span><input id="cursoa" name="curso" type="radio" value="Android"/><label for="curso" class="radio-mobile">Android</label></span>
							</div>
						</li>
						<!-- Forma de pago -->
						<li data-input-trigger>
							<label class="fs-field-label fs-anim-upper" for="formaDePago" data-info="formaDePago">Forma de Pago</label>
							<div class="fs-radio-group fs-radio-custom clearfix fs-anim-lower">
								<span><input id="formaDePago" name="formaDePago" type="radio" value="Semanal"/><label for="formaDePago" class="radio-conversion">Semanal</label></span>
								<span><input id="formaDePago" name="formaDePago" type="radio" value="Mensual"/><label for="formaDePago" class="radio-social">Mensual</label></span>
								<span><input id="formaDePago" name="formaDePago" type="radio" value="Unasolaexhibición"/><label for="formaDePago" class="radio-mobile">Una sola exhibición</label></span>
							</div>
						</li>
						
						<li data-input-trigger>
							<label class="fs-field-label fs-anim-upper" >Escoje un color para tu sexo.</label>
							<select name="miCombo" class="cs-select cs-skin-boxes fs-anim-lower">
								<option value="" disabled selected>Pick a color</option>
								<option value="#588c75" data-class="color-588c75">Hombre</option>
								<option value="#f7cda9" data-class="color-f7cda9">Mujer</option>
							</select>
						</li>
<!-- 						<li data-input-trigger> -->
<!-- 							<label class="fs-field-label fs-anim-upper" for="sexo" data-info="This will help us know what kind of service you need">Cual es tu sexo?</label> -->
<!-- 							<div class="fs-radio-group fs-radio-custom clearfix fs-anim-lower"> -->
<!-- 								<span><input id="sexob" name="sexo" type="radio" value="true"/><label for="sexo" class="radio-conversion">Hombre</label></span> -->
<!-- 								<span><input id="sexoc" name="sexo" type="radio" value="false"/><label for="sexo" class="radio-social">Mujer</label></span> -->
<!-- 								<span><input id="sexoa" name="sexo" type="radio" value="true"/><label for="sexo" class="radio-mobile">Indefinido</label></span> -->
<!-- 							</div> -->
<!-- 						</li> -->				
<!-- 						<li>
							<label class="fs-field-label fs-anim-upper" for="edad">Cual es tu edad</label>
							<input class="fs-mark fs-anim-lower" id="edad" name="edad" type="number" placeholder="20" step="1" min="14"/>
						</li> Se pone comentario para no borrar esta parte de codigo y no eliminarla,la edad las sacaremos con la fecha de nacimiento
							pero no se hará en este momento aún.--> 
						<li>
							<label class="fs-field-label fs-anim-upper" for="fechaNacimiento" >Fecha de Nacimiento</label>
							<input class="fs-anim-lower" id="fechaNacimiento" name="fechaNacimiento" type="date" placeholder="2015/11/29" required/>
						</li>
						
						<li>
							<label class="fs-field-label fs-anim-upper" for="celular" data-info="Se agregara al grupo de WhatsApp">Numero De Tu Celular</label>
							<input class="fs-anim-lower" id="celular" name="celular" type="tel" placeholder="5511223344"  maxlength="10" pattern="[0-9]{10}" required/>
						</li>
						<!-- aquí va el domicilio -->
						<li>
							<label class="fs-field-label fs-anim-upper" for="calle">Domicilio/Calle #</label>
							<input class="fs-anim-lower" id="calle" name="calle" type="text" placeholder="Vallarta 7" required/>
						</li>
						<li>
							<label class="fs-field-label fs-anim-upper" for="codigoPostal" data-info="">Codigo Postal</label>
							<input class="fs-anim-lower" id="codigoPostal" name="codigoPostal" type="text" placeholder="06030"  maxlength="5" pattern="[0-9]{5}" required/>
						</li>
						<li>
							<label class="fs-field-label fs-anim-upper" for="colonia">Colonia</label>
							<input class="fs-anim-lower" id="colonia" name="colonia" type="text" placeholder="Tabacalera" required/>
						</li>
						<li>
							<label class="fs-field-label fs-anim-upper" for="estado">Estado</label>
							<input class="fs-anim-lower" id="estado" name="estado" type="text" placeholder="CDMX" required/>
						</li>
 						<li>
							<label class="fs-field-label fs-anim-upper" for="delegacion">Delegacion</label>
							<input class="fs-anim-lower" id="delegacion" name="delegacion" type="text" placeholder="delegacion" required/>
						</li>
 						<li> 
							<label class="fs-field-label fs-anim-upper" for="Ocupacion">Ocupacion</label> 
 							<input class="fs-anim-lower" id="ocupacion" name="ocupacion" type="text" placeholder="ocupacion" required/> 
 						</li> 
						<li data-input-trigger>
							<label class="fs-field-label fs-anim-upper">Tu Nivel Academico.</label>
							<select name="miCombo2" class="cs-select cs-skin-boxes fs-anim-lower">
								<option value="" disabled selected>Pick a color</option>
								<option value="#588c75" data-class="color-588c75">Formación básica (primaria)</option>
								<option value="#b0c47f" data-class="color-b0c47f">media (secundaria)</option>
								<option value="#f3e395" data-class="color-f3e395">media superior (preparatoria)</option>
								<option value="#f3ae73" data-class="color-f3ae73">superior (universidad)</option>
								<option value="#da645a" data-class="color-da645a">pos grado (maestría y doctorado)</option>
							</select>
						</li>
						<li>
							<label class="fs-field-label fs-anim-upper" for="escuela">Cual Es Tu Escuela.</label>
							<input class="fs-anim-lower" id="escuela" name="escuela" type="text" placeholder="CETECH" required/>
						</li>
						<li data-input-trigger>
							<label class="fs-field-label fs-anim-upper" for="q3" data-info="Como te enteraste de nosotros">Como te enteraste</label>
							<div class="fs-radio-group fs-radio-custom clearfix fs-anim-lower">
								<span><input id="q3b" name="q3" type="radio" value="conversion"/><label for="q3b" class="radio-conversion">Recomendacion</label></span>
								<span><input id="q3c" name="q3" type="radio" value="social"/><label for="q3c" class="radio-social">Redes Sociales</label></span>
								<span><input id="q3a" name="q3" type="radio" value="mobile"/><label for="q3a" class="radio-mobile">Publicidad Impresa</label></span>
							</div>
						</li>
						<li>
							<label class="fs-field-label fs-anim-upper" for="expectativas">Para que tomas el curso</label>
							<textarea class="fs-anim-lower" id="expectativas" name="expectativas" placeholder="Describe aqui"></textarea>
						</li>
						<!-- <li>
							<label class="fs-field-label fs-anim-upper" for="recomendacion">Nos recomendarías con alguna persona,familiar u amigo.</label>
							<input class="fs-anim-lower" id="recomendacion" name="recomendacion" type="text" placeholder="si,no." required/>
						</li> -->
					<!-- 	<li data-input-trigger>
							<label class="fs-field-label fs-anim-upper" for="curso">Que otro curso tomarias</label>
							<div class="fs-radio-group fs-radio-custom clearfix fs-anim-lower">
								<span><input id="cursob" name="otroCurso" type="radio" value="java"/><label for="curso" class="radio-conversion">Java Básico</label></span>
								<span><input id="cursob" name="otroCurso" type="radio" value="android"/><label for="curso" class="radio-conversion">Base de Datos (Oracle Básico)</label></span>
								<span><input id="cursob" name="otroCurso" type="radio" value="bootstrap"/><label for="curso" class="radio-conversion">.NET(Básico)</label></span>
								<span><input id="cursoa" name="otroCurso" type="radio" value="otro"/><label for="curso" class="radio-mobile">Otro</label></span>
							</div>						
						</li> --> 
					</ol><!-- /fs-fields -->
					<button class="fs-submit" type="submit">Enviar Registro</button>
				</form><!-- /fs-form -->
			</div><!-- /fs-form-wrap -->

			<!-- Related demos -->
			<div class="related">
				<p>Otros Registros:</p>
				<a href="#">
					<img src="img/relatedposts/minimalform1-300x162.png" />
					<h3>Visitas</h3>
				</a>
				<a href="#">
					<img src="img/relatedposts/MorphingButtons-300x162.png" />
					<h3>Administracion</h3>
				</a>
			</div>

		</div><!-- /container -->
		<script src="js/classie.js"></script>
		<script src="js/selectFx.js"></script>
		<script src="js/fullscreenForm.js"></script>
		<script>
			
			(function() {
				var formWrap = document.getElementById( 'fs-form-wrap' );

				[].slice.call( document.querySelectorAll( 'select.cs-select' ) ).forEach( function(el) {	
					new SelectFx( el, {
						stickyPlaceholder: false,
						onChange: function(val){
							document.querySelector('span.cs-placeholder').style.backgroundColor = val;
						}
					});
				} );

				new FForm( formWrap, {
					onReview : function() {
						classie.add( document.body, 'overview' ); // for demo purposes only
					}
				} );
			})();
		</script>
		<script type="text/javascript">
		$(document).ready(function() {
		    // Así accedemos al Valor de la opción seleccionada
		    var valor = $("#miCombo").val();
		    alert(valor);
		    // Si seleccionamos la opción "Texto 1"
		    // nos mostrará por pantalla "1"
		});
		</script>
</body>
</html>
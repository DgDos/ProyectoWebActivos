<%@page import="java.util.ArrayList"%>
<!DOCTYPE HTML>
<html>

<head>
  <title>simplestyle_7</title>
  <meta name="description" content="website description" />
  <meta name="keywords" content="website keywords, website keywords" />
  <meta http-equiv="content-type" content="text/html; charset=windows-1252" />
  <link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Tangerine&amp;v1" />
  <link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Yanone+Kaffeesatz" />
  <link rel="stylesheet" type="text/css" href="style/style.css" />
</head>

<body>
  <div id="main">
    <div id="header">
      <div id="logo">
        <h1>Sistema Pr&eacute;stamos Laboratorio</h1>
        <div class="slogan">Pr&eacute;stamos al Instante!</div>
      </div>
      <div id="menubar">
        <ul id="menu">
          <!-- put class="current" in the li tag for the selected page - to highlight which page you're on -->
          <li class="current"><a href="index.jsp">Crear</a></li>
          <li><a href="examples.html">Actualizar</a></li>
          <li><a href="page.html">Leer</a></li>
          <li><a href="another_page.html">Borrar</a></li>
          <li><a href="contact.html">Listar Todo</a></li>
          <li><a href="activo.jsp">Crear Activo</a></li>
        </ul>
      </div>
    </div>
    <div id="site_content">
      <div id="sidebar_container">
         <!-- Inicio presentacion Noticias-->
        <img class="paperclip" src="style/paperclip.png" alt="paperclip" />
        <div class="sidebar">
        <!-- insert your sidebar items here -->
        <h3>&Uacute;ltimas Noticias</h3>
        <h4>No hay osciloscopios disponibles</h4>
        <h5>31 Agosto 2018</h5>
        <p>Los osciloscopios estan siendo usados en clase de Potencia<br /><a href="#">Read more</a></p>
        </div>
        <!-- Final presentacion Noticias-->
        
        
        
      </div>
      <div id="content">
        <!-- insert the page content here -->
        <h1>Registro de Prestamos</h1>
        <p>Ingrese la informacion solicitada</p>
        
     <form action="Index" method="post">
       <div class="form_settings">
       <p><span>Cedula Estudiante</span>
       <input class="contact" type="text" name="cedula" value="" /></p>
       <p><span>Activo</span>
       <select class="contact" name="activo" >
           <% if(request.getAttribute("activos")!=null){
               ArrayList<dato.Activo> activos=(ArrayList<dato.Activo>)request.getAttribute("activos");
               if(activos!=null){
                   for(dato.Activo activo: activos){
                       %>
                       <option value="<%=activo.getNombre()%>"><%=activo.getNombre()%></option>     
           <%
                   }
               }else{
                   
               }
               
           }
           %>
       </select>
       </p>
        <p><span>Cantidad</span>
       <input class="contact" type="text" name="cantidad" value="" />
            </p>
            <p style="padding-top: 15px"><span>&nbsp;</span><input class="submit" type="submit" name="contact_submitted" value="submit" /></p>
          </div>
        </form>
        
      </div>
    </div>
    <div id="footer">
      <p>Copyright &copy; simplestyle_7 | <a href="http://validator.w3.org/check?uri=referer">HTML5</a> | <a href="http://jigsaw.w3.org/css-validator/check/referer">CSS</a> | <a href="http://www.html5webtemplates.co.uk">design from HTML5webtemplates.co.uk</a></p>
    </div>
  </div>
</body>
</html>

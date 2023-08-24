

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Solicitud</title>
    </head>
    <body>
         <h1>Solicitud</h1>
         <p>Pulsa el boton "enviar" al finalizar</p><br>
        <form action="result1.jsp" method="post">
        <table border="1" cellspacing="3" cellpadding="3">
            <tr>
                <td>Nombre:</td>
                <td><input type="text" name="nombre"></td>
            </tr>
            <tr>
                <td>Apellido:</td>
                <td><input type="text" name="apellido"></td>
            </tr>
            <tr>
                <td>Correo:</td>
                <td><input type="text" name="correo"></td>
            </tr>
        </table><br>
        <label>Eres:</label>
        <input type="radio" name="genero" value="Hombre">
        <input type="radio" name="genero" value="Mujer"><br>
        <label>Selecciona los lenguajes de programacion que conoces:</label><br>
        <input type="checkbox"  name="java" value="Java">
        <input type="checkbox"  name="c" value="C/C++">
        <input type="checkbox"  name="html" value="HTML">
        <input type="checkbox"  name="basic" value="Basic"><br>
        <label>Selecciona los idiomas que conoces:</label><br>
        <select id="id" name="idiomas" multiple>
                <option value="espaniol">Español</option>
                <option value="frances">Frances</option>
                <option value="ingles">Ingles</option>
                <option value="aleman">Aleman</option>
        </select><br>
        <label>Comentarios adicionales</label><br>
        <textarea name="comentarios" rows="5" cols="50"></textarea><br>
        <input type="submit"  value="Enviar"><br>
        <input type="reset"  value="Borrar"><br>
        </form>

    </body>
</html>

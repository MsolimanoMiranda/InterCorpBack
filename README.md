Microservicio del Reto Intercorp


Se asume que cada cliente tiene un tiempo de vida aproximada de 80 años.

El endpoint de todos los clientes incluyendo la fecha probable de muerte es:

http://intercorpback-env-1.eba-2cgukjxw.us-east-2.elasticbeanstalk.com/api/listclientes

El endpoint kpi para determinar la edad promedio y desviación estandard de los clientes es:
 http://intercorpback-env-1.eba-2cgukjxw.us-east-2.elasticbeanstalk.com/api/kpiclientes

El endpoint para crear nuevos clientes: 
http://intercorpback-env-1.eba-2cgukjxw.us-east2.elasticbeanstalk.com/api/crearcliente

Ejemplo en el body:

{ "nombres": "Juan", "apellidos": "Perez", "edad": 39, "fecha_nacimiento": "1981-01-21" }

Swagger: https://intercorp-ms.firebaseapp.com/swagger.json




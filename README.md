# Nutriclinic

Nutriclinic es un programa para la gestión de una clínica de salud, con servicios de nutrición, dietética y entrenamiento personal.
El programa ofrece 3 herramientas para la gestión de los clientes de dicha clínica:
- Clientes: gestiona las altas y actualizaciones de los clientes, permitiendo sus datos y contactos.
- Nutrición: permite añadir las mediciones tomadas en una cita a cada uno de los clientes registrados para el servicio de nutrición.
- Entrenamiento: actualiza el número de sesiones disponibles del bono de entrenamientos contratado por el cliente. 

Para el funcionamiento del programa es necesario tener instalado Java y un servidor local de bases de datos con MySQL.
Al iniciar el programa, este solicitará el usuario y contraseña necesarios para acceder al servidor. Se requiere que el usuario tenga permisos para introducir información en las bases de datos, consultar y modificar los datos de estas. 
La primera vez que se inicie el programa, este se encargará de crear el esquema de la base de datos que utilizará para el funcionamiento del programa. 


## Funcionamiento

En la herramienta de Clientes se gestiona si un cliente ha contratado un servicio de nutrición, entrenamiento o ambos. 
Cuando se añade un plan nutricional al cliente, este aparecerá automáticamente en la herramienta de Nutrición. Si se añade un bono a un cliente, podremos encontrar su perfil en la herramienta de Entrenamiento.
Mientras no se añada ninguno de estos datos, los clientes no aparecerán en las herramientas correspondientes. 

El programa no permite el borrado de datos ni de perfiles, para evitar la eliminación de información de la base de datos de manera accidental. Para esto, es necesario acceder a la base de datos a través de MySQL y ejecutar el borrado de la información deseada.


## Importante

Para que el programa pueda conectarse a la base de datos administrada con MySQL, es importante descargar e importar el MySQL Java Connector: [mysql-connector-java-5.1.13](http://www.java2s.com/Code/JarDownload/mysql/mysql-connector-java-5.1.13.jar.zip)

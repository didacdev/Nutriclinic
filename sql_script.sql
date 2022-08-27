use nutriclinic;

#Crea los esquemas de las bases de datos

create table clientes
 (ID int unsigned not null auto_increment,
 nombre varchar(20),
 apellidos varchar(30),
 fecha_nacimiento date,
 fecha_inicio date,
 fecha_final date,
 primary key(ID));
 
create table contactos
(contacto_id int unsigned,
 telefono int unsigned,
 email varchar(30),
 primary key(contacto_id),
 foreign key(contacto_id) references clientes(ID));
 
 create table residencias
 (residencia_id int unsigned,
 municipio varchar(30),
 provincia varchar(25),
 primary key(residencia_id),
 foreign key(residencia_id) references clientes(ID));
 
 create table bonos
 (bonos_id int unsigned,
 bono int unsigned,
 fecha_inicio date,
 primary key(bonos_id),
 foreign key (bonos_id) references clientes(ID));
 
 create table medidas
 (ID int unsigned,
 fecha_consulta date,
 peso int,
 altura int,
 cadera int, 
 cintura int,
 muslo int,
 brazo int, 
 wrist int, 
 tobillo int,
 bajo_gluteo int,
 pecho int,
 primary key(ID, fecha_consulta),
 foreign key(ID) references clientes(ID));
 
 create table bioimpedancias
 (ID int unsigned,
 fecha_consulta date,
 masa_muscular int,
 masa_grasa int,
 agua int, 
 metabolismo_basal int,
 edad_metabolica int,
 primary key(ID, fecha_consulta),
 foreign key(ID) references clientes(ID));
 
 create table planes
 (plan_id int unsigned,
 nombre_plan varchar(15));


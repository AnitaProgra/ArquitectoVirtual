INSERT INTO Usuario(id, email, password, rol, activo) VALUES(null, 'ndvruquet@gmail.com', '1234', 'ADMIN', true);

insert into Proyecto(id, nombreProyecto, usuario) values (null,'piso habitacion',1);

insert into ActividadProyecto(id, idProyecto, idActividad, actividad,etapa,estado) values (null,1,1,'Armar encadenado',1,false);

insert into ActividadProyecto(id, idProyecto, idActividad,  actividad,etapa,estado) values (null,1,2,'Armar cajon',1,false);

insert into ActividadProyecto(id, idProyecto, idActividad, actividad,etapa,estado) values (null,1,3,'rellenar con mezcla',1,false);

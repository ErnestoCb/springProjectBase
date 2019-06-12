INSERT INTO db_springboot_casolibros.tienda (nombre_tienda) VALUES ('Tienda Central');
INSERT INTO db_springboot_casolibros.tienda (nombre_tienda) VALUES ('Providencia');
INSERT INTO db_springboot_casolibros.tienda (nombre_tienda) VALUES ('La Florida');

INSERT INTO db_springboot_casolibros.libro (nombre_libro, editorial, autor, precio) VALUES ('Harry Potter', 'Planeta', 'J.K.Rowling', 10000);
INSERT INTO db_springboot_casolibros.libro (nombre_libro, editorial, autor, precio) VALUES ('Narnia', 'Santillana', 'John Simpson', 12000);
INSERT INTO db_springboot_casolibros.libro (nombre_libro, editorial, autor, precio) VALUES ('Divergente', 'Panini', 'Augusto Pinochet', 15000);
INSERT INTO db_springboot_casolibros.libro (nombre_libro, editorial, autor, precio) VALUES ('Hunger Games', 'lulu', 'Salvador Allende', 9000);
INSERT INTO db_springboot_casolibros.libro (nombre_libro, editorial, autor, precio) VALUES ('Las aventuras de Niker', 'El viejo', 'Shishigan', 8000);

INSERT INTO db_springboot_casolibros.ejemplares (id_libro, id_tienda, cantidad) VALUES (1, 1, 10);
INSERT INTO db_springboot_casolibros.ejemplares (id_libro, id_tienda, cantidad) VALUES (1, 2, 5);
INSERT INTO db_springboot_casolibros.ejemplares (id_libro, id_tienda, cantidad) VALUES (2, 3, 20);
INSERT INTO db_springboot_casolibros.ejemplares (id_libro, id_tienda, cantidad) VALUES (3, 1, 10);
INSERT INTO db_springboot_casolibros.ejemplares (id_libro, id_tienda, cantidad) VALUES (3, 2, 1);
INSERT INTO db_springboot_casolibros.ejemplares (id_libro, id_tienda, cantidad) VALUES (3, 3, 2);
INSERT INTO db_springboot_casolibros.ejemplares (id_libro, id_tienda, cantidad) VALUES (4, 1, 8);
INSERT INTO db_springboot_casolibros.ejemplares (id_libro, id_tienda, cantidad) VALUES (4, 2, 2);
INSERT INTO db_springboot_casolibros.ejemplares (id_libro, id_tienda, cantidad) VALUES (4, 3, 5);
INSERT INTO db_springboot_casolibros.ejemplares (id_libro, id_tienda, cantidad) VALUES (5, 1, 1);
INSERT INTO db_springboot_casolibros.ejemplares (id_libro, id_tienda, cantidad) VALUES (5, 1, 1);
INSERT INTO db_springboot_casolibros.ejemplares (id_libro, id_tienda, cantidad) VALUES (5, 1, 5);

INSERT INTO db_springboot_casolibros.reserva (id_libro, cantidad, estado, rut_persona, retiro, id_tienda) VALUES (1, 1, '1', '192354153', '1', 2);
INSERT INTO db_springboot_casolibros.reserva (id_libro, cantidad, estado, rut_persona, retiro, direccion) VALUES (5, 2, '1', '192354153', '2', 'mi casa 1234');

INSERT INTO db_springboot_casolibros.venta (id_libro, cantidad, rut_persona, boleta_factura, estado) VALUES (1, 2, '192354153', '2', '3');
INSERT INTO db_springboot_casolibros.venta (id_libro, cantidad, rut_persona, boleta_factura, estado) VALUES (2, 1, '125413645', '1', '3');

INSERT INTO db_springboot_casolibros.factura (rut_persona, direccion, nombre, id_venta) VALUES ('192354153', 'direccion 123', 'Ernesto Cabello', 1);

INSERT INTO db_springboot_casolibros.notificacion (id_libro, mensaje, email) VALUES (1, 'Libro disponible para retiro', 'ernesto@correo.com');
INSERT INTO db_springboot_casolibros.notificacion (id_libro, mensaje, email) VALUES (2, 'Libro en camino a despacho', 'ernesto@correo.com');
INSERT INTO db_springboot_casolibros.notificacion (id_libro, mensaje, email) VALUES (5, 'Nuevas ofertas en tienda central', 'ernesto@correo.com');
INSERT INTO db_springboot_casolibros.notificacion (id_libro, mensaje, email) VALUES (3, 'Libro Hunger Games llegara en x dias', 'ernesto@correo.com');



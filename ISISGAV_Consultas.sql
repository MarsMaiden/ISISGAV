-- Consulta Productos
SELECT articulo.cod_art, articulo.nom_art, articulo.marca_art, articulo.desc_art,categoria.desc_cat,articulo.precio_venta
FROM articulo
INNER JOIN categoria ON articulo.id_categoria = categoria.id_categoria
ORDER BY COD_ART ASC;

/*SELECT articulo.cod_art, articulo.nom_art, articulo.marca_art, articulo.desc_art,categoria.desc_cat,articulo.precio_venta, (SELECT STOCK_ACTUAL FROM KARDEX
INNER JOIN ARTICULO ON KARDEX.ID_ARTICULO = ARTICULO.ID_ARTICULO ORDER BY ID_KARDEX DESC LIMIT 1) AS stock_actual
FROM articulo
INNER JOIN categoria ON articulo.id_categoria = categoria.id_categoria;*/

-- Consulta Productos POR ID
SELECT ARTICULO.COD_ART, ARTICULO.NOM_ART, ARTICULO.PRECIO_VENTA FROM ARTICULO WHERE COD_ART = 'ART-0002';

SELECT STOCK_ACTUAL FROM KARDEX WHERE ID_ARTICULO = 1 ORDER BY ID_KARDEX DESC LIMIT 1;

SELECT ARTICULO.COD_ART, ARTICULO.NOM_ART, ARTICULO.PRECIO_VENTA, KARDEX.STOCK_ACTUAL FROM ARTICULO INNER JOIN KARDEX ON ARTICULO.ID_ARTICULO = KARDEX.ID_ARTICULO

WHERE COD_ART = 'ART-0002';

SELECT articulo.id_articulo, ARTICULO.COD_ART, ARTICULO.NOM_ART, (SELECT STOCK_ACTUAL FROM KARDEX
INNER JOIN ARTICULO ON KARDEX.ID_ARTICULO = ARTICULO.ID_ARTICULO WHERE COD_ART = 'ART-0003' ORDER BY ID_KARDEX DESC LIMIT 1) AS stock_actual,
ARTICULO.PRECIO_VENTA FROM ARTICULO WHERE COD_ART = 'ART-0003';


-- USUARIO Y PASSWORD
SELECT CONCAT(LEFT(NOM_EMP, 1), APE_EMP) AS usuario, CONCAT(DNI_EMP, left(NOM_EMP,1), LEFT(APE_EMP,1)) AS PASS FROM EMPLEADO;

-- INGRESAR USUARIO Y PASSWORD
INSERT INTO DB_ISISGAV.USUARIO VALUES (3, (SELECT concat(left(NOM_EMP, 1), APE_EMP) FROM EMPLEADO WHERE id_empleado = 3), (SELECT CONCAT(DNI_EMP, left(NOM_EMP,1), LEFT(APE_EMP,1)) FROM EMPLEADO WHERE id_empleado = 3), 1);

-- CONSULTA EMPLEADO + USUARIO
SELECT EMPLEADO.COD_EMP, USUARIO.USUARIO, USUARIO.PASS, TIPO_USUARIO.DESC_USER
FROM USUARIO
INNER JOIN EMPLEADO ON EMPLEADO.ID_EMPLEADO = USUARIO.ID_EMPLEADO
INNER JOIN tipo_usuario ON tipo_usuario.id_tipouser = usuario.id_tipouser;

-- FECHA actual
SELECT DATE_FORMAT(CURDATE(), '%d-%m-%Y') AS DATE;

SELECT MAX(ID_ARTICULO) + 1 FROM ARTICULO;

SELECT cod_ven, EMPLEADO.COD_EMP, CLIENTE.COD_CLI, FORMA_PAGO.DESC_PAGO,  DATE_FORMAT(fecha_venta, '%d-%m-%Y') AS fecha_venta FROM VENTA
INNER JOIN EMPLEADO ON EMPLEADO.ID_EMPLEADO = VENTA.ID_EMPLEADO
INNER JOIN CLIENTE ON CLIENTE.ID_CLIENTE = VENTA.ID_CLIENTE
INNER JOIN FORMA_PAGO ON FORMA_PAGO.ID_PAGO = VENTA.ID_PAGO;

SELECT articulo.cod_art, articulo.nom_art, articulo.marca_art, articulo.desc_art,categoria.desc_cat,articulo.precio_venta 
FROM ARTICULO  INNER JOIN categoria ON articulo.id_categoria = categoria.id_categoria WHERE MATCH (nom_art, marca_art)
AGAINST('%Guitarra%');

-- Last id Venta
SELECT MAX(ID_VENTA) +1 FROM db_isisgav.venta;

-- Consulta ventas + detalles
SELECT id_venta, cod_ven, empleado.cod_emp, cliente.cod_cli, forma_pago.desc_pago, if(id_comprobante_pago = 1, 'Boleta', 'Factura') AS comprobante_pago, 
DATE_FORMAT(fecha_venta, '%d-%m-%Y') as fecha_venta, sub_total, igv, importe_venta
FROM db_isisgav.venta
INNER JOIN empleado ON empleado.id_empleado = venta.id_empleado
INNER JOIN cliente ON cliente.id_cliente = venta.id_cliente
INNER JOIN forma_pago ON forma_pago.id_pago = venta.id_pago
ORDER BY id_venta ASC;

-- Detalle de Venta
SELECT * FROM db_isisgav.detalle_venta;

SELECT venta.cod_ven, articulo.nom_art, cant_venta FROM detalle_venta
INNER JOIN venta ON venta.id_venta = detalle_venta.id_venta
INNER JOIN articulo ON articulo.id_articulo = detalle_venta.id_articulo
WHERE detalle_venta.id_venta = 1;

-- Find by User

SELECT usuario.id_usuario, usuario.usuario, usuario.pass, tipo_usuario.desc_user FROM db_isisgav.usuario
INNER JOIN usuario_roles ON usuario_roles.id_usuario = usuario.id_usuario
INNER JOIN tipo_usuario ON tipo_usuario.id_tipouser = usuario_roles.id_tipouser
 WHERE usuario.usuario = "Amaguiña";


SELECT usuario.usuario, usuario.pass FROM db_isisgav.usuario WHERE usuario.usuario = "Amaguiña";

-- AMaguiña	73112941AM
-- ERazuri	81479842ER
-- HAndia	74631428HA
-- RCedano	48115736RC




UPDATE usuario SET pass = "$2a$04$GpFe9s9Edexm.i/JZhJm2.7SjC4LULdwgmcdo9FXPdadFUAWgx3ni" where id_usuario = "4";
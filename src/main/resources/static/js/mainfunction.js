var detalleVentaJSON = "";

function buscarArticulo() {

	var url = 'http://localhost:8015/isisgav/articulo/';
	if ($('#buscar_cod_art').val() != '') {
		url = url + '/' + $('#buscar_cod_art').val();
	}
	$("#resultado").load(url);

}

function adicionarDetalleCompra(tableID) {

	$("#table_resultsbycodart tr").each(function() {
		json = "";
		$(this).find("td").each(function() {
			$this = $(this);
			json += ',"' + $this.attr("class") + '":"' + $this.html() + '"'
		});
		obj = JSON.parse('{' + json.substr(1) + '}');
	});

	var cantidad = document.getElementById("cantidad").value;

	var nombre = document.getElementById(tableID).getAttribute("id");

	var rowcount = document.getElementById(tableID).rows.length;

	var fila = '<tr class="table-primary" id="row' + rowcount + '"><td>' + obj.id_art + '</td><td>' + obj.cod_art 
	+ '</td><td>' + obj.nom_art + '</td><td>' +	cantidad + '</td><td>' + obj.precio_venta + '</td><td>' 
	+ (obj.precio_venta * cantidad) +
	'</td><td><button type="button" name="remove" class="btn btn-danger btn_remove">Quitar</button></td></tr>';

	$('#' + nombre + ' tbody').append(fila);

	document.getElementById("cantidad").value = "";
	document.getElementById("buscar_cod_art").value = "";
	document.getElementById("buscar_cod_art").focus();

}

function getJson(tableID) {

	var table = document.getElementById(tableID).getElementsByTagName('tbody')[0];
	var jsonArr = [];
	for (var i = 0, row; row = table.rows[i]; i++) {
		var col = row.cells;
		var jsonObj = {
			
			subtotal: col[5].innerHTML
		}
		jsonArr.push(jsonObj);

	}

	var total = 0;
	for (var i in jsonArr) {
		total += parseFloat(jsonArr[i].subtotal, 10);		
	}

	$(function() {
		$('#total').val(total);

	});

}

$(function() {
	$(document).on('click', '.btn_remove', function(event) {
		event.preventDefault();
		$(this).closest('tr').remove();
		var row = $(this).closest('tr')[0];
		var subtotal_subs = row.cells[5].innerHTML;

		var total_ant = document.getElementById("total").value;

		$(function() {
			$('#total').val(total_ant - subtotal_subs);

		});

	});

});

function detalleVenta(articuloid, cant, ventaid) {
	this.articuloid = articuloid;
	this.cant = cant;
	this.ventaid = ventaid;
}


function detalleVentaPost(){

	var table = document.getElementById('DetalleVentaTable').getElementsByTagName('tbody')[0];
	jsonDetalles=[];

	  for (let fila of table.rows) {
    	var id_art = fila.cells[0].innerHTML;
    	var cant = fila.cells[3].innerHTML;
    	var venta_id = document.getElementById('id_venta').value;

    	var filadetalleVenta = new detalleVenta(id_art,cant,venta_id);
    	jsonDetalles.push(filadetalleVenta);
    }
    console.log(jsonDetalles);
    console.info(JSON.stringify(jsonDetalles));

 $.ajax({
        url: "http://localhost:8015/isisgav/venta/detalle",
        data: JSON.stringify(jsonDetalles),
        type: "POST",
        dataType:"html",
        contentType:'application/json'   
        ,success : function(){
            console.log("ok!");            
        }
        ,error : function(a,b,c){
            console.log("err!", a, b, c);
            alert("Hubo un error")
        }
    });

}

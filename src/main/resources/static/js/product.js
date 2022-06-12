/**
 *
 */

$('document').ready(function() {

	$('table .btn-primary').on('click',function(event){
		event.preventDefault();
		var href= $(this).attr('href');
		$.get(href, function(product, status){
			$('#idEdit').val(product.id);
			$('#nameEdit').val(product.name);
			$('#dateEdit').val(product.date);
			$('#ddlProductEdit').val(product.product_id);
		});
		$('#editModal').modal('show');
	});

	$('table #deletebtn').on('click',function(event) {
		event.preventDefault();
		var href= $(this).attr('href');
		$('#confirmDeleteButton').attr('href',href);
		$('#deleteModal').modal('show');
	});
});
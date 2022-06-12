/**
 * 
 */

$('document').ready(function() {
	
	$('table .btn-primary').on('click',function(event){
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(typeProduct, status){
			$('#nameEdit').val(typeProduct.name);
		});			
		$('#editModal').modal('show');
	});

	$('table #deleteButton').on('click',function(event) {
		event.preventDefault();
		var href= $(this).attr('href');
		$('#confirmDeleteButton').attr('href',href);
		$('#deleteModal').modal('show');
	});
});
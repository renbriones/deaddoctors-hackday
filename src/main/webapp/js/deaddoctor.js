$(document).ready(function(e){
    $('.search-panel .dropdown-menu').find('a').click(function(e) {
		e.preventDefault();
		var param = $(this).attr("href").replace("#","");
		var concept = $(this).text();
		var name = $(this).attr("name");
		
		$('.search-panel span#search_concept').text(concept);
		$('.input-group #search_param').val(param);
		$('.input-group #searchType').val(name);
		
	});
    
    
    $('#searchButton').click(function(e) {
		var searchTerm = $('.input-group #searchTerm').val();
		var searchParam = $('.input-group #searchType').val();
		
		window.location.href= "/search-result?searchTerm=" + searchTerm + "&searchType=" + searchParam;
	});
    
    
    
});
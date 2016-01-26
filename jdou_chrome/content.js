$(function(){
	$("#product-detail .m-tab-trigger").append("<li class='ui-switchable-item trig-item douban-comments'><a href='javascript:;'>豆瓣书评</a></li>");
	$('.douban-comments').on('click',function(){
		var bro = $('#pro-detail-hd');
		var top = bro.offset().top;
		var height = bro.height();
		var width = bro.width();
		var left = bro.offset().left;
		var div = $('<div></div>').css({position:'absolute',left:left,top:top+height+1,width:width,'background-color':'yellow',overflow:'hidden'});
		div.html("testasdfa<br>testasdfa<br>testasdfa<br>testasdfa<br>testasdfa<br>testasdfa<br>testasdfa<br>testasdfa<br>testasdfa<br>testasdfa<br>testasdfa<br>testasdfa<br>testasdfa<br>testasdfa<br>testasdfa<br>");
		$('body').append(div);
	});
	$(document).keydown(function(event){
		event.stopPropagation();
		event.preventDefault();
		if(event.ctrlKey && event.keyCode==68){
			console.log("Ctrl+d typed.");	
		}
		
	});
});
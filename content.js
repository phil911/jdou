
$(function(){
	function a(){
		alert('b')
	}
	var div = $('<div id="comment_icon" class="cicle_icon douban_background_color" onclick=\"window.postMessage({ type: \'Jdou_click\',name:\'Jdou_comment\'}, \'*\')\">豆瓣书评</div>');
	$("body").append(div);
	// var p = $("#product-detail .m-tab-trigger");
	// p&&p.append("<li class='ui-switchable-item trig-item douban-comments'><a href='javascript:;' onclick=\"window.postMessage({ type: 'Jdou_click',name:'Jdou_comment'}, '*')\">豆瓣书评</a></li>")
	window.addEventListener("message", function(event) {
	  // We only accept messages from ourselves
	  if (event.source != window){
				return;
		}
	  if (event.data.type && event.data.type == "Jdou_click") {
	    if(event.data.name && event.data.name == "Jdou_comment"){
					alert('test click.')
			}
	  }
	}, false);
})

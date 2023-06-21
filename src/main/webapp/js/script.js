mdb.Alert.getInstance(document.getElementById("alertExample")).update({
      position: "top-right",
      delay: 2000,
      autohide: false,
      width: "600px",
      offset: 20,
      stacking: false,
      appendToBody: false,
    });



   $(document).ready(function(){
   	$('[data-toggle="tooltip"]').tooltip();
   	// Animate select box length
   	var searchInput = $(".search-box input");
   	var inputGroup = $(".search-box .input-group");
   	var boxWidth = inputGroup.width();
   	searchInput.focus(function(){
   		inputGroup.animate({
   			width: "300"
   		});
   	}).blur(function(){
   		inputGroup.animate({
   			width: boxWidth
   		});
   	});
   });



   setTimeout(() => {
     const box = document.getElementById('message');
     box.style.display = 'none';
   }, 2000);
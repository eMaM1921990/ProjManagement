	window.LanderApp.start([
		function () {
			$("#signin-form_id").validate({ focusInvalid: true, errorPlacement: function () {
				
				
			} });
			
			// Validate username
			$("#username").rules("add", {
				required: true
			});

			// Validate password
			$("#pwd").rules("add", {
				required: true
				
			});
			
			
		}
	]);
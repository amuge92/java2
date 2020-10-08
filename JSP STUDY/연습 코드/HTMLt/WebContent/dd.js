/**
 * 
 */function on() {
			var a = document.getElementById("age").value;
			a1 = parseInt(a);
			if (isNaN(a1)) {
				alert("정수만");
				return false;
			} else 
				return true;
			
		}
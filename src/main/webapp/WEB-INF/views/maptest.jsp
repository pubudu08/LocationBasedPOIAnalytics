<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
<style type="text/css">
html {
	height: 100%
}

body {
	height: 100%;
	margin: 0;
	padding: 0
}

#map-canvas {
	height: 100%
}
</style>
<script type="text/javascript"
	src="https://maps.googleapis.com/maps/api/js?&sensor=false">
	
</script>
<script type="text/javascript">
	function initialize() {
		var mapOptions = {
			center : new google.maps.LatLng(6.933208392659332,
					79.84366048810165),
			zoom : 8,
			mapTypeId : google.maps.MapTypeId.ROADMAP
		};
		var map = new google.maps.Map(document.getElementById("map-canvas"),
				mapOptions);
		infoWindow = new google.maps.InfoWindow();
		service = new google.maps.places.PlacesService(map);

		google.maps.event.addListenerOnce(map, 'bounds_changed', performSearch);
		function performSearch() {
			var request = {
				location : colombo,
				radius : '500',
				types : [ 'store' ]
			};

			service.radarSearch(request, callback);
		}

		function callback(results, status) {
			if (status != google.maps.places.PlacesServiceStatus.OK) {
				alert(status);
				return;
			}
			for ( var i = 0, result; result = results[i]; i++) {
				var marker = new google.maps.Marker({
					map : map,
					position : result.geometry.location
				});
			}
		}
	}
	google.maps.event.addDomListener(window, 'load', initialize);
</script>
</head>
<title>Insert title here</title>
</head>
<body>
	<div id="map-canvas" />

</body>
</html>
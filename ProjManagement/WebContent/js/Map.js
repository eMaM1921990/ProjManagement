
            var map;
            var markers = [];
            var marker;
    		var location;

            function initialize() {
                var mapOptions = {
                    zoom: 10,
                    center: {lat: 30, lng: 31.25}
                };
                map = new google.maps.Map(document.getElementById('map-canvas'), mapOptions);

                // Place a draggable marker on the map
                google.maps.event.addListener(map, 'click', function (event) {
                	//SET LATITUDE
                	$('#LATITUDE').val(event.latLng.lat());
                	//SET LONGITUDE
                	$('#LANGITUDE').val(event.latLng.lng());
                    placeMarker(event.latLng);
                });

                $('#addLocation').hide();
            }

            google.maps.event.addDomListener(window, 'load', initialize);



            function placeMarker(location) {
            	deleteMarkers();
                 marker = new google.maps.Marker({
                    position: location,
                    map: map,
                    animation: google.maps.Animation.DROP

                });
              	map.panTo(location);
                markers.push(marker);
               // markers.setcenter(location);
                //map.setZoom(17);
                $('#addLocation').show();
            }


            // Deletes all markers in the array by removing references to them.
            function deleteMarkers() {
                clearMarkers();
                markers = [];
            }



            // Sets the map on all markers in the array.
            function setAllMap(map) {
                for (var i = 0; i < markers.length; i++) {
                    markers[i].setMap(map);
                }
            }


            // Removes the markers from the map, but keeps them in the array.
            function clearMarkers() {
                setAllMap(null);
            }
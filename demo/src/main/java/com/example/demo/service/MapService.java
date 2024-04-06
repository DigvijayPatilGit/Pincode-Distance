package com.example.demo.service;
import com.example.demo.Response.GoogleMapResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MapService {
        @Autowired
        private RestTemplate restTemplate;

        @Cacheable("mapsCache")
        public ResponseEntity<GoogleMapResponse> getRoute(String fromPincode, String toPincode) {
            String url = "https://maps.googleapis.com/maps/api/distancematrix/json?origins=" + fromPincode +
                    "&destinations=" + toPincode + "&key=YOUR_GOOGLE_MAPS_API_KEY";
            return restTemplate.getForEntity(url, GoogleMapResponse.class);
        }

}

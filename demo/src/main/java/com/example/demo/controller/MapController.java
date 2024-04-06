package com.example.demo.controller;
import com.example.demo.Response.GoogleMapResponse;
import com.example.demo.service.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MapController {

        @Autowired
        private MapService mapsService;

        @GetMapping("/route")
        public ResponseEntity<GoogleMapResponse> getRoute(@RequestParam("fromPincode") String fromPincode,
                                                          @RequestParam("toPincode") String toPincode) {
            return mapsService.getRoute(fromPincode, toPincode);
        }

}

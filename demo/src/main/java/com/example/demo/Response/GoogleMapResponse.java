package com.example.demo.Response;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GoogleMapResponse {
    private String status;
    private String[] destination_addresses;
    private String[] origin_addresses;
    private Row[] rows;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Row {
        private Element[] elements;

        @Data
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Element {
            private Distance distance;
            private Duration duration;
            private String status;
        }
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Distance {
        private String text;
        private long value;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Duration {
        private String text;
        private long value;
    }
}

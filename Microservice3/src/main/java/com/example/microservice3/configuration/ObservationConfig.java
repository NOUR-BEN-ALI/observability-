package com.example.microservice3.configuration;

import io.micrometer.observation.ObservationRegistry;
import io.micrometer.observation.aop.ObservedAspect;
import io.opentelemetry.exporter.otlp.http.trace.OtlpHttpSpanExporter;
import io.opentelemetry.exporter.otlp.trace.OtlpGrpcSpanExporter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class ObservationConfig {
    @Value("${tracing.url}")
    private String tracingUrl;

    @Bean
    public OtlpGrpcSpanExporter otlpHttpSpanExporter() {
        return OtlpGrpcSpanExporter.builder().setEndpoint(tracingUrl).build();
    }
}

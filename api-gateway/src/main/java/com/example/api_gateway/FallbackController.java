package com.example.api_gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallbackController {

    @GetMapping("/order-down")
    public String orderFallback() {
        return "Hệ thống Đơn hàng hiện tại đang bận hoặc gặp sự cố. Vui lòng thử lại sau! (Kích hoạt bởi Circuit Breaker tại Gateway)";
    }
}
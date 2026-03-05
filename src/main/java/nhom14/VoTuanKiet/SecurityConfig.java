package nhom14.VoTuanKiet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .anyRequest().permitAll() // Cho phép tất cả các request mà không cần đăng nhập
            )
            .csrf(csrf -> csrf.disable()) // Tắt CSRF nếu bạn đang làm API/Test
            .formLogin(form -> form.disable()) // Tắt form login mặc định
            .httpBasic(basic -> basic.disable());
            
        return http.build();
    }
}
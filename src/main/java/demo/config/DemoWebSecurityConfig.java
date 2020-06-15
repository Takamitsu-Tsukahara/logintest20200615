package demo.config;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
class DemoWebSecurityConfig extends WebSecurityConfigurerAdapter {

	/* フィールド s  */
	private MessageSource s;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			// AUTHORIZE
			/* */.authorizeRequests()
			/* */.mvcMatchers("/hello").permitAll()
			/* */.anyRequest()
			/* */.authenticated()
		.and()
			// LOGIN
			/* */.formLogin()
			/* ▼今回追加 */
			/* */.loginPage("/login")
			/*    */.permitAll()
			/* ▲今回追加 */
			/* */.defaultSuccessUrl("/success")
        ;
		 // ▼今回追加
        // メッセージをカスタマイズするために、メッセージソースを設定する
        AuthenticationManager a = this.authenticationManager();
        if (a instanceof ProviderManager) {
            ProviderManager a2 = (ProviderManager)a;
            a2.getProviders().forEach(p -> {
                if (p instanceof MessageSourceAware) {
                    ((MessageSourceAware)p).setMessageSource(s);
                }
            });
        }
        // ▲今回追加
    }
}
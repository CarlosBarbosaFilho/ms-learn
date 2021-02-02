package br.com.cbgomes.hroauth.service.use_case_port.data

import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import java.util.stream.Collectors


data class OauthUserPort (
        val id: Long,
        val name: String,
        val email: String,
        val pass: String,
        val roles : List<RoleUserPort>
) : UserDetails {
    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
        return roles.stream().map { x: RoleUserPort -> SimpleGrantedAuthority(x.name) }
                .collect(Collectors.toList())
    }

    override fun isEnabled(): Boolean {
        return true;
    }

    override fun getUsername(): String {
        return this.email
    }

    override fun isCredentialsNonExpired(): Boolean {
        return true;
    }

    override fun getPassword(): String {
       return this.pass
    }

    override fun isAccountNonExpired(): Boolean {
        return true;
    }

    override fun isAccountNonLocked(): Boolean {
        return true;
    }
}

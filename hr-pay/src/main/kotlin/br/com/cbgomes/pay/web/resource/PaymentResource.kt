package br.com.cbgomes.pay.web.resource

import br.com.cbgomes.pay.web.domain.PaymentOutputPort
import br.com.cbgomes.pay.service.use_case_port.output.PaymentOutputService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.math.BigDecimal

@RestController
@RequestMapping("/api/payments")
class PaymentResource(val outputService: PaymentOutputService) {

    @GetMapping("/{id_Worker}/days/{days}")
    fun getPayment(@PathVariable("id_Worker") id_Worker: Long, @PathVariable("days") days: Int ): ResponseEntity<PaymentOutputPort>{
        return ResponseEntity
                .ok(this.outputService.getPayment(id_Worker,days))
    }
}
package br.com.cbgomes.payment.service.use_case_port.output

import br.com.cbgomes.payment.web.domain.PaymentOutputPort

interface PaymentOutputService {

    fun getPayment(worker: Long, days: Int): PaymentOutputPort
}
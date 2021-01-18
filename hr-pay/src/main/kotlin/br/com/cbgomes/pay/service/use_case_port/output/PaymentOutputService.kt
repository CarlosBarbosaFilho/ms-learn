package br.com.cbgomes.pay.service.use_case_port.output

import br.com.cbgomes.pay.web.domain.PaymentOutputPort

interface PaymentOutputService {

    fun getPayment(worker: Long, days: Int): PaymentOutputPort
}
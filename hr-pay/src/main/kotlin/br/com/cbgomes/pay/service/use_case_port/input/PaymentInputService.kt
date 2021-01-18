package br.com.cbgomes.pay.service.use_case_port.input

import br.com.cbgomes.pay.web.domain.PaymentOutputPort

interface PaymentInputService {

    fun getPayment(worker: Long, days: Int): PaymentOutputPort
}
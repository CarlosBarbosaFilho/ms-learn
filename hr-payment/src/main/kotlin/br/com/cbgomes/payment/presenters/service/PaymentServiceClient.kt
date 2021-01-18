package br.com.cbgomes.payment.presenters.service

import br.com.cbgomes.payment.web.domain.PaymentOutputPort
import br.com.cbgomes.payment.service.use_case_port.output.PaymentOutputService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class PaymentServiceClient(val restTemplate: RestTemplate,
                           @Value("\${hr-worker.host}") private val hostWorker: String,
                           @Autowired
                           val workerFeignClient: WorkerFeignClient
): PaymentOutputService {

    override fun getPayment(worker: Long, days: Int): PaymentOutputPort {
      //var worker = this.restTemplate.getForObject(this.hostWorker+"$worker", WorkerEntity::class.java )
        var worker = this.workerFeignClient.getWorkerById(id = worker).body
        return PaymentOutputPort(worker!!.name, worker.daily_income, days.toBigDecimal())
    }

}
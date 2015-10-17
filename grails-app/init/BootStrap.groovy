import br.inatel.trabec107.cris.Delivery
import grails.util.Environment

class BootStrap {

	def init = { servletContext ->
        if(Environment.current == Environment.DEVELOPMENT) {
			println "Application starting ... "
			println "now running in DEV mode. "
            createFakeData()
        }
    }

    def destroy = {
    }

    def createFakeData() {
		println "Start loading deliveries into database..."
		new Delivery(orderId: 1, clientId: 1, nameReceiver: 'Toby Tripoli', cpf: '88888888888', address: 'Rua 1, 1').save()
		new Delivery(orderId: 2, clientId: 2, nameReceiver: 'Boby Tripoli', cpf: '11111111111', address: 'Rua 2, 2').save()
		new Delivery(orderId: 3, clientId: 3, nameReceiver: 'Cris Tripoli', cpf: '22222222222', address: 'Rua 3, 3').save()
		println "Finished loading $Delivery.count deliveries into database"
    }
}

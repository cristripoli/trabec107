package br.inatel.trabec107.cris

import grails.rest.Resource

@Resource(uri='/api/delivery', formats = ['json', 'xml'])
class Delivery {

    Long id
	Long orderId
	Long clientId
    String nameReceiver
    String cpf
	Date deliveryDateTime
	String address
	String status = 'NEW'

    static constraints = {
        orderId nullable: false, blank: false
		clientId nullable: false, blank: false
		nameReceiver nullable: false, blank: false
		cpf nullable: false, blank: false, minSize:11, maxSize:11
		deliveryDateTime nullable: true
		address nullable: false, blank: false
		status nullable: false, blank: false
    }
}

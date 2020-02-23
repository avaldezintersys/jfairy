package com.devskiller.jfairy.producer.Product

import com.devskiller.jfairy.Bootstrap
import com.devskiller.jfairy.Fairy
import spock.lang.Specification

class ProductSpec extends Specification {

	def listProducts = [ "Product", "ProductName", "ProductX", "ProductY", "ProductZ" ]
	def listTypes = ["QA", "VB", "NB", "ME"]
	def listCodes = ["A", "B", "C", "D", "E", "F"]

	private Fairy fairy = Bootstrap.create()

	def setup() {
		Bootstrap.create()
	}

	def "should instantiate ProductProducer producer with product"() {
		when:
			Product product = fairy.product()
		then:
			product instanceof Product
	}

	def "should remove # in productId"() {
		expect:
		!fairy.product().productId.contains("#")
	}

	def "should contains one of those names" () {
		expect:
		listProducts.contains(fairy.product().name)
	}

	def "should contains one of those types" () {
		expect:
		listTypes.contains(fairy.product().type)
	}

	def "should contains one of those codes" () {
		expect:
		listCodes.contains(fairy.product().applicationCode)
	}


}

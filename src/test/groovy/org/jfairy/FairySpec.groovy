package org.jfairy

import spock.lang.Specification

class FairySpec extends Specification {

	def "Second person should be different without fairy instance"() {

		given:
			def person = Bootstrap.create().person();
		when:
			person = Bootstrap.create().person();
		then:
			person.fullName() != old(person.fullName())
	}

	def "Second person should be different with one fairy"() {

		given:
			def fairy = Bootstrap.create()
			def person = fairy.person();
		when:
			person = fairy.person();
		then:
			person.fullName() != old(person.fullName())
	}

	def "Second person should be the same with the same random seed"() {

		given:
			def firstFairy = Bootstrap.builder().withRandomSeed(10).build()
			def secondFairy = Bootstrap.builder().withRandomSeed(10).build()

			def firstPerson = firstFairy.person()
			def secondPerson = secondFairy.person()
			def thirdPerson = firstFairy.person()
			def fourthPerson = secondFairy.person()

		expect:
			firstPerson.fullName().equals(secondPerson.fullName())
			thirdPerson.fullName().equals(fourthPerson.fullName())

			!firstPerson.fullName().equals(thirdPerson.fullName())
	}

	def "Second person should be different with different random seeds"() {

		given:
			def firstFairy = Bootstrap.builder().withRandomSeed(10).build()
			def secondFairy = Bootstrap.builder().withRandomSeed(20).build()

			def firstPerson = firstFairy.person()
			def secondPerson = secondFairy.person();

		expect:
			!firstPerson.fullName().equals(secondPerson.fullName())
	}
}

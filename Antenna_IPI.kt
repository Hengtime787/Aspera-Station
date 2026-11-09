class Antenna {

  const val ANT_GMRS = "HengGMRS"
	const val ANT_2M = ""


	suspend fun Select(antennaID: String) {

	// I figured suspend fun is fitting,. and that I should add a return just in case the antenna doesn't switch, and you end up with a really horribhle SWR mismatch.	

	try {

		if (antennaID == Antenna_GMRS) {
		
			println("Redirecting signal to $antennaID.")

		}

		else if (antennaID == "Heng2m") {

			println("Redirecting signal to $antennaID")

		}

		else if (antennaID == "Heng1.25m") {

			println("Redirecting signal to $antennaID")

		}

		else if (antennaID == "Heng70cm") {
			println("Redirecting signal to $antennaID")
		}
		
		else {
			throw AntennaException ("Sent Antenna was not found, nor set properly.") 
		}

	
	}
	catch (e: AntennaException) {

		println("CRITICAL -- ANTENNAEXCEPTION")

	}

				


}

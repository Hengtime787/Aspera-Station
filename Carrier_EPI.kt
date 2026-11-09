// IPI stands for INTERNAL POINT OF INTEREST.

//basiclaly an IPI is an Internal API, but less limited. like a det of functions that are called with prarameterd = an IPI.
// idk, I just really like Kotlin I guess.

fun SendFreqChange(InputFrequency: Double, Slot: String) {
  // make if else if its more than the max or less than safe min dont send send a BandException or something.
  
  try {
  
    if (Slot != "A" && Slot != "B") {
      throw SlotException ("Slot isn't set as A or B.")
    } 
    
    if (Frequency in 144..148 || Frequency in 420..<460 || Frequency in 220..<260 || Frequency in 462..<468) {
      
	    // 2M BAND
	if (Frequency in 144..148) {

		
		Antenna.Select("Heng2m")
		
		Frequency.Post(InputFrequency)
		println("Attempting to post $InputFrequency, using the Heng2M antenna.")

		
	}

	else if (Frequency in 420..<460) {

		Antenna.Select("Heng70cm")
		Frequency.Post(InputFrequency)

	}

	else if (Frequency in 462..<468) {

		Antenna.Select("HengGMRS")
		Frequency.Post(InputFrequency)
	}

	else if (Frequency in 220..<260) {
		Antenna.Select("Heng1.25m")
	}
	    
    } else {

      throw BandException ("Sent frequency is not in registered 2m, 1.25m, 70cm, or gmrs range")

    }
    
    
    if (Slot == "A") {
      println("POST Frequency (the var) TO SLOT A.")
    }
    
    if (Slot == "B") {
      println("POST Frequency TO Beken.slot.A.")
    }
  
  
  }

  catch (e: SlotException) {
     println("Slot wasn't set correctly. (A/B Slots).")

  }

  catch (e: BandException) {
    println("Frequency was outside of safe band boundaries.")
  }

}

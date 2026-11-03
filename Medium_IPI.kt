// IPI stands for INTERNAL POINT OF INTEREST.

//basiclaly an IPI is an Internal API, but less limited. like a det of functions that are called with prarameterd = an IPI.
// idk, I just really like Kotlin I guess.

fun SendFreqChange(Frequency: Int, Slot: String) {
  // make if else if its more than the max or less than safe min dont send send a BandException or something.
  
  try {
  
    if (Slot !== "A" && Slot !== "B") {
      throw SlotException ("Slot isn't set as A or B.")
    } 
    
    if (Frequency in 144..148 || Frequency in 420..<460 || Frequency in 220..<260 || Frequency in 462..<468) {
      
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
}
// src/main/scala/progscala3/typelessdomore/state-capitals-subset.sc

val stateCapitals = Map(
  "Alabama" -> "Montgomery",
  "Alaska"  -> "Juneau",
  // ...
  "Wyoming" -> "Cheyenne")
    
assert(stateCapitals.get("Alabama") == Some("Montgomery"))
assert(stateCapitals.get("Wyoming") == Some("Cheyenne"))
assert(stateCapitals.get("Unknown") == None)

assert(stateCapitals.getOrElse("Alabama", "Oops1") == "Montgomery")
assert(stateCapitals.getOrElse("Wyoming", "Oops2") == "Cheyenne")
assert(stateCapitals.getOrElse("Unknown", "Oops3") == "Oops3")

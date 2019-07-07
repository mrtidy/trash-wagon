# trash-wagon
An autonomous vehicle to hold and then weekly deliver trash to the curb.

# Physical Design
The initial physical design is based on the Sandcrawler from Star Wars ( https://starwars.fandom.com/wiki/Sandcrawler / https://en.wikipedia.org/wiki/Sandcrawler ).  We would like the machine to be big enough to hold up to 6 heavy duty 33 gallon trash bags.  The trash wagon needs to be strong enough to move itself and up to 210 lbs of trash from the house out to the side of the road.

# Autonomous Behavior
The trash wagon will be given a day-of-the-week and time to have the trash out to the side of the road and it will take care of delivering the bags and returning to its home.  The trash wagon should check a calendar at the beginning of each week to determine if there is a government holiday and on weeks that there is a holiday it should ask whether delivery should be delayed by a day.  If the trash wagon has any doubts about correct delivery or moving safely it should post a message with telemetry, its concern, and then do its best to continue or return to its home.

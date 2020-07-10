package _01_race_car;
/*hello
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */

		// 1. Create a RaceCar and place it in 5th position
		RaceCar car = new RaceCar("Acura NSX", 5);
		// 2. Print the RaceCar's position in the race
		car.getPositionInRace();
		car.damaged = true;

		// 3. Crash the RaceC

		// 4. If the car is damaged. Bring it in for a pit stop.
		if (car.damaged == true) {
			car.pit();
		}
		// 5. Help the car move into first place.
		for (int i = 0; i < 4; i++) {
			car.overtake();
		}
	}
}

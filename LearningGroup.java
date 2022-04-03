package Testing;

import org.testng.annotations.Test;

public class LearningGroup {
@Test(groups="insane")
	public void run() {
		System.out.println("dog is chasing");
	}
@Test(dependsOnGroups="insane")
	public void stop() {
		System.out.println("looking for the help");
	}
	@Test(groups="insane")
	public void dog() {
		System.out.println("insane condition of dog");
	}
}


public class Watashi6 {

	public static void main(String[] args) {
		FriendRobot robot =new FriendRobot();
		
		String message1 =robot.sayHelloByHour(8);
		String message2 =robot.sayHelloByHour(14);
		String message3 =robot.sayHelloByHour(20);
		
		System.out.println(message1);
		System.out.println(message2);
		System.out.println(message3);
	}

}

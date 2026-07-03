
public class Watashi7 {

	public static void main(String[] args) {
		FriendRobot robot =new FriendRobot();
		
		String timeMessage=robot.sayHelloByHour(10);
		System.out.println(timeMessage);
		
		String nameMessage=robot.sayHelloTo("後藤");
		System.out.println(nameMessage);
		
		int wallet =0;
		wallet+=robot.giveMoneyTimes(2);
		System.out.println("財布の中身："+wallet+"円");
		wallet+=robot.giveMoneyTimes(4);
		System.out.println("財布の中身："+wallet+"円");
		
	}

}


public class Watashi3 {

	public static void main(String[] args) {
		FriendRobot robot =new FriendRobot();
		
		String message=robot.sayHello("後藤");
		System.out.println(message);
		
		int wallet =0;
		
		wallet+=robot.giveMoney(2);
		System.out.println("財布の中身："+wallet+"円");
		wallet+=robot.giveMoney(3);
		System.out.println("財布の中身："+wallet+"円");
		wallet+=robot.giveMoney(4);
		System.out.println("財布の中身："+wallet+"円");
	}

}

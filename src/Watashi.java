
public class Watashi {

	public static void main(String[] args) {
		FriendRobot robot =new FriendRobot();
		
		int wallet =0;
		
		wallet+=robot.giveMoney(2);
		System.out.println("財布の中身："+wallet+"円");
		wallet+=robot.giveMoney(4);
		System.out.println("財布の中身："+wallet+"円");
		wallet+=robot.giveMoney(6);
		System.out.println("財布の中身："+wallet+"円");
	}

}

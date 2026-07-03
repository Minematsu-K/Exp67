class FriendRobot {
	String sayHelloByHour(int hour) {
		if(hour<12) {
			return "おはようございます！";
		}else if(hour<18) {
			return "こんにちは！";
		}else {
			return "こんばんは！";
		}
	}
	String sayHelloTo(String sayName) {
		return sayName+"さん、こんにちは！";
	}
	String sayHello(String sayName) {
		return sayName+"さん、こんにちは！";
	}
	
	int giveMoneyTimes(int count) {
		return 500*count;
	}
	int giveMoney(int count) {
		return 500*count;
	}
}

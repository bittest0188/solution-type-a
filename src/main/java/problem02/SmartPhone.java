package problem02;

public class SmartPhone extends MusicPhone {
	
	public String runApp() {	
		return "앱실행";
	}

	@Override
	public void execute(String function) {
		// TODO Auto-generated method stub
		if (function.equals("앱")) {
			System.out.println(runApp());
			return;
		}
		super.execute(function);

	}

	@Override
	public String playMusic() {
		// TODO Auto-generated method stub
		return "스트리밍";
	}

	@Override
	public String call() {
		// TODO Auto-generated method stub
		return super.call();
	}
	
	
}
package Question01;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Light livingRoomLight = new LivingRoomLight();
		Light kitchenLight = new KitchenLight();
		
		Command lightOnCommand = new LightOnCommand(livingRoomLight);
		lightOnCommand.execute();
		Command lightOffCommand = new LightOffCommand(livingRoomLight);
		lightOffCommand.execute();
		
		Command lightOnCommand1 = new LightOnCommand(kitchenLight);
		lightOnCommand1.execute();
		Command lightOffCommand1 = new LightOffCommand(kitchenLight);
		lightOffCommand1.execute();
		

	}

}

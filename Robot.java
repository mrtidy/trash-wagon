import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

public class Robot {
    private VictorSPX leftMotor = new VictorSPX(0);
    private VictorSPX rightMotor = new VictorSPX(2);

    public static void main(String[] args) throws InterruptedException {
        try {
            Robot robot = new Robot();
            robot.leftMotor.set(ControlMode.PercentOutput, 0);
            robot.leftMotor.setInverted(true);
	    Thread.sleep(2000);
            robot.leftMotor.set(ControlMode.PercentOutput, .2);
        } catch(RuntimeException e) {
            System.out.println("Unexpected runtime exception: " + e);
        } catch(Exception e) {
            System.out.println("Unexpected exception: " + e);
        }
    }
}

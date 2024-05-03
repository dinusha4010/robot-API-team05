package data;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="obstacale")
public class Obstacale {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	private int StepOneLeftMotorSpeed;
	private int StepOneRightMotorSpeed;
	private int StepOneTimeDelay;
	private int StepTwoLeftMotorSpeed;
	private int StepTwoRightMotorSpeed;
	private int StepTwoTimeDelay;
	private int StepThreeLeftMotorSpeed;
	private int StepThreeRightMotorSpeed;
	private int StepThreeTimeDelay;
	private int StepFourLeftMotorSpeed;
	private int StepFourRightMotorSpeed;
	private int StepFourTimeDelay;
	private int ObtacalCount;
	private int ObtacaDistance;
	
	
	@Override
	public String toString() {
		return "#"+ Id + "#" + StepOneLeftMotorSpeed + "#"
				+ StepOneRightMotorSpeed + "#" + StepOneTimeDelay + "#"
				+ StepTwoLeftMotorSpeed +"#" + StepTwoRightMotorSpeed +"#"
				+ StepTwoTimeDelay +"#" + StepThreeLeftMotorSpeed
				+ "#" + StepThreeRightMotorSpeed +"#"
				+ StepThreeTimeDelay + "#"+ StepFourLeftMotorSpeed
				+ "#"+ StepFourRightMotorSpeed + "#" + StepFourTimeDelay
				+"#" + ObtacalCount + "#" + ObtacaDistance + "#";
	}
	public Obstacale() {
		super();
	}
	public Obstacale(int id, int stepOneLeftMotorSpeed, int stepOneRightMotorSpeed, int stepOneTimeDelay,
			int stepTwoLeftMotorSpeed, int stepTwoRightMotorSpeed, int stepTwoTimeDelay, int stepThreeLeftMotorSpeed,
			int stepThreeRightMotorSpeed, int stepThreeTimeDelay, int stepFourLeftMotorSpeed,
			int stepFourRightMotorSpeed, int stepFourTimeDelay, int obtacalCount, int obtacaDistance) {
		super();
		Id = id;
		StepOneLeftMotorSpeed = stepOneLeftMotorSpeed;
		StepOneRightMotorSpeed = stepOneRightMotorSpeed;
		StepOneTimeDelay = stepOneTimeDelay;
		StepTwoLeftMotorSpeed = stepTwoLeftMotorSpeed;
		StepTwoRightMotorSpeed = stepTwoRightMotorSpeed;
		StepTwoTimeDelay = stepTwoTimeDelay;
		StepThreeLeftMotorSpeed = stepThreeLeftMotorSpeed;
		StepThreeRightMotorSpeed = stepThreeRightMotorSpeed;
		StepThreeTimeDelay = stepThreeTimeDelay;
		StepFourLeftMotorSpeed = stepFourLeftMotorSpeed;
		StepFourRightMotorSpeed = stepFourRightMotorSpeed;
		StepFourTimeDelay = stepFourTimeDelay;
		ObtacalCount = obtacalCount;
		ObtacaDistance = obtacaDistance;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getStepOneLeftMotorSpeed() {
		return StepOneLeftMotorSpeed;
	}
	public void setStepOneLeftMotorSpeed(int stepOneLeftMotorSpeed) {
		StepOneLeftMotorSpeed = stepOneLeftMotorSpeed;
	}
	public int getStepOneRightMotorSpeed() {
		return StepOneRightMotorSpeed;
	}
	public void setStepOneRightMotorSpeed(int stepOneRightMotorSpeed) {
		StepOneRightMotorSpeed = stepOneRightMotorSpeed;
	}
	public int getStepOneTimeDelay() {
		return StepOneTimeDelay;
	}
	public void setStepOneTimeDelay(int stepOneTimeDelay) {
		StepOneTimeDelay = stepOneTimeDelay;
	}
	public int getStepTwoLeftMotorSpeed() {
		return StepTwoLeftMotorSpeed;
	}
	public void setStepTwoLeftMotorSpeed(int stepTwoLeftMotorSpeed) {
		StepTwoLeftMotorSpeed = stepTwoLeftMotorSpeed;
	}
	public int getStepTwoRightMotorSpeed() {
		return StepTwoRightMotorSpeed;
	}
	public void setStepTwoRightMotorSpeed(int stepTwoRightMotorSpeed) {
		StepTwoRightMotorSpeed = stepTwoRightMotorSpeed;
	}
	public int getStepTwoTimeDelay() {
		return StepTwoTimeDelay;
	}
	public void setStepTwoTimeDelay(int stepTwoTimeDelay) {
		StepTwoTimeDelay = stepTwoTimeDelay;
	}
	public int getStepThreeLeftMotorSpeed() {
		return StepThreeLeftMotorSpeed;
	}
	public void setStepThreeLeftMotorSpeed(int stepThreeLeftMotorSpeed) {
		StepThreeLeftMotorSpeed = stepThreeLeftMotorSpeed;
	}
	public int getStepThreeRightMotorSpeed() {
		return StepThreeRightMotorSpeed;
	}
	public void setStepThreeRightMotorSpeed(int stepThreeRightMotorSpeed) {
		StepThreeRightMotorSpeed = stepThreeRightMotorSpeed;
	}
	public int getStepThreeTimeDelay() {
		return StepThreeTimeDelay;
	}
	public void setStepThreeTimeDelay(int stepThreeTimeDelay) {
		StepThreeTimeDelay = stepThreeTimeDelay;
	}
	public int getStepFourLeftMotorSpeed() {
		return StepFourLeftMotorSpeed;
	}
	public void setStepFourLeftMotorSpeed(int stepFourLeftMotorSpeed) {
		StepFourLeftMotorSpeed = stepFourLeftMotorSpeed;
	}
	public int getStepFourRightMotorSpeed() {
		return StepFourRightMotorSpeed;
	}
	public void setStepFourRightMotorSpeed(int stepFourRightMotorSpeed) {
		StepFourRightMotorSpeed = stepFourRightMotorSpeed;
	}
	public int getStepFourTimeDelay() {
		return StepFourTimeDelay;
	}
	public void setStepFourTimeDelay(int stepFourTimeDelay) {
		StepFourTimeDelay = stepFourTimeDelay;
	}
	public int getObtacalCount() {
		return ObtacalCount;
	}
	public void setObtacalCount(int obtacalCount) {
		ObtacalCount = obtacalCount;
	}
	public int getObtacaDistance() {
		return ObtacaDistance;
	}
	public void setObtacaDistance(int obtacaDistance) {
		ObtacaDistance = obtacaDistance;
	}
	
	
	
}
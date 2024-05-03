package data;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="followpath")
public class FollowPath {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	private int targetIntensityRange;
	private int minIntensity;
	private int maxIntensity;
	private int LeftMotorSpeed;
	private int RightMotorSpeed;
	
	
	public FollowPath(int leftMotorSpeed, int rightMotorSpeed) {
		super();
		LeftMotorSpeed = leftMotorSpeed;
		RightMotorSpeed = rightMotorSpeed;
	}
	public FollowPath() {
		super();
	}
	public FollowPath(int id, int targetIntensityRange, int minIntensity, int maxIntensity, int leftMotorSpeed,
			int rightMotorSpeed) {
		super();
		this.Id = id;
		this.targetIntensityRange = targetIntensityRange;
		this.minIntensity = minIntensity;
		this.maxIntensity = maxIntensity;
		this.LeftMotorSpeed = leftMotorSpeed;
		this.RightMotorSpeed = rightMotorSpeed;
	}
	
	
	
	   
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id = id;
	}
	public int getTargetIntensityRange() {
		return targetIntensityRange;
	}
	public void setTargetIntensityRange(int targetIntensityRange) {
		this.targetIntensityRange = targetIntensityRange;
	}
	public int getMinIntensity() {
		return minIntensity;
	}
	public void setMinIntensity(int minIntensity) {
		this.minIntensity = minIntensity;
	}
	public int getMaxIntensity() {
		return maxIntensity;
	}
	public void setMaxIntensity(int maxIntensity) {
		this.maxIntensity = maxIntensity;
	}
	public int getLeftMotorSpeed() {
		return LeftMotorSpeed;
	}
	public void setLeftMotorSpeed(int leftMotorSpeed) {
		LeftMotorSpeed = leftMotorSpeed;
	}
	public int getRightMotorSpeed() {
		return RightMotorSpeed;
	}
	public void setRightMotorSpeed(int rightMotorSpeed) {
		RightMotorSpeed = rightMotorSpeed;
	}
	@Override
	public String toString() {
	    return"#" + Id + "#" + targetIntensityRange + "#" + minIntensity + "#" + maxIntensity + "#" + LeftMotorSpeed + "#" + RightMotorSpeed+ "#";
	}

	
	
	
	
	
	
	
	
	
}
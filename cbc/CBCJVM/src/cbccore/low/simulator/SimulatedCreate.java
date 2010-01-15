package cbccore.low.simulator;

import cbccore.low.Create;
import cbccore.CBCSimulator;
import cbccore.NotImplemented;

public class SimulatedCreate extends Create {
	
	protected CBCSimulator cbc;
	
	protected boolean connected;
	
	public double radiansPerSecond;
	public double forwardSpeed;
	public double width;
	
	public SimulatedCreate(CBCSimulator c) {
		cbc = c;
	}
	
	public int create_connect() {
		return 0;	
	}
	
	public void create_disconnect()  {
		connected = false;
	}
	
	@NotImplemented public void create_start() {
		//stub
	}
	
	@NotImplemented public void create_passive() {
		//stub
	}
	
	@NotImplemented public void create_safe() {
		//stub
	}
	
	@NotImplemented public void create_full() {
		//stub
	}
	
	@NotImplemented public void create_spot() {
		//stub
	}
	
	@NotImplemented public void create_cover() {
		//stub
	}
	
	@NotImplemented public void create_demo(int d) {
		//stub
	}
	
	@NotImplemented public void create_cover_dock() {
		//stub
	}
	
	public int create_mode() {
		return 3;
	}
	
	// Don't use these, they update inaccessable variables
	public int create_sensor_update() { return 0; }
	public int create_wall() { return 0; }
	public int create_buttons() { return 0; }
	public int create_bumpdrop() { return 0; }
	public int create_cliffs() { return 0; }
	public int create_angle() { return 0; }
	public int create_distance() { return 0; }
	public int create_velocity() { return 0; }
	public int create_read_IR() { return 0; }
	public int create_overcurrents() { return 0; }
	public int create_battery_charge() { return 0; }
	public int create_cargo_bay_inputs() { return 0; }
	//*/
	 
	public void create_stop() {
		create_drive_straight(0);
	}
	
	@NotImplemented public void create_drive (int speed, int radius) {
		
	}
	
	public void create_drive_straight (int speed) {
		radiansPerSecond = 0;
		forwardSpeed = speed/10.;
	}
	
	@NotImplemented public void create_spin_CW (int speed) {
		//stub
	}
	
	@NotImplemented public void create_spin_CCW (int speed) {
		//stub
	}
	
	@NotImplemented public void create_drive_direct(int r_speed, int l_speed) {
		//stub
	}
	
	@NotImplemented public int create_spin_block(int speed, int angle) {
		return 0; //stub
	}
	// public int _create_get_raw_encoders(long* lenc, long* renc) {
	@NotImplemented public void create_advance_led(int on) {
		//stub
	}
	
	@NotImplemented public void create_play_led(int on) {
		//stub
	}
	
	@NotImplemented public void create_power_led(int color, int brightness) {
		//stub
	}
	
	@NotImplemented public void create_digital_output(int bits) {
		//stub
	}
	
	@NotImplemented public void create_pwm_low_side_drivers(int pwm2, int pwm1, int pwm0) {
		//stub
	}
	
	@NotImplemented public void create_low_side_drivers(int pwm2, int pwm1, int pwm0) {
		//stub
	}
	
	@NotImplemented public void create_load_song(int num) {
		//stub
	}
	
	@NotImplemented public void create_play_song(int num) {
		//stub
	}
	// public int create_read_block(char* data, int count) {
	@NotImplemented public void create_write_byte(char write_byte) {
		//stub
	}
	
	@NotImplemented public void create_clear_serial_buffer() {
		//stub
	}
}

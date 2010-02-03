/*
 * This file is part of CBCJVM.
 * CBCJVM is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * CBCJVM is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with CBCJVM.  If not, see <http://www.gnu.org/licenses/>.
*/

package cbccore.movement;

import cbccore.Device;
import cbccore.InvalidValueException;

/**
 * 
 * @author Benjamin Woodruff
 */

public class CreateDriveTrain extends DriveTrain {
	
	private static final double trainWidth = 27.0;
	//private static final double wheelCircumference = 10.;
	private double efficiency;
	//private double leftCmps = 0.;
	//private double rightCmps = 0.;
	private cbccore.low.Create create = Device.getLowCreateController();
	
	public void moveAtCmps(double cmps) {
		directDrive(cmps, cmps);
	}
	
	public CreateDriveTrain(double efficiency, boolean fullMode) {
		Device.getLowCreateController().create_connect();
		this.efficiency = efficiency;
		// FIXME: This should be moved to it's own method
		if(fullMode) {
			create.create_full(); 
		} else {
			create.create_safe(); 
		}
	}
	
	protected void directDrive(double leftCmps, double rightCmps) {
		create.create_drive_direct((int)(rightCmps*10.), (int)(leftCmps*10.));
	}
	
	/**
	 * The create has no freeze api. So this essentially calls <code>kill()</code>
	 * 
	 * @see      #kill
	 */
	public void freeze() {
		kill(); //no such api
	}
	
	protected double getLeftMaxCmps() {
		return 50.*efficiency;
	}
	
	protected double getRightMaxCmps() {
		return 50.*efficiency;
	}
	
	public double getTrainWidth() {
		return trainWidth;
	}
}

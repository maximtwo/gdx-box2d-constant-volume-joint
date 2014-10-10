package com.badlogic.gdx.physics.box2d.joints;

import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.JointDef;
import com.badlogic.gdx.utils.Array;

public class ConstantVolumeJointDef extends JointDef {

	public final Array<Body> bodies;
	
	public ConstantVolumeJointDef() {
		this.type = JointType.ConstantVolumeJoint;
		
		bodies = new Array<Body>();
	}
	
	public void addBody(Body body) {
		
		bodies.add(body);
		
		if(bodies.size == 1) {
			bodyA = body;
		}
		else if(bodies.size == 2) {
			bodyB = body;
		}
	}

}

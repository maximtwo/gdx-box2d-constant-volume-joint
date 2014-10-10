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

	@Override
	public org.jbox2d.dynamics.joints.JointDef toJBox2d () {

		org.jbox2d.dynamics.joints.ConstantVolumeJointDef jd = new org.jbox2d.dynamics.joints.ConstantVolumeJointDef();
		jd.bodyA = bodyA.body;
		jd.bodyB = bodyB.body;
		jd.collideConnected = collideConnected;
		jd.type = org.jbox2d.dynamics.joints.JointType.CONSTANT_VOLUME;
		
		for(int i = 0; i < bodies.size; i++) {
			
			jd.addBody(bodies.get(i).body);
		}
		
		return jd;
	}

}

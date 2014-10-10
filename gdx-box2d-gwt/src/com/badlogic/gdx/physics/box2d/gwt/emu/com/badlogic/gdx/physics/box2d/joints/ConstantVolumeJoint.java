package com.badlogic.gdx.physics.box2d.joints;

import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.Joint;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.utils.Array;

public class ConstantVolumeJoint extends Joint {
	
	private org.jbox2d.dynamics.joints.ConstantVolumeJoint joint;
	private Array<Body> bodies;
	
	public ConstantVolumeJoint (World world, org.jbox2d.dynamics.joints.ConstantVolumeJoint joint, Array<Body> bodies) {
		super(world, joint);
		this.joint = joint;
		this.bodies = bodies;
	}
	
	public Array<Body> getBodies() {
		return bodies;
	}
	
	public void inflate(float factor) {
		joint.inflate(factor);
	}

}

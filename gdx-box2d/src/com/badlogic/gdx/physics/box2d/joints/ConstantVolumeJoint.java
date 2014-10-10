package com.badlogic.gdx.physics.box2d.joints;

import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.Joint;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.utils.Array;

public class ConstantVolumeJoint extends Joint {	
	// @off
	/*JNI
#include <Box2D/Box2D.h>
	 */
	
	private Array<Body> bodies;

	public ConstantVolumeJoint(World world, long addr, Array<Body> bodies) {
		super(world, addr);
		this.bodies = bodies;
	}
	
	public Array<Body> getBodies() {
		return bodies;
	}
	
	public void inflate(float factor) {
		jniInflate(addr, factor);
	}
	
	private native void jniInflate(long addr, float factor); /*
		b2ConstantVolumeJoint* joint = (b2ConstantVolumeJoint*)addr;
		joint->inflate(factor);		
	*/
	
}

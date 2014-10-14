#include <com.badlogic.gdx.physics.box2d.joints.ConstantVolumeJoint.h>

//@line:10

#include <Box2D/Box2D.h>
	 JNIEXPORT void JNICALL Java_com_badlogic_gdx_physics_box2d_joints_ConstantVolumeJoint_jniInflate(JNIEnv* env, jobject object, jlong addr, jfloat factor) {


//@line:29

		b2ConstantVolumeJoint* joint = (b2ConstantVolumeJoint*)addr;
		joint->Inflate(factor);		
	

}


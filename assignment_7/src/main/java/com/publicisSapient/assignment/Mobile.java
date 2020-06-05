package com.publicisSapient.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	private Camera camera;
	private Screen screen;
	private Speaker speaker;

	ApplicationContext factory;

	public Camera getCam() {
		return camera;
	}

	public void setCam(Camera camera) {
		this.camera = camera;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public Speaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	void printSpecifications() {
		System.out.println("Camera megapixels    : " + camera.getMegaPixels());
		System.out.println("Screen dimensions    : " + screen.getLen() + "x" + screen.getBre());
		System.out.println("Speaker type         : " + speaker.getSpeakerType());
		System.out.println("Speaker Volume Level : " + speaker.getVolumeLevel());
	}

}

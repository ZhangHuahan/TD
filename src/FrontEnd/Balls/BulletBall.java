package FrontEnd.Balls;

import java.awt.image.BufferedImage;

import Helpers.Config;

public abstract class BulletBall extends ActiveBall {
	Ball target;
	String imagePath;
	int damage;

	public BulletBall(int x, int y, Ball ball, String imagePath) {
		super(x, y, 10, 10, 1, imagePath);
		this.setTarget(ball);
	}

	public abstract boolean shoot();
	public BufferedImage getImage() {
		return null;
	}

	public Ball getTarget() {
		return target;
	}

	public void setTarget(Ball target) {
		this.target = target;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

}
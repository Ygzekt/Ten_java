package javaQ5;

public class Cuboid {

	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	public int getCuvoidVolume() {
		return getW()*getH()*z;
	}
}
